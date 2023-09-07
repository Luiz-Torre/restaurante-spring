package com.rest.restaurante.controller;

import com.rest.restaurante.prato.DadosPrato;
import com.rest.restaurante.prato.Prato;
import com.rest.restaurante.prato.PratoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("prato")
public class PratoController {

    @Autowired
    private PratoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosPrato dados){
        repository.save(new Prato(dados));

    }
}
