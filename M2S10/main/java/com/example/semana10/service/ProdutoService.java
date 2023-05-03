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

    public ProdutoDTO findDTOById(Long id) {
        Produto produto = repository.findById(id).orElseThrow();
        return new ProdutoDTO(produto.getNome(),
                              produto.getDescricao(),
                              produto.getDataDeLancamento(),
                              produto.getPreco());
    }

    public Produto findById(Long id) {
        return repository.findById(id).get();
    }

    public List<ProdutoDTO> findAll() {
        List<Produto> produtos = (List<Produto>) repository.findAll();
        return produtos.stream().map(
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

    public void update(Produto produto) {
        repository.save(produto);
    }

    public void update(ProdutoDTO produtoDTO, Long id) {
        Produto produto = repository.findById(id).orElseThrow();
        produto.setNome(produtoDTO.nome());
        produto.setDescricao(produtoDTO.descricao());
        produto.setDataDeLancamento(produtoDTO.dataDeLancamento());
        produto.setPreco(produtoDTO.preco());
        repository.save(produto);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
