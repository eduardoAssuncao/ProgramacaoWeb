package com.projeto.springboot.imobiliaria.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.springboot.imobiliaria.domain.model.Aluguel;

@Repository
public interface AluguelRepository extends JpaRepository<Aluguel, Integer> {

}
