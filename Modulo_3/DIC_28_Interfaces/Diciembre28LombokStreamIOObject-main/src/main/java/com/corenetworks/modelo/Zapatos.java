package com.corenetworks.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Zapatos extends Ropa implements Serializable {
    private int tamanioTacon;

    public String cambiarTacon(){
        return "A Los zapatos se les está cambiando el tacon ...";
    }

    public Zapatos(double precio, String proveedor, int numPrendas, int tamanioTacon) {
        super(precio, proveedor, numPrendas);
        this.tamanioTacon = tamanioTacon;
    }

    @Override
    public String toString() {
        return "Zapatos{" +
                "tamanioTacon=" + tamanioTacon +
                "} " + super.toString();
    }
}
