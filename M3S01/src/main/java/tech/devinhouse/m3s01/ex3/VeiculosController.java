package tech.devinhouse.m3s01.ex3;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import tech.devinhouse.m3s01.ex2.Veiculo;
import tech.devinhouse.m3s01.ex5.VeiculoService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculosController {
    private final VeiculoService service;

    public VeiculosController(VeiculoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Veiculo> cadastrar(@RequestBody Veiculo veiculo, UriComponentsBuilder uriBuilder) {
        veiculo = service.save(veiculo);
        URI uri = uriBuilder.path("/api/veiculos/{placa}").buildAndExpand(veiculo.getPlaca()).toUri();
        return ResponseEntity.created(uri).body(veiculo);
    }

    @GetMapping
    public ResponseEntity<List<Veiculo>> consultarTodos() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{placa}")
    public ResponseEntity<Veiculo> consultarPelaPlaca(@PathVariable String placa) {
        return ResponseEntity.ok(service.findById(placa));
    }

    @DeleteMapping("/{placa}")
    public ResponseEntity<Void> excluirPelaPlaca(@PathVariable String placa) {
        service.deleteById(placa);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{placa}/multas")
    public ResponseEntity<Integer> cadastrarMulta(@PathVariable String placa) {
        return ResponseEntity.ok(service.updateMultas(placa));
    }
}
