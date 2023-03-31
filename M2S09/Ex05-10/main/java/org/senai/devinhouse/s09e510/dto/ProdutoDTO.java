package org.senai.devinhouse.s09e510.dto;

import lombok.Data;

@Data
public class ProdutoDTO {
    private String nome;
    private String descricao;
    private Double preco;
    private CategoriaDTO categoria;
}
