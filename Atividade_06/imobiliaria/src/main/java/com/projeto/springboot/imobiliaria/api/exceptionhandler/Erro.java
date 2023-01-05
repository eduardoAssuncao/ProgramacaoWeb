package com.projeto.springboot.imobiliaria.api.exceptionhandler;

import lombok.Getter;

@Getter
public class Erro {

    private String campo;

    private String mensagem;

    public Erro(String campo, String erro) {

        this.campo = campo;
        this.mensagem = erro;

    }

}
