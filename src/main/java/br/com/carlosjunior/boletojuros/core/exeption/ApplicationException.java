package br.com.carlosjunior.boletojuros.core.exeption;

import br.com.carlosjunior.boletojuros.core.domain.enums.TipoExecao;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApplicationException extends RuntimeException {
    private TipoExecao tipoExecao;
}