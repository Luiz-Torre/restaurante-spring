package com.rest.restaurante.prato;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PratoRepository extends JpaRepository<Prato, Long> {


    Prato findByNome(String nome);

}
