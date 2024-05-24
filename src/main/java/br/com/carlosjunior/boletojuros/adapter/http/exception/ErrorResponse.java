package br.com.carlosjunior.boletojuros.adapter.http.exception;

import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {

    private List<String> mensagens = new ArrayList<>();
    private String erro;
    private int codigo;
    private LocalDateTime timestamp;
    private String path;
}
