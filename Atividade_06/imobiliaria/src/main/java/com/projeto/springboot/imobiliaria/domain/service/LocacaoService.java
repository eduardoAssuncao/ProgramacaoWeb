package com.projeto.springboot.imobiliaria.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.springboot.imobiliaria.domain.model.Locacao;
import com.projeto.springboot.imobiliaria.domain.repository.LocacaoRepository;

import jakarta.transaction.Transactional;

@Service
public class LocacaoService {

    private final LocacaoRepository locacaoRepository;

    @Autowired
    public LocacaoService(LocacaoRepository locacaoRepository) {

        this.locacaoRepository = locacaoRepository;

    }

    public List<Locacao> todas() {

        return locacaoRepository.findAll();

    }

    public Optional<Locacao> buscaPor(Integer id) {

        return locacaoRepository.findById(id);

    }

    @Transactional
    public Locacao salva(Locacao locacao) {

        return locacaoRepository.save(locacao);

    }

    @Transactional
    public void remove(Integer id) {

        locacaoRepository.deleteById(id);

    }
}
