package com.corenetworks.madurezRestFull.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@RestController
@ControllerAdvice
public class ControladorExcepciones extends ResponseEntityExceptionHandler {
   @ExceptionHandler(ExcepcionNoEncontrado.class)
    public ResponseEntity<ExcepcionPretty> atrapaExcepcionNoEncontrada(ExcepcionNoEncontrado ex, WebRequest peticion){
        ExcepcionPretty e = new ExcepcionPretty(LocalDateTime.now(), ex.getMessage(), peticion.getDescription(false));
        return  new ResponseEntity<>(e, HttpStatus.NOT_FOUND);
    }
}
