package com.projeto.springboot.imobiliaria.domain.exception;

public class EntityNotFindException extends OperacaoException {

    private static final long serialVersionUID = 1L;

    public EntityNotFindException(String message) {
        super(message);
    }
}
