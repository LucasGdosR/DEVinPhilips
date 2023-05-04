package tech.devinhouse.m3s01.ex4;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.devinhouse.m3s01.ex2.Veiculo;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, String> {
}
