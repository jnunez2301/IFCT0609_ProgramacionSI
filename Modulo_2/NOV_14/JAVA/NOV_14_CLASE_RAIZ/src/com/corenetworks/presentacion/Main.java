package com.corenetworks.presentacion;

import com.corenetworks.modelo.Producto;

public class Main {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1.equals(o2)); // Al no apuntar a la misma dirección de memoria esto es falso

        Object o3 = o1;
        /*System.out.println(o1.equals(o3)); */// Sin embargo en esta ocasión o3 apunta la dirección de memoria o1 es verdadero
        Producto p1 = new Producto(1);
        Producto p2 = new Producto(1);
        Producto p3 = new Producto(1, 100);
        System.out.println(p1.equals(p2)); // Ahora es verdadero porque hicimos override al método equals en la clase producto para que compare la id
        System.out.println(p1.hashCode() ==  p2.hashCode());
        System.out.println(p1.hashCode() == p3.hashCode());
        System.out.println(p1.getClass());

        //Probar método IVA
        System.out.println("IVA -> " + p3.iva());






    }

}
