package com.rest.restaurante.cliente;

import com.rest.restaurante.endereco.DadosEndereco;
import com.rest.restaurante.endereco.Endereco;
import jakarta.validation.constraints.NotBlank;

public record DadosCliente(

        @NotBlank
        String nome,
        @NotBlank
        String telefone,
        DadosEndereco endereco
) {

}
