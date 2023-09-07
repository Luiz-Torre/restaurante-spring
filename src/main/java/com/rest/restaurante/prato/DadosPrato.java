package com.rest.restaurante.prato;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosPrato(

        @NotBlank
        String nome,
        @NotNull
        Double preco,
        @NotBlank
        String descricao
        ) {
}
