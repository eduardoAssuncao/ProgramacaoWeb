package com.projeto.springboot.imobiliaria.api.dto.input;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ImovelRequest {

    private String tipo;

    private String endereco;

    private String cep;

    private int metragem;

}
