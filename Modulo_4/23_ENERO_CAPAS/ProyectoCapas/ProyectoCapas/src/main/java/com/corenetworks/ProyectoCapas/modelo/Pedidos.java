package com.corenetworks.ProyectoCapas.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

//Lombok
@NoArgsConstructor
@AllArgsConstructor
@Data
//Hibernate
@Entity
@Table(name = "pedidos")
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;
    private LocalDate fechaPedido;
    @Column(length = 5, nullable = false)
    private String formaPago;
    private double importe;
}
