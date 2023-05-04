package tech.devinhouse.m3s01.ex5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.server.ResponseStatusException;
import tech.devinhouse.m3s01.ex2.Veiculo;
import tech.devinhouse.m3s01.ex4.VeiculoRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class VeiculoServiceTest {
    @Mock
    private VeiculoRepository repository;
    @InjectMocks
    private VeiculoService service;

    @Test
    void save() {
        // Método apenas utiliza o repositório
    }

    @Test
    @DisplayName("Quando repositório está vazio, deve retornar uma lista vazia.")
    void findAll() {
        List<Veiculo> list = List.of(new Veiculo(), new Veiculo());
        Mockito.when(repository.findAll()).thenReturn(list);

        var result = service.findAll();
        assertEquals(2, result.size());
    }

    @Test
    @DisplayName("Quando repositório está vazio, deve retornar uma lista vazia.")
    void findAll_empty() {
        var result = service.findAll();
        assertInstanceOf(List.class, result);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    @DisplayName("Quando busca por uma placa, recebe o carro com a placa buscada.")
    void findById() {
        String id = "ABC-1234";

        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca(id);

        Mockito.when(
                repository.findById(id))
                .thenReturn(Optional.of(veiculo));

        Veiculo result = service.findById(id);

        assertNotNull(result);
        assertEquals(id, result.getPlaca());
    }

    @Test
    @DisplayName("Quando busca por uma placa, recebe o carro com a placa buscada.")
    void findById_notFound() {
        assertThrows(ResponseStatusException.class, () -> service.findById("ABC-1234"));
    }

    @Test
    @DisplayName("Quando existe o id, deve deletar.")
    void deleteById() {
        String id = "ABC-1234";
        Mockito.when(repository.findById(id)).thenReturn(Optional.of(new Veiculo()));

        assertDoesNotThrow(() -> service.deleteById(id));
    }

    @Test
    @DisplayName("Quando não existe o id, deve lançar exceção.")
    void deleteById_nonExistent() {
        assertThrows(ResponseStatusException.class, () -> service.deleteById("ABC-1234"));
    }

    @Test
    @DisplayName("Quando existe o veículo, deve incrementar a quantidade de multas")
    void updateMultas() {
        Veiculo veiculo = new Veiculo();
        veiculo.setQtdMultas(3);
        Mockito.when(repository.findById(Mockito.anyString())).thenReturn(Optional.of(veiculo));

        service.updateMultas("ABC-1234");
        assertEquals(4, veiculo.getQtdMultas());
    }

    @Test
    @DisplayName("Quando não existe o veículo, deve lançar uma exceção.")
    void updateMultas_nonExistent() {
        assertThrows(ResponseStatusException.class, () -> service.updateMultas("ABC-1234"));
    }
}