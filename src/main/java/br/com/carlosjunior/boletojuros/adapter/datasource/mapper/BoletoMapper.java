package br.com.carlosjunior.boletojuros.adapter.datasource.mapper;

import br.com.carlosjunior.boletojuros.adapter.datasource.integration.dto.BoletoDTO;
import br.com.carlosjunior.boletojuros.core.domain.Boleto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BoletoMapper {
    Boleto toDomain(BoletoDTO boletoDTO);
}
