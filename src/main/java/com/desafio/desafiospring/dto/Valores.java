package com.desafio.desafiospring.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Valores {
    @Getter @Setter
    private List<Double> valores = new ArrayList<>();
}
