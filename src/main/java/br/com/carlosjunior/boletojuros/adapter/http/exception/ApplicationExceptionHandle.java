package br.com.carlosjunior.boletojuros.adapter.http.exception;

import br.com.carlosjunior.boletojuros.core.exeption.ApplicationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;

@ControllerAdvice
public class ApplicationExceptionHandle extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ApplicationException.class)
    public ResponseEntity<ErrorResponse> applicationException(ApplicationException ex, WebRequest request) {
        var response = ErrorResponse.builder()
                .mensagens(Arrays.asList(ex.getTipoExecao().getMensagemErro()))
                .erro(ex.getTipoExecao().toString())
                .codigo(HttpStatus.BAD_REQUEST.value())
                .timestamp(LocalDateTime.now())
                .path(request.getDescription(false))
                .build();
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers,
                                                                  HttpStatus status,
                                                                  WebRequest request) {
        var erros = ex.getFieldErrors().stream()
                .map( item -> item.getField()+" "+item.getDefaultMessage())
                .collect(Collectors.toList());

        var response = ErrorResponse.builder()
                .mensagens(erros)
                .erro("ARGUMENT_NOT_VALID")
                .codigo(HttpStatus.PRECONDITION_FAILED.value())
                .timestamp(LocalDateTime.now())
                .path(request.getDescription(false))
                .build();
        return new ResponseEntity<>(response, HttpStatus.PRECONDITION_FAILED);

    }
}
