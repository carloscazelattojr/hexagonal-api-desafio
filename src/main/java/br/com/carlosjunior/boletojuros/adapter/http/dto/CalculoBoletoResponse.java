package br.com.carlosjunior.boletojuros.adapter.http.dto;

import br.com.carlosjunior.boletojuros.core.domain.enums.TipoBoleto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class CalculoBoletoResponse {

    private String codigo;

    @JsonProperty("data_vencimento")
    private LocalDate dataVencimento;

    private BigDecimal valor;

    private TipoBoleto tipo;

    public CalculoBoletoResponse(String codigo, LocalDate dataVencimento, BigDecimal valor, TipoBoleto tipo) {
        this.codigo = codigo;
        this.dataVencimento = dataVencimento;
        this.valor = valor;
        this.tipo = tipo;
    }

}
