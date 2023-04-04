package com.example.semana10.controller;

import com.example.semana10.model.ProdutoDTO;
import com.example.semana10.repository.ProdutoRepository;
import com.example.semana10.service.ProdutoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @GetMapping
    public String mostrarProdutoPadrao() {
        service.criaProdutoMock();
        return "produto-padrao";
    }

    @GetMapping("/{id}")
    public String mostrarProdutoPorId(@PathVariable Long id, Model model) {
        ProdutoDTO produto = service.findById(id);
        model.addAttribute("nome", produto.nome());
        model.addAttribute("descricao", produto.descricao());
        model.addAttribute("dataDeLancamento", produto.dataDeLancamento());
        model.addAttribute("preco", produto.preco());
        return "produto";
    }
}
