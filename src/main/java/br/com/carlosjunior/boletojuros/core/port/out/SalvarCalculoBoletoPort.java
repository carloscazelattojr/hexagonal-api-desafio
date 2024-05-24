package br.com.carlosjunior.boletojuros.core.port.out;

import br.com.carlosjunior.boletojuros.core.domain.BoletoCalculado;

public interface SalvarCalculoBoletoPort {
    void executar(BoletoCalculado boletoCalculado);

}
