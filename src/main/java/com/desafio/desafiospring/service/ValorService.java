package com.desafio.desafiospring.service;

import com.desafio.desafiospring.dto.Valores;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ValorService {

    public void cadastra(List<Valores> valoresList){
        for(Valores valores: valoresList){
            List<Double> doubleList;
        }
    }

    public List<Double> getAll() {
        List<Double> valores = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            valores.add(i * 4.0 - 3.0);
        }
        return valores;
    }

    public void mediaValores(List<Valores> valores) {
    }
}
