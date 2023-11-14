package com.corenetworks.modelo;

import java.util.Objects;

public class Producto {
    private final int idProducto;

    private double precio;

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return idProducto == producto.idProducto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProducto);
    }

    public Producto(int idProducto) {
        this.idProducto = idProducto;
    }

    public final double iva (){
        return precio * .21;
    };



    public Producto(int idProducto, double precio) {
        this.idProducto = idProducto;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

}
