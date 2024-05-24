package br.com.carlosjunior.boletojuros.core.port.out;

import br.com.carlosjunior.boletojuros.core.domain.Boleto;

public interface ComplementarBoletoPort {
    Boleto executar(String codigo);
}
