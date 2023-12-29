package com.corenetworks.modelo;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Camisa extends Ropa implements Serializable {

    private boolean corta;
    private double tallaCuello;


    public String desteñir(){
        return "La camisa se está destillendo";
    }

    public Camisa(double precio, String proveedor, int numPrendas, boolean corta, double tallaCuello) {
        super(precio, proveedor, numPrendas);
        this.corta = corta;
        this.tallaCuello = tallaCuello;
    }

    @Override
    public String toString() {
        return "Camisa{" +
                "corta=" + corta +
                ", tallaCuello=" + tallaCuello
                 + super.toString();
    }
}
