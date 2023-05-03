package com.senai.m2s08ex0410.controller;

import com.senai.m2s08ex0410.model.ClienteModel;
import com.senai.m2s08ex0410.service.ClienteService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cliente")
@RestController
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public ClienteModel add(@RequestBody @Validated ClienteModel clienteModel) {
        return clienteService.save(clienteModel);
    }

    @GetMapping(params="id")
    public ClienteModel findById(@RequestParam Long id) {
        return clienteService.findById(id);
    }

    @GetMapping
    public List<ClienteModel> findAll() {
        return clienteService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        clienteService.deleteById(id);
    }

    @PutMapping("/{id}")
    public void editById(@PathVariable Long id, @RequestBody @Validated ClienteModel updatedCliente) {
        clienteService.editById(id, updatedCliente);
    }
}
