package com.rest.restaurante.controller;

import com.rest.restaurante.prato.DadosPrato;
import com.rest.restaurante.prato.Prato;
import com.rest.restaurante.prato.PratoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    //?sort=nome
    @GetMapping
    public List<Prato> listarPratos(){
        return repository.findAll();
    }

    @GetMapping("{nome}")
    public Prato listar(@PathVariable String nome){

        System.out.println(nome);
        return repository.findByNome(nome);

    }
}
