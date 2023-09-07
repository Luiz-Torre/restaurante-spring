package com.rest.restaurante.cliente;

import com.rest.restaurante.endereco.Endereco;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "cliente" )
@Entity(name = "Cliente" )
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Cliente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String telefone;
    private Endereco endereco;

    public Cliente(DadosCliente dados) {
        this.nome = dados.nome();
        this.telefone = dados.telefone();
        this.endereco = new Endereco(dados.endereco());
    }

    public void atualizarInformacoes(@Valid DadosCliente dados) {
        if(dados.nome() != null){
            this.nome = dados.nome();

        }

        if(dados.endereco() != null){
            this.endereco.atualizarInformacoes(dados.endereco());
        }

    }
}
