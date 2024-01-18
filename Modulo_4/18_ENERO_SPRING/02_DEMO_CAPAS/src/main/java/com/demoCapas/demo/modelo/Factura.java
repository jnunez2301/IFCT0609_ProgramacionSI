package com.demoCapas.demo.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Factura {
//    @Value("1")
    private int numFactura;
//    @Value("300")
    private double importe;
//    @Value("2024-01-15")
    private LocalDate fFactura;
}
