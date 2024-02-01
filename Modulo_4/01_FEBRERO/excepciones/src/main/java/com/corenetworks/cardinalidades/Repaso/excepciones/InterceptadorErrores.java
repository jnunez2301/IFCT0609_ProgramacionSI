package com.corenetworks.cardinalidades.Repaso.excepciones;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDate;
import java.time.LocalDateTime;
@ControllerAdvice
@RestController
public class InterceptadorErrores extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ExcepcionNoEncontradoModelo.class)
    public ResponseEntity<ExcepcionPretty> manejadorExcepcionRespuesta(ExcepcionNoEncontradoModelo ex, WebRequest request){
        ExcepcionPretty ePersonalizada = new ExcepcionPretty(LocalDateTime.now(),ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(ePersonalizada, HttpStatus.NOT_FOUND);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        ExcepcionPretty excepcion = new ExcepcionPretty(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(excepcion, HttpStatus.BAD_REQUEST);
    }

    public final ResponseEntity<ExcepcionPretty> manejadorTodasLasExcepciones(Exception ex, WebRequest request){
        ExcepcionPretty excepcion = new ExcepcionPretty(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(excepcion, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
