package com.projeto.springboot.imobiliaria.api.exceptionhandler;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.projeto.springboot.imobiliaria.domain.exception.OperacaoException;

@RestControllerAdvice
public class ApiExceptionHandler {

    @Autowired
    private MessageSource messageSource;

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ValidationErro handle(MethodArgumentNotValidException exception) {

        ValidationErro erros = new ValidationErro(LocalDateTime.now(), "Campo(s) inválidos. Preencha corretamente.");

        List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();

        fieldErrors.forEach(field -> {
            String mensagem = messageSource.getMessage(field, LocaleContextHolder.getLocale());
            erros.adiciona(new Erro(field.getField(), mensagem));
        });

        return erros;

    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(OperacaoException.class)
    public ValidationErro handleNegocio(OperacaoException ex) {
        HttpStatus status = HttpStatus.BAD_REQUEST;
        ValidationErro erros = new ValidationErro(LocalDateTime.now(), ex.getMessage());

        return erros;
    }
}
