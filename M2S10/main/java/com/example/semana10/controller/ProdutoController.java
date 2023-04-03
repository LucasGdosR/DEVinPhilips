package com.example.semana10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
    @GetMapping
    public String mostrarProdutoPadrao() {
        return "produto-padrao";
    }
}
