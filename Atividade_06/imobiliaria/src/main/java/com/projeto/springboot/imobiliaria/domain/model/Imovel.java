package com.projeto.springboot.imobiliaria.domain.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Imovel {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // @NotBlank
    @Size(max = 15)
    private String tipo;

    // @NotBlank
    @Size(max = 100)
    private String endereco;

    // @NotBlank
    @Size(max = 8)
    private String cep;

    // @NotBlank
    private int dormitorios;

    // @NotBlank
    private int banheiros;

    // @NotBlank
    private int suites;

    // @NotBlank
    private int metragem;

    // @NotBlank
    private float valor_aluguel_sug;

    @Size(max = 200)
    private String obs;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Locacao> locacoes;
}
