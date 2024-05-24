package br.com.carlosjunior.boletojuros.core.port.in;

import br.com.carlosjunior.boletojuros.core.domain.BoletoCalculado;

import java.time.LocalDate;

public interface CalculoBoletoPort {
    BoletoCalculado executar(String codigo, LocalDate dataPagamento);
}