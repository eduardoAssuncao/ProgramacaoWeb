package com.projeto.springboot.imobiliaria.api.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.projeto.springboot.imobiliaria.domain.model.Aluguel;
import com.projeto.springboot.imobiliaria.domain.repository.AluguelRepository;
import com.projeto.springboot.imobiliaria.domain.service.AluguelService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/alugueis")
public class AluguelController {

    private final AluguelService aluguelService;

    @Autowired
    public AluguelController(AluguelService aluguelService) {
        this.aluguelService = aluguelService;
    }

    @GetMapping
    public List<Aluguel> getAllAlugueis() {

        return aluguelService.getAllAlugueis();

    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluguel> buscaPor(@PathVariable Integer id) {

        Optional<Aluguel> optional = aluguelService.buscaPor(id);

        if (optional.isPresent()) {
            return ResponseEntity.ok(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @PostMapping
    public ResponseEntity<Aluguel> cadastro(@RequestBody @Valid Aluguel aluguel, UriComponentsBuilder builder) {

        final Aluguel aluguelSalvo = aluguelService.salva(aluguel);
        final URI uri = builder.path("/alugueis/{id}")
                .buildAndExpand(aluguelSalvo.getId()).toUri();

        return ResponseEntity.created(uri).body(aluguelSalvo);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Aluguel> atualiza(@PathVariable Integer id, @RequestBody @Valid Aluguel aluguel) {

        Optional<Aluguel> Optional = aluguelService.buscaPor(id);

        if (Optional.isPresent()) {
            aluguel.setId(id);
            Aluguel aluguelAtualizado = aluguelService.salva(aluguel);
            return ResponseEntity.ok(aluguelAtualizado);
        } else {
            return ResponseEntity.notFound().build();

        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> remover(@PathVariable Integer id) {

        Optional<Aluguel> optional = aluguelService.buscaPor(id);

        if (optional.isPresent()) {
            aluguelService.remove(id);
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();

    }
}
