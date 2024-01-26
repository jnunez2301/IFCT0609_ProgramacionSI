package com.corenetworks.ecommerce.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "carrritos")
public class Carrito {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idCarrito;
        @Column(length = 60, nullable = false)
        private String cliente;
        @Column(nullable = false)
        private double importe;

    public Carrito(String cliente, double importe) {
        this.cliente = cliente;
        this.importe = importe;
    }
}
