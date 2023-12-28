package com.corenetworks.modelo;

public class Ropa implements AritculoVenta{
    public double precio;
    public String proveedor;
    public double numPrendas;
    public Ropa() {
    }

    public Ropa(double precio, String proveedor, double numPrendas) {
        this.precio = precio;
        this.proveedor = proveedor;
        this.numPrendas = numPrendas;
    }

    public String probar(){
        return "Probando prenda";
    }
    public String desinfectar(){
        return "Desinfectando prenda";
    }
    public String vender(){
        return "Vendiendo prenda";
    }


}
