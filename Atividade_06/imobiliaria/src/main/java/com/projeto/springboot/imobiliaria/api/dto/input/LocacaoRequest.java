package com.projeto.springboot.imobiliaria.api.dto.input;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LocacaoRequest {

    private Date fim;

    private Date inicio;

    private int vencimento;

    private ClienteRequest cliente;

}
