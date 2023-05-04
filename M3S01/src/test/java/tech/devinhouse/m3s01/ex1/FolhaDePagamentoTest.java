package tech.devinhouse.m3s01.ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FolhaDePagamentoTest {
    private final FolhaDePagamento folhaDePagamento = new FolhaDePagamento();

    @Test
    @DisplayName("Quando gerente, deve ter 30% de aumento")
    public void calcularSalarioBruto_gerente() {
        Assertions.assertEquals(130d, folhaDePagamento.calcularSalarioBruto(100d,0d,"gerente"));
    }
    @Test
    @DisplayName("Quando gratificação null, não quebra")
    public void calcularSalarioBruto_gratificacaoNull() {
        Assertions.assertDoesNotThrow(() -> folhaDePagamento.calcularSalarioBruto(100d, null, "funcao"));
    }

    @Test
    @DisplayName("Quando tem gratificacao, ela é somada")
    public void calcularSalarioBruto_gratificacaoSomada() {
        Assertions.assertEquals(1010d,folhaDePagamento.calcularSalarioBruto(1000d, 10d, "funcao"));
    }

    @Test
    @DisplayName("Quando gerente tem gratificação, ela é multiplicada")
    public void calcularSalarioBruto_gratificacaoGerente() {
        Assertions.assertEquals(143d, folhaDePagamento.calcularSalarioBruto(100d, 10d, "gerente"));
    }

    @Test
    @DisplayName("Quando não tem desconto, retorna mesmo valor")
    public void calcularSalarioLiquido_semDesconto() {
        Assertions.assertEquals(100d, folhaDePagamento.calcularSalarioLiquido(100d, List.of()));
    }

    @Test
    @DisplayName("Quando tem 2 descontos, desconta os dois")
    public void calcularSalarioLiquido_comDoisDescontos() {
        Assertions.assertEquals(70d, folhaDePagamento.calcularSalarioLiquido(100d, List.of(10d, 20d)));
    }

    @Test
    @DisplayName("Quando não tem desconto, retorna mesmo valor")
    public void calcularSalarioLiquido_salarioNegativo() {
        Assertions.assertThrows(IllegalStateException.class, () -> folhaDePagamento.calcularSalarioLiquido(100d, List.of(101d)));
    }
}
