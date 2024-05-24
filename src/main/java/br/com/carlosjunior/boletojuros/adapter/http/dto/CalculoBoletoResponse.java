package br.com.carlosjunior.boletojuros.adapter.http.dto;

import br.com.carlosjunior.boletojuros.core.domain.enums.TipoBoleto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CalculoBoletoResponse {

    private String codigo;

    @JsonProperty("data_vencimento")
    private LocalDate dataVencimento;

    private BigDecimal valor;

    private TipoBoleto tipo;
}
