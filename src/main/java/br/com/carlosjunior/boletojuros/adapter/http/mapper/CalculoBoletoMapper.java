package br.com.carlosjunior.boletojuros.adapter.http.mapper;

import br.com.carlosjunior.boletojuros.adapter.http.dto.CalculoBoletoResponse;
import br.com.carlosjunior.boletojuros.core.domain.BoletoCalculado;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CalculoBoletoMapper {
    CalculoBoletoResponse toDTO(BoletoCalculado boletoCalculado);
}
