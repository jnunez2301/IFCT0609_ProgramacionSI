package com.corenetworks.modelo;

public class Alimento extends Producto{

    public Alimento(int idProducto) {
        super(idProducto);
    }

    public Alimento(int idProducto, double precio) {
        super(idProducto, precio);
    }
    /*
    No se puede modificar porque es **final**
    public double iva(){
        return precio * .33;
    }*/
}
