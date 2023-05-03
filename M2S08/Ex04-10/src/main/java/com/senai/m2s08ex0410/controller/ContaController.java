package com.senai.m2s08ex0410.controller;

import com.senai.m2s08ex0410.model.ClienteModel;
import com.senai.m2s08ex0410.model.ContaModel;
import com.senai.m2s08ex0410.model.TransferResponse;
import com.senai.m2s08ex0410.service.ContaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/conta")
@RestController
public class ContaController {
    private final ContaService contaService;

    public ContaController(ContaService contaService) {
        this.contaService = contaService;
    }

    @PostMapping
    public ContaModel save(@RequestBody ClienteModel clienteModel) {
        return contaService.save(clienteModel);
    }

    @GetMapping(params="id")
    public ContaModel findById(@RequestParam Long id) {
        return contaService.findById(id);
    }

    @GetMapping
    public List<ContaModel> findAll() {
        return contaService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        contaService.deleteById(id);
    }

    @PutMapping("/{id}")
    public void editById(@PathVariable Long id, @RequestBody ContaModel updatedCliente) {
        contaService.editById(id, updatedCliente);
    }

    @PutMapping("/operacao")
    public Boolean withdraw(@RequestParam Long id, @RequestParam Double value, @RequestParam String operacao) {
        if (operacao.equals("saque"))
            return contaService.withdraw(id, value);
        else if (operacao.equals("deposito"))
            return contaService.deposit(id, value);
        return false;
    }

    @PutMapping("/transfere")
    public TransferResponse transfer(@RequestParam Long emissor, @RequestParam Long receptor, @RequestParam Double value) {
        return contaService.transfer(emissor, receptor, value);
    }
}
