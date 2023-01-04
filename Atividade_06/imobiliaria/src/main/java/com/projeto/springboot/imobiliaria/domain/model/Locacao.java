package com.projeto.springboot.imobiliaria.domain.model;

import java.sql.Date;
import java.util.Set;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Locacao {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_imovel")
    Imovel imovel;

    @ManyToOne
    @JoinColumn(name = "id_inquilino")
    Cliente cliente;

    // @NotBlank
    @Column(columnDefinition = "TINYINT", length = 1)
    private boolean ativo;

    // @NotBlank
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date fim;

    // @NotBlank
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date inicio;

    // @NotBlank
    private int vencimento;

    // @NotBlank
    private float perc_multa;

    // @NotBlank
    private float valor_aluguel;

    @Size(max = 200)
    private String obs;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Aluguel> alugueis;

}
