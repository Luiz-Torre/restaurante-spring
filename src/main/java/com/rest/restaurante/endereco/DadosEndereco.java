package com.rest.restaurante.endereco;

public record DadosEndereco(
        String logradouro,
        String bairro,
        String cep,
        String cidade,
        String complemento,
        String numero) {
}
