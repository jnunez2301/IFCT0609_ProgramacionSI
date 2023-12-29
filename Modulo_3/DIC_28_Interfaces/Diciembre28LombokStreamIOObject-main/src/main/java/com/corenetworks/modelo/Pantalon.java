package com.corenetworks.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Pantalon extends Ropa implements Serializable {
    private String tipoPantalon;

    public String desmontar(){
        return "El pantalón se está desmontando";
    }

    public Pantalon(double precio, String proveedor, int numPrendas, String tipoPantalon) {
        super(precio, proveedor, numPrendas);
        this.tipoPantalon = tipoPantalon;
    }

    @Override
    public String toString() {
        return "Pantalon{" +
                "tipoPantalon='" + tipoPantalon + '\'' +
                "} " + super.toString();
    }
}
