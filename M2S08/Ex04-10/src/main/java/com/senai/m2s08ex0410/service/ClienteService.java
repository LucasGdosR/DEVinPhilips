package com.senai.m2s08ex0410.service;

import com.senai.m2s08ex0410.repository.ClienteRepository;
import com.senai.m2s08ex0410.model.ClienteModel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.server.ServerErrorException;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public ClienteModel save(ClienteModel clienteModel) {
        try{
            return clienteRepository.save(clienteModel);
        } catch (Exception e) {
            throw new ServerErrorException("Atributos incompatíveis", e);
        }
    }

    public List<ClienteModel> findAll() {
        return clienteRepository.findAll();
    }

    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }

    public void editById(Long id, ClienteModel updatedCliente) {
        ClienteModel oldCliente = clienteRepository.findById(id).get();
        oldCliente.setNome(updatedCliente.getNome());
        oldCliente.setCpf(updatedCliente.getCpf());
    }

    public ClienteModel findById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }


}
