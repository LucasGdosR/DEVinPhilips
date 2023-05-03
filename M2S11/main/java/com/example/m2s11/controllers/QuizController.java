package com.example.m2s11.controllers;

import com.example.m2s11.entities.Quiz;
import com.example.m2s11.services.QuizService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Quiz save(@RequestBody Quiz quiz) {
        return service.save(quiz);
    }

    @PutMapping
    public Quiz update(@RequestBody Quiz quiz) {
        return service.save(quiz);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
