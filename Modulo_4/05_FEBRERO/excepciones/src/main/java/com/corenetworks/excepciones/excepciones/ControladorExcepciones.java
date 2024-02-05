package com.corenetworks.excepciones.excepciones;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@RestController
@ControllerAdvice
public class ControladorExcepciones extends ResponseEntityExceptionHandler {

    public ResponseEntity<ErrorResponse> catchNotFound(Exception ex, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<ErrorResponse> catchAllExceptions(Exception ex, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
