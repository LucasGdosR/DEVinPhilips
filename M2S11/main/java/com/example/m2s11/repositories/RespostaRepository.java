package com.example.m2s11.repositories;

import com.example.m2s11.entities.Resposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RespostaRepository extends JpaRepository<Resposta, Integer> {
    List<Resposta> findByPerguntaId(Integer id);
}
