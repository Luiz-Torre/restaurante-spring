package com.rest.restaurante.cliente;

import com.rest.restaurante.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoCliente(@NotNull Long id, String nome, DadosEndereco endereco) {

}
