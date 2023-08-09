package com.desafio.desafiospring.dto;

import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public class Valores {

    @NotEmpty(message = "A lista não pode estar vazia")
    private List<Double> valores;


    /*
       Estou utilizando getter's e setter's padrões por que por algum motivo minhas annotations não estavam funcionando
    */
    public List<Double> getValores() {
        return valores;
    }

    public void setValores(List<Double> valores) {
        this.valores = valores;
    }
}
