package com.rest.restaurante.controller;


import com.rest.restaurante.cliente.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity<?> cadastrar(@RequestBody @Valid DadosCliente dados){

        System.out.println();
        if(repository.findByTelefone(dados.telefone()) == null){
            repository.save(new Cliente(dados));
        }
        else{
            var cliente = repository.getReferenceById(repository.findByTelefone(dados.telefone()).id());
            cliente.atualizarInformacoes(dados);
        }


        return ResponseEntity.ok().body(dados);
    }

    @GetMapping("{telefone}")
    public DadosListagemCliente listar(@PathVariable String telefone){

        System.out.println(telefone);
        return repository.findByTelefone(telefone);

    }


}
