package com.rest.restaurante.cliente;

import com.rest.restaurante.endereco.DadosEndereco;
import jakarta.validation.constraints.NotBlank;

public record DadosCliente(

        Long id,
        @NotBlank
        String nome,
        @NotBlank
        String telefone,
        DadosEndereco endereco
) {

}
