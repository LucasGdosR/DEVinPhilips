package com.example.m2s11.controllers;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Void> trataErro404() {
        return ResponseEntity.notFound().build();
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> trataErro400() {
        return ResponseEntity.badRequest().body("argumentos inválidos");
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> trataErro500() {
        return ResponseEntity.internalServerError().body("cagamos o pau");
    }
}
