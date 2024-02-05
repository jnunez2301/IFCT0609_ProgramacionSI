package com.corenetworks.excepciones.excepciones;

public class ErrorNotFound extends RuntimeException {
    public ErrorNotFound(String message) {
        super(message);
    }
}
