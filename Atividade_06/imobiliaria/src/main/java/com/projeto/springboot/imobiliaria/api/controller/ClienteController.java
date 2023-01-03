package com.projeto.springboot.imobiliaria.api.controller;

import java.net.URI;
import java.util.Optional;

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

import com.projeto.springboot.imobiliaria.domain.model.Cliente;
import com.projeto.springboot.imobiliaria.domain.service.ClienteService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService service;

    @GetMapping
    public Iterable<Cliente> lista(String nome) {

        if (nome == null) {
            return service.todos();
        } else {
            return service.buscaPor(nome);
        }

    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscaPor(@PathVariable Integer id) {

        return service.buscaPor(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());

    }

    @PostMapping
    public ResponseEntity<Cliente> cadastro(@RequestBody @Valid Cliente cliente, UriComponentsBuilder builder) {

        final Cliente clienteSalvo = service.salva(cliente);
        final URI uri = builder.path("/clientes/{id}")
                .buildAndExpand(clienteSalvo.getId()).toUri();

        return ResponseEntity.created(uri).body(clienteSalvo);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualiza(@PathVariable Integer id, @RequestBody @Valid Cliente cliente) {

        if (service.clienteNaoExiste(id)) {
            return ResponseEntity.notFound().build();
        } else {
            cliente.setId(id);
            Cliente clienteAtualizado = service.salva(cliente);
            return ResponseEntity.ok(clienteAtualizado);
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> remover(@PathVariable Integer id) {

        Optional<Cliente> optional = service.buscaPor(id);

        if (optional.isPresent()) {
            service.remove(id);
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();

    }

}
