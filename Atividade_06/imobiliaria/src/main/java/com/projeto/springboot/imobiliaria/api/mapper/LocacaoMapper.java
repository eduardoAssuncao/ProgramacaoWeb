package com.projeto.springboot.imobiliaria.api.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.projeto.springboot.imobiliaria.api.dto.input.LocacaoRequest;
import com.projeto.springboot.imobiliaria.api.dto.output.LocacaoResponse;
import com.projeto.springboot.imobiliaria.domain.model.Locacao;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class LocacaoMapper {

    private ModelMapper modelMapper;

    public LocacaoResponse toModel(Locacao locacao) {

        return modelMapper.map(locacao, LocacaoResponse.class);

    }

    public List<LocacaoResponse> toCollectionModel(List<Locacao> locacoes) {

        return locacoes.stream().map(this::toModel).collect(Collectors.toList());

    }

    public Locacao toEntity(LocacaoRequest locacaoRequest) {

        return modelMapper.map(locacaoRequest, Locacao.class);

    }
}
