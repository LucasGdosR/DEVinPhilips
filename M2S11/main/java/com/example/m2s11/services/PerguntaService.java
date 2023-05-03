package com.example.m2s11.services;

import com.example.m2s11.entities.Pergunta;
import com.example.m2s11.repositories.PerguntaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerguntaService {
    private final PerguntaRepository repository;

    public PerguntaService(PerguntaRepository repository) {
        this.repository = repository;
    }

    public List<Pergunta> findAll() {
        return repository.findAll();
    }

    public Pergunta findById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    public List<Pergunta> findByQuizId(Integer id) {
        return repository.findByQuizId(id);
    }

    public Pergunta save(Pergunta pergunta) {
        return repository.save(pergunta);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
