package com.rest.restaurante.cliente;

import com.rest.restaurante.endereco.Endereco;

public record DadosListagemCliente(

        Long id,
        String nome,
        Endereco endereco
) {

    public DadosListagemCliente(Cliente cliente){
        this(cliente.getId(),cliente.getNome(), cliente.getEndereco());
    }
}
