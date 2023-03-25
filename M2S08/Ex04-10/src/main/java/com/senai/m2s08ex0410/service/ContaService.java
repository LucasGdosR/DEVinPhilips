package com.senai.m2s08ex0410.service;

import com.senai.m2s08ex0410.model.ClienteModel;
import com.senai.m2s08ex0410.model.ContaModel;
import com.senai.m2s08ex0410.model.TransferResponse;
import com.senai.m2s08ex0410.repository.ContaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {
    private final ContaRepository contaRepository;

    public ContaService(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    public ContaModel save(ClienteModel clienteModel) {
        ContaModel contaModel = new ContaModel();
        contaModel.setSaldo(0d);
        contaModel.setClienteModel(clienteModel);
        return contaRepository.save(contaModel);
    }

    public ContaModel findById(Long id) {
        return contaRepository.findById(id).get();
    }

    public List<ContaModel> findAll() {
        return contaRepository.findAll();
    }

    public void deleteById(Long id) {
        contaRepository.deleteById(id);
    }

    public void editById(Long id, ContaModel updatedConta) {
        ContaModel oldConta = contaRepository.findById(id).get();
        oldConta.setClienteModel(updatedConta.getClienteModel());
        oldConta.setSaldo(updatedConta.getSaldo());
    }

    public Boolean withdraw(Long id, Double value) {
        ContaModel contaModel = contaRepository.findById(id).get();
        Double saldo = contaModel.getSaldo();
        if (saldo >= value) {
            contaModel.setSaldo(saldo - value);
            return true;
        }
        return false;
    }

    public Boolean deposit(Long id, Double value) {
        return withdraw(id, -value);
    }

    public TransferResponse transfer(Long emissorId, Long receptorId, Double value) {
        ContaModel emissor = contaRepository.findById(emissorId).get();
        Double saldoEmissor = emissor.getSaldo();
        if (value > saldoEmissor)
            throw new RuntimeException("Saldo insuficiente.");

        ContaModel receptor = contaRepository.findById(receptorId).get();
        Double saldoReceptor = receptor.getSaldo();

        emissor.setSaldo(saldoEmissor - value);
        receptor.setSaldo(saldoReceptor + value);

        return new TransferResponse(emissor.getSaldo(), receptor.getSaldo());
    }
}
