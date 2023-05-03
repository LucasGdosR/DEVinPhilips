package com.example.semana10.controller;

import com.example.semana10.model.Produto;
import com.example.semana10.model.ProdutoDTO;
import com.example.semana10.service.ProdutoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

//    @GetMapping
//    public String mostrarProdutoPadrao() {
//        return "produto-padrao";
//    }

    @GetMapping("/{id}")
    public String mostrarProdutoPorId(@PathVariable Long id, Model model) {
        ProdutoDTO produto = service.findDTOById(id);
        model.addAttribute("nome", produto.nome());
        model.addAttribute("descricao", produto.descricao());
        model.addAttribute("dataDeLancamento", produto.dataDeLancamento());
        model.addAttribute("preco", produto.preco());
        return "produto";
    }

    @GetMapping
    public String mostrarTodosProdutos(Model model) {
        List<ProdutoDTO> produtos = service.findAll();
        model.addAttribute("produtos", produtos);
        return "lista-de-produtos";
    }

    @GetMapping("/cadastro")
    public String mostrarFormularioDeCadastro(ProdutoDTO produtoDTO, Model model) {
        return "formulario-de-cadastro";
    }

    @PostMapping("/cadastro")
    public String adicionarProduto(ProdutoDTO produtoDTO, Model model) {
        service.save(produtoDTO);
        return "redirect:../produto";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioDeEdicao(ProdutoDTO produtoDTO, Model model, @PathVariable Long id) {
        Produto produto = service.findById(id);
        model.addAttribute("produto", produto);
        return "formulario-de-edicao";
    }

    @PostMapping("/editar")
    public String editarProduto(Produto produto, Model model) {
        service.update(produto);
        return "redirect:../produto";
    }

    @GetMapping("deletar/{id}")
    public String deletarProduto(@PathVariable Long id) {
        service.deleteById(id);
        return "redirect:../../produto";
    }
}
