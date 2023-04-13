package com.example.m2s11.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resposta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String texto;
    @OneToOne
    Pergunta pergunta;
}
