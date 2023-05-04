package tech.devinhouse.m3s01.ex5;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import tech.devinhouse.m3s01.ex2.Veiculo;
import tech.devinhouse.m3s01.ex4.VeiculoRepository;

import java.util.List;

@Service
public class VeiculoService {
    private final VeiculoRepository repository;

    public VeiculoService(VeiculoRepository repository) {
        this.repository = repository;
    }

    public Veiculo save(Veiculo veiculo) {
        return repository.save(veiculo);
    }

    public List<Veiculo> findAll() {
        return repository.findAll();
    }

    public Veiculo findById(String placa) {
        return repository.findById(placa).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Placa não cadastrada"));
    }

    public void deleteById(String placa) {
        repository.findById(placa).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Placa não cadastrada"));

        repository.deleteById(placa);
    }

    public Integer updateMultas(String placa) {
        Veiculo veiculo = findById(placa);
        veiculo.setQtdMultas(veiculo.getQtdMultas() + 1);
        save(veiculo);
        return veiculo.getQtdMultas();
    }
}
