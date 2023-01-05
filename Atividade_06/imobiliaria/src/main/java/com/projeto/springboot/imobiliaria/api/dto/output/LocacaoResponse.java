package com.projeto.springboot.imobiliaria.api.dto.output;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocacaoResponse {

    private boolean ativo;

    private Date fim;

    private Date inicio;

    private int vencimento;

    private float perc_multa;

    private float valor_aluguel;

    private String obs;

    private AluguelResponse aluguel;

    private ImovelResponse imovel;

    private ClienteResponse cliente;
}
