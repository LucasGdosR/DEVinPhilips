package com.example.m2s11.controllers;

import com.example.m2s11.entities.Resposta;
import com.example.m2s11.services.RespostaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("respostas")
public class RespostaController {
    private final RespostaService service;

    public RespostaController(RespostaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Resposta> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Resposta findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @GetMapping(params = "pergunta")
    public List<Resposta> findByPerguntaId(@PathVariable Integer id) {
        return service.findByPerguntaId(id);
    }
}
