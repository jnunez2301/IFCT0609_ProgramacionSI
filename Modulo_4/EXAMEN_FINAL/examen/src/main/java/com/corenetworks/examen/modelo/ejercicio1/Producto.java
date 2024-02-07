package com.corenetworks.examen.modelo.ejercicio1;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
}
