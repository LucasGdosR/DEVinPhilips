package com.example.m2s11.services;

import com.example.m2s11.entities.Quiz;
import com.example.m2s11.repositories.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    private final QuizRepository repository;

    public QuizService(QuizRepository repository) {
        this.repository = repository;
    }

    public List<Quiz> findAll() {
        return repository.findAll();
    }

    public Quiz findById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    public Quiz save(Quiz quiz) {
        return repository.save(quiz);
    }

    public void delete(Integer id) {
            repository.deleteById(id);
    }
}
