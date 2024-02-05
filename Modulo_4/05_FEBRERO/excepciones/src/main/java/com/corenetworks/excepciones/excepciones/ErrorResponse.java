package com.corenetworks.excepciones.excepciones;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ErrorResponse {
    private LocalDateTime date;
    private String message;
    private String details;
}
