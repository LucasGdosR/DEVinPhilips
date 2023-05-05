package tech.devinhouse.m3s01.ex3;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import tech.devinhouse.m3s01.ex2.Veiculo;
import tech.devinhouse.m3s01.ex5.VeiculoService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest
class VeiculosControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;
    @MockBean
    private VeiculoService service;

    @Test
    void cadastrar() throws Exception {
        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca("ABC-1234");
        String request = objectMapper.writeValueAsString(veiculo);

        mockMvc.perform(post("/api/veiculos")
                .content(request)
                .contentType(APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.placa").value(veiculo.getPlaca()));
    }
    @Test
    void consultarTodos() throws Exception {
        List veiculos = List.of(new Veiculo(), new Veiculo());
        Mockito.when(service.findAll()).thenReturn(veiculos);

        mockMvc.perform(get("/api/veiculos"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()").value(2));
    }

    @Test
    void consultarPelaPlaca() throws Exception {
        Veiculo veiculo = new Veiculo();
        String id = "ABC-1234";
        veiculo.setPlaca(id);
        Mockito.when(service.findById(id)).thenReturn(veiculo);

        mockMvc.perform(get("/api/veiculos/{id}", id))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.placa").value(id));
    }

    @Test
    void excluirPelaPlaca() throws Exception {
        mockMvc.perform(delete("/api/veiculos/{placa}", "ABC123")
                        .contentType(APPLICATION_JSON))
                .andExpect(status().isNoContent());
    }

    @Test
    void cadastrarMulta() throws Exception {
        Veiculo veiculo = new Veiculo();
        String id = "ABC-1234";
        veiculo.setPlaca(id);
        final int qtdMultasOriginal = 2;
        veiculo.setQtdMultas(qtdMultasOriginal);

        Mockito.when(service.updateMultas(id)).thenReturn(veiculo.getQtdMultas() + 1);

        mockMvc.perform(put("/api/veiculos/{placa}/multas", veiculo.getPlaca())
                        .contentType(APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").value(qtdMultasOriginal + 1));
    }
}