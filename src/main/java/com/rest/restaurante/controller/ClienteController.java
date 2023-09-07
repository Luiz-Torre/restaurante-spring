package com.rest.restaurante.controller;


import com.rest.restaurante.cliente.Cliente;
import com.rest.restaurante.cliente.ClienteRepository;
import com.rest.restaurante.cliente.DadosCliente;
import com.rest.restaurante.cliente.DadosListagemCliente;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCliente dados){
        repository.save(new Cliente(dados));

    }

    @GetMapping("{telefone}")
    public DadosListagemCliente listar(@PathVariable String telefone){

        System.out.println(telefone);
        return repository.findByTelefone(telefone);

    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosCliente dados){

    }

}
