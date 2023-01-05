package com.projeto.springboot.imobiliaria.api.dto.output;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImovelResponse {

    private String tipo;

    private String endereco;

    private String cep;

    private int dormitorios;

    private int banheiros;

    private int suites;

    private int metragem;

    private float valor_aluguel_sug;

    private String obs;

    private LocacaoResponse locacao;
}
