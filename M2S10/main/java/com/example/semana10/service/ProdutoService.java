package com.example.semana10.service;

import com.example.semana10.model.Produto;
import com.example.semana10.model.ProdutoDTO;
import com.example.semana10.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ProdutoService {
    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public ProdutoDTO findById(Long id) {
        Produto produto = repository.findById(id).orElseThrow();
        return new ProdutoDTO(produto.getNome(),
                              produto.getDescricao(),
                              produto.getDataDeLancamento(),
                              produto.getPreco());
    }

    public void criaProdutoMock() {
        Produto produto = new Produto();
        produto.setNome("Banana");
        produto.setDescricao("Banana prata madura.");
        produto.setDataDeLancamento(LocalDate.now());
        produto.setPreco(2.99);
        repository.save(produto);
    }
}
