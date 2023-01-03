package com.projeto.springboot.imobiliaria.domain.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.springboot.imobiliaria.domain.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    Iterable<Cliente> findByName(String nome);

    Optional<Cliente> findByEmail(String email);

    Page<Cliente> findByName(String nome, Pageable paginacao);

}
