package com.corenetworks.examen.modelo.ejercicio1;


import org.springframework.stereotype.Component;

@Component
public class IvaGeneral implements IImpuesto{
    @Override
    public double calcularImpuesto(Producto p1) {
        return p1.getPrecio() * 0.21;
    }
}
