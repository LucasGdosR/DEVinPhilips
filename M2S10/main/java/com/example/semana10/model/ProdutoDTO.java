package com.example.semana10.model;

import java.time.LocalDate;

public record ProdutoDTO(String nome, String descricao, LocalDate dataDeLancamento, Double preco) {
}
