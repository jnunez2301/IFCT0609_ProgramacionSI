package com.corenetworks._ENERO.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    // Asegurarse de que @Value sea importado desde Spring, no de Lombok
    // Value solo es utilizada para probar
    @Value("000000X")
    private String dni;
    @Value("Jon")
    private String nombre;
}
