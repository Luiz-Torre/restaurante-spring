package com.rest.restaurante.cliente;

import com.rest.restaurante.endereco.Endereco;

public record DadosListagemCliente(
        String nome,
        Endereco endereco
) {

    public DadosListagemCliente(Cliente cliente){
        this(cliente.getNome(), cliente.getEndereco());
    }
}
