package com.projeto.springboot.imobiliaria.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.springboot.imobiliaria.domain.model.Imovel;
import com.projeto.springboot.imobiliaria.domain.repository.ImovelRepository;

import jakarta.transaction.Transactional;

@Service
public class ImovelService {

    private final ImovelRepository imovelRepository;

    @Autowired
    public ImovelService(ImovelRepository imovelRepository) {

        this.imovelRepository = imovelRepository;

    }

    public List<Imovel> todos() {

        return imovelRepository.findAll();

    }

    public Optional<Imovel> buscaPor(Integer id) {

        return imovelRepository.findById(id);

    }

    public List<Imovel> buscaPor(String cep) {

        return imovelRepository.findByCep(cep);

    }

    @Transactional
    public Imovel salva(Imovel imovel) {

        return imovelRepository.save(imovel);

    }

    @Transactional
    public void remove(Integer id) {

        imovelRepository.deleteById(id);

    }
}
