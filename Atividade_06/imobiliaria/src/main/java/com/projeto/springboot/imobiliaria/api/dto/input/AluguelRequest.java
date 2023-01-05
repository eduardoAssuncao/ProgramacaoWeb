package com.projeto.springboot.imobiliaria.api.dto.input;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AluguelRequest {

    private Date vencimento;

    private float valor_pago;

    private LocacaoRequest locacao;

}
