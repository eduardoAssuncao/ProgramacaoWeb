package com.projeto.springboot.imobiliaria.api.dto.output;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteResponse {

    private String nome;

    private String cpf;

    private String telefone;

    private String email;

    private Date nascimento;

    private LocacaoResponse locacao;

}
