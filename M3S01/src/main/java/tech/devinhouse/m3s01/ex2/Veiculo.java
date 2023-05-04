package tech.devinhouse.m3s01.ex2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Veiculo {
    @Id
    private String placa;
    private String tipo;
    private String cor;
    private Integer anoDeFabricacao;
    private Integer qtdMultas;
}
