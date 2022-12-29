package com.projeto.springboot.imobiliaria.domain.exception;

public class OperacaoException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public OperacaoException(String message) {
        super(message);
    }
}
