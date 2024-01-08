package com.corenetworks.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ropa implements Serializable {
    protected double precio;
    protected String proveedor;
    private int numPrendas;

    public String probar(){
        return "La ropa se está probando ....";
    }
    public String desinfectar(){
        return "La ropa se está desinfectando ...";
    }

    public String vender(){
        return "La ropa se está vendiendo ...";
    }

}
