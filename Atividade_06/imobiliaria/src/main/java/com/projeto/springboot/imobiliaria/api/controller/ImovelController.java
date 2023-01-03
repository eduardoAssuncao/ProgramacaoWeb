package com.projeto.springboot.imobiliaria.api.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.projeto.springboot.imobiliaria.domain.model.Imovel;
import com.projeto.springboot.imobiliaria.domain.service.ImovelService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {

    private final ImovelService imovelService;

    @Autowired
    public ImovelController(ImovelService imovelService) {

        this.imovelService = imovelService;

    }

    @GetMapping
    @Cacheable(value = "listaDeImoveis")
    public List<Imovel> lista(String cep) {

        if (cep == null) {
            return imovelService.todos();
        } else {
            return imovelService.buscaPor(cep);
        }

    }

    @GetMapping("/{id}")
    public ResponseEntity<Imovel> buscaPor(@PathVariable Integer id) {

        Optional<Imovel> optional = imovelService.buscaPor(id);

        if (optional.isPresent()) {
            return ResponseEntity.ok(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    @CacheEvict(value = "listaDeImoveis", allEntries = true)
    public ResponseEntity<Imovel> cadastro(@RequestBody @Valid Imovel imovel, UriComponentsBuilder builder) {

        final Imovel salvaImovel = imovelService.salva(imovel);
        final URI uri = builder.path("/imoveis/{id}").buildAndExpand(salvaImovel.getId()).toUri();

        return ResponseEntity.created(uri).body(salvaImovel);
    }

    @PutMapping("/{id}")
    @CacheEvict(value = "listaDeImoveis", allEntries = true)
    public ResponseEntity<Imovel> atualiza(@PathVariable Integer id, @RequestBody @Valid Imovel imovel) {

        Optional<Imovel> optional = imovelService.buscaPor(id);

        if (optional.isPresent()) {
            imovel.setId(id);
            Imovel imovelAtualizado = imovelService.salva(imovel);
            return ResponseEntity.ok(imovelAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @DeleteMapping("/{id}")
    @CacheEvict(value = "listaDeImoveis", allEntries = true)
    public ResponseEntity<Imovel> remover(@PathVariable Integer id) {

        Optional<Imovel> optional = imovelService.buscaPor(id);

        if (optional.isPresent()) {
            imovelService.remove(id);
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();

    }

    // patchMapping
    // merge

}
