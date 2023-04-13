package com.example.m2s11.services;

import com.example.m2s11.entities.Resposta;
import com.example.m2s11.repositories.RespostaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RespostaService {
    private final RespostaRepository repository;

    public RespostaService(RespostaRepository repository) {
        this.repository = repository;
    }

    public List<Resposta> findAll() {
        return repository.findAll();
    }

    public Resposta findById(Integer id) {
        return repository.findById(id).orElseThrow();
    }
}
