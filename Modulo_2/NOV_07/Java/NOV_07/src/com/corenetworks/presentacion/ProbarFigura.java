package com.corenetworks.presentacion;

import com.corenetworks.modelo.Circulo;
import com.corenetworks.modelo.Rectangulo;

public class ProbarFigura {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(0, 0, 4, 2);
        System.out.println(r1.toString());
        System.out.println("Area rectangulo " + r1.calcularArea());
        Circulo c1 = new Circulo(4, 4, 5);
        System.out.println(c1.toString());
        System.out.println("Area circulo " +  c1.calcularArea());
    }
}
