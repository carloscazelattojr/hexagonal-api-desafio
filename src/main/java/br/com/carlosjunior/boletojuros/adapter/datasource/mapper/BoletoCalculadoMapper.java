package br.com.carlosjunior.boletojuros.adapter.datasource.mapper;

import br.com.carlosjunior.boletojuros.adapter.datasource.database.entity.BoletoCalculadoEntity;
import br.com.carlosjunior.boletojuros.core.domain.BoletoCalculado;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BoletoCalculadoMapper {
    BoletoCalculadoEntity toEntity(BoletoCalculado boletoCalculado);
}
