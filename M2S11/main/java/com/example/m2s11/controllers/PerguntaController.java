package com.example.m2s11.controllers;

import com.example.m2s11.entities.Pergunta;
import com.example.m2s11.repositories.PerguntaRepository;
import com.example.m2s11.services.PerguntaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("perguntas")
public class PerguntaController {
    private final PerguntaService service;

    public PerguntaController(PerguntaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pergunta> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Pergunta findById(@PathVariable Integer id) {
        return service.findById(id);
    }
}
