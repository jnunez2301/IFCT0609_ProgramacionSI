package com.corenetowrks.Paciente.Presentacion;

import com.corenetowrks.Paciente.Modelo.Producto;

public class ProbarProducto {
    public static void main(String[] args) {
        Producto prod = new Producto(1, "manzana", 300);
        prod.setVentaProducto(200);
        System.out.println(prod.toString());
    }
}
