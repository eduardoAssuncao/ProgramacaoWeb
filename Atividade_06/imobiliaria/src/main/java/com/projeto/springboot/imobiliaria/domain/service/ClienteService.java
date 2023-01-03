package com.projeto.springboot.imobiliaria.domain.service;

import java.util.Objects;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.projeto.springboot.imobiliaria.domain.exception.OperacaoException;
import com.projeto.springboot.imobiliaria.domain.model.Cliente;
import com.projeto.springboot.imobiliaria.domain.repository.ClienteRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

    public Iterable<Cliente> todos() {
        return repository.findAll();
    }

    public Optional<Cliente> buscaPor(Integer id) {
        return repository.findById(id);
    }

    public Iterable<Cliente> buscaPor(String nome) {
        return repository.findByName(nome);
    }

    @Transactional
    public Cliente salva(Cliente cliente) {

        boolean emailExistente = repository.findByEmail(cliente.getEmail())
                .stream()
                .anyMatch(clienteExistente -> !Objects.equals(clienteExistente, cliente));

        if (emailExistente) {
            throw new OperacaoException("Já existe um cliente cadastrado com esse email!!!");
        }

        return repository.save(cliente);

    }

    @Transactional
    public void remove(Integer id) {

        repository.deleteById(id);

    }

    public boolean clienteNaoExiste(Integer id) {

        return !repository.existsById(id);

    }

    public Page<Cliente> buscaPaginada(Pageable page) {

        return repository.findAll(page);

    }

    public Page<Cliente> buscaPor(String nome, Pageable paginacao) {

        return repository.findByName(nome, paginacao);

    }
}
