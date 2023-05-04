package tech.devinhouse.m3s01.ex2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Veiculo {
    @Id
    private String placa;
    private String tipo;
    private String cor;
    private Integer anoDeFabricacao;
    private Integer qtdMultas;
}
