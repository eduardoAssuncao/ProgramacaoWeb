package com.projeto.springboot.imobiliaria.api.dto.input;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ClienteRequest {

    private String nome;

    private String cpf;

    private String telefone;

    private String email;

    private Date nascimento;

}
