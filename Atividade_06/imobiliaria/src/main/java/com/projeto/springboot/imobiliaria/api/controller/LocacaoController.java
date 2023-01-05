package com.projeto.springboot.imobiliaria.api.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.projeto.springboot.imobiliaria.api.dto.input.LocacaoRequest;
import com.projeto.springboot.imobiliaria.api.dto.output.LocacaoResponse;
import com.projeto.springboot.imobiliaria.api.mapper.LocacaoMapper;
import com.projeto.springboot.imobiliaria.domain.model.Locacao;
import com.projeto.springboot.imobiliaria.domain.service.LocacaoService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/locacoes")
public class LocacaoController {

    private final LocacaoService locacaoService;
    private final LocacaoMapper locacaoMapper;

    // @Autowired
    // public LocacaoController(LocacaoService locacaoService) {

    // this.locacaoService = locacaoService;

    // }

    // @GetMapping
    // public List<Locacao> getAllLocacoes() {

    // return locacaoService.todas();

    // }

    // @GetMapping("/{id}")
    // public ResponseEntity<Locacao> buscaPor(@PathVariable Integer id) {

    // Optional<Locacao> optional = locacaoService.buscaPor(id);

    // if (optional.isPresent()) {
    // return ResponseEntity.ok(optional.get());
    // } else {
    // return ResponseEntity.notFound().build();
    // }

    // }

    @GetMapping("/{id}")
    public ResponseEntity<LocacaoResponse> buscar(@PathVariable Integer id) {
        return locacaoService.buscaPor(id).map(locacao -> ResponseEntity.ok(locacaoMapper.toModel(locacao)))
                .orElse(ResponseEntity.notFound().build());

    }

    @GetMapping
    public List<LocacaoResponse> listar() {

        return locacaoMapper.toCollectionModel(locacaoService.todas());

    }

    // @PostMapping
    // public ResponseEntity<Locacao> cadastro(@RequestBody @Valid Locacao locacao,
    // UriComponentsBuilder builder) {

    // final Locacao salvaLocacao = locacaoService.salva(locacao);
    // final URI uri = builder.path("/locacores/{id}")
    // .buildAndExpand(salvaLocacao.getId()).toUri();

    // return ResponseEntity.created(uri).body(salvaLocacao);

    // }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public LocacaoResponse solicitar(@Valid @RequestBody LocacaoRequest locacaoInput) {

        Locacao novaLocacao = locacaoMapper.toEntity(locacaoInput);

        return locacaoMapper.toModel(novaLocacao);

    }

    // @PutMapping("/{id}")
    // public ResponseEntity<Locacao> atualiza(@PathVariable Integer id,
    // @RequestBody @Valid Locacao locacao) {

    // Optional<Locacao> optional = locacaoService.buscaPor(id);

    // if (optional.isPresent()) {
    // locacao.setId(id);
    // Locacao locacaoAtualizada = locacaoService.salva(locacao);
    // return ResponseEntity.ok(locacaoAtualizada);
    // } else {
    // return ResponseEntity.notFound().build();
    // }

    // }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<?> remover(@PathVariable Integer id) {

    // Optional<Locacao> optional = locacaoService.buscaPor(id);

    // if (optional.isPresent()) {
    // locacaoService.remove(id);
    // return ResponseEntity.noContent().build();
    // }

    // return ResponseEntity.notFound().build();
    // }
}
