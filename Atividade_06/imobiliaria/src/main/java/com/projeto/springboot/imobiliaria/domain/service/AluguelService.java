package com.projeto.springboot.imobiliaria.domain.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.springboot.imobiliaria.domain.model.Aluguel;
import com.projeto.springboot.imobiliaria.domain.repository.AluguelRepository;

import jakarta.transaction.Transactional;

@Service
public class AluguelService {

    private final AluguelRepository aluguelRepository;

    @Autowired
    public AluguelService(AluguelRepository aluguelRepository) {

        this.aluguelRepository = aluguelRepository;

    }

    public Iterable<Aluguel> todos() {

        return aluguelRepository.findAll();

    }

    public Optional<Aluguel> buscaPor(Integer id) {

        return aluguelRepository.findById(id);

    }

    @Transactional
    public Aluguel salva(Aluguel aluguel) {

        return aluguelRepository.save(aluguel);

    }

    @Transactional
    public void remove(Integer id) {

        aluguelRepository.deleteById(id);

    }
}
