package com.example.m2s11.repositories;

import com.example.m2s11.entities.Pergunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerguntaRepository extends JpaRepository<Pergunta, Integer> {
    List<Pergunta> findByQuizId(Integer id);
}
