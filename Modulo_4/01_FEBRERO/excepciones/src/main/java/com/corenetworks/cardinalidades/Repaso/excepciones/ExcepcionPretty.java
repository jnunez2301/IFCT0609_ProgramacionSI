package com.corenetworks.cardinalidades.Repaso.excepciones;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ExcepcionPretty {
    private LocalDateTime fecha;
    private String mensaje;
    private String detalle;
}
