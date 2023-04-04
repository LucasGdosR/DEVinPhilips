package com.example.semana10.service;

import com.example.semana10.model.Produto;
import com.example.semana10.model.ProdutoDTO;
import com.example.semana10.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

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

    public List<ProdutoDTO> findAll() {
        List<Produto> produtoStream = (List<Produto>) repository.findAll();
        return produtoStream.stream().map(
                produto -> new ProdutoDTO(
                        produto.getNome(),
                        produto.getDescricao(),
                        produto.getDataDeLancamento(),
                        produto.getPreco()))
                .toList();
    }

    public void save(ProdutoDTO produtoDTO) {
        repository.save(
                Produto.builder()
                        .nome(produtoDTO.nome())
                        .descricao(produtoDTO.descricao())
                        .dataDeLancamento(produtoDTO.dataDeLancamento())
                        .preco(produtoDTO.preco())
                        .build()
        );
    }
}
