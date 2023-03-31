package org.senai.devinhouse.s09e510.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ClienteDTO {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
}
