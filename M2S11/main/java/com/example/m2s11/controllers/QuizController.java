package com.example.m2s11.controllers;

import com.example.m2s11.entities.Quiz;
import com.example.m2s11.services.QuizService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("quizes")
public class QuizController {
    private final QuizService service;

    public QuizController(QuizService service) {
        this.service = service;
    }

    @GetMapping
    public List<Quiz> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Quiz findById(@PathVariable Integer id) {
        return service.findById(id);
    }
}
