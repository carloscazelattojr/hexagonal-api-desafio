package br.com.carlosjunior.boletojuros.adapter.http;

import br.com.carlosjunior.boletojuros.adapter.http.dto.CalculoBoletoRequest;
import br.com.carlosjunior.boletojuros.adapter.http.dto.CalculoBoletoResponse;
import br.com.carlosjunior.boletojuros.adapter.http.mapper.CalculoBoletoMapper;
import br.com.carlosjunior.boletojuros.core.port.in.CalculoBoletoPort;
import io.swagger.v3.oas.annotations.Operation;
 import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/boleto")
public class CalculoBoletoController {

    private final CalculoBoletoPort calculoBoletoPort;
    private final CalculoBoletoMapper mapper;

    public CalculoBoletoController(CalculoBoletoPort calculoBoletoPort, CalculoBoletoMapper mapper) {
        this.calculoBoletoPort = calculoBoletoPort;
        this.mapper = mapper;
    }

    @PostMapping("/calculo")
    @Operation(summary = "Calcular juros de um boleto")
    public ResponseEntity<CalculoBoletoResponse> calcularBoleto(@Valid @RequestBody CalculoBoletoRequest request) {
        var boletoCalculado = calculoBoletoPort.executar(request.getCodigo(), request.getDataPagamento());
        return ResponseEntity.ok(mapper.toDTO(boletoCalculado));
    }
}
