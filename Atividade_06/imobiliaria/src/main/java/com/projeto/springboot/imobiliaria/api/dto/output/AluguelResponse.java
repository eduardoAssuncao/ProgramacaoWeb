package com.projeto.springboot.imobiliaria.api.dto.output;

import java.sql.Date;

import com.projeto.springboot.imobiliaria.api.dto.input.LocacaoRequest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AluguelResponse {

    private Date vencimento;

    private float valor_pago;

    private String obs;

    private LocacaoRequest locacao;

}
