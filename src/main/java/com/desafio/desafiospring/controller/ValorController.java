package com.desafio.desafiospring.controller;

import com.desafio.desafiospring.dto.Valores;
import com.desafio.desafiospring.service.ValorService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/valor")
public class ValorController {
    @Autowired
    ValorService valorService;

    @GetMapping("/list")
    public ResponseEntity<?> listar() {
        return ResponseEntity.ok(valorService.getAll());
    }

    @PostMapping
    public ResponseEntity<?> cadastrar(@RequestBody @Valid @Size(min=20, message = "O minimo aceito para as operações são de 20 numeros") final Valores valores) {
        try {
            valorService.cadastra(valores);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Erro " + e.getMessage());
        }
        return ResponseEntity.ok("Valores cadastrados: " + valores.getValores());
    }
}
