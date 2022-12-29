package com.projeto.springboot.imobiliaria.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.springboot.imobiliaria.domain.model.Imovel;

@Repository
public interface ImovelRepository extends JpaRepository<Imovel, Integer> {

}
