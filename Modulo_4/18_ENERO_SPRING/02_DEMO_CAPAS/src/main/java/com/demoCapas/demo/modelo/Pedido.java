package com.demoCapas.demo.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Pedido {
    @Value("10")
    private int idPedido;
    @Value("2024-01-10")
    private LocalDate fPedido;
    @Value("2024-01-11")
    private String fEnvio;
    @Value("2024-01-09")
    private String fPago;
    @Value("100")
    private double importe;
}
