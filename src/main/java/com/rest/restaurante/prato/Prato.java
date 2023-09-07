package com.rest.restaurante.prato;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "prato")
@Entity(name = "Prato")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Prato {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double preco;
    private String descricao;

    public Prato(DadosPrato dados) {
        this.nome = dados.nome();
        this.preco = dados.preco();
        this.descricao =dados.descricao();
    }

}
