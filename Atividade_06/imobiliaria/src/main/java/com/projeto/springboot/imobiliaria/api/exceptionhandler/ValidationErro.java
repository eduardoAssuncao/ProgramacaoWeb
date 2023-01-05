package com.projeto.springboot.imobiliaria.api.exceptionhandler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ValidationErro {

    private LocalDateTime dataHora;

    private String titulo;

    private List<Erro> erros = new ArrayList<>();

    public ValidationErro(LocalDateTime dataHora, String titulo) {

        this.dataHora = dataHora;

        this.titulo = titulo;

    }

    public void adiciona(Erro erro) {

        erros.add(erro);

    }

}
