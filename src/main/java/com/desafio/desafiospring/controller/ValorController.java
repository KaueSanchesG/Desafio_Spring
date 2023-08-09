package com.desafio.desafiospring.controller;

import com.desafio.desafiospring.dto.Valores;
import com.desafio.desafiospring.service.ValorService;
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
    public ResponseEntity<?> cadastrar(@RequestBody final List<Valores> valores) {
        try {

        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Erro " + e.getMessage());
        }
        return ResponseEntity.ok(valores);
    }
}
