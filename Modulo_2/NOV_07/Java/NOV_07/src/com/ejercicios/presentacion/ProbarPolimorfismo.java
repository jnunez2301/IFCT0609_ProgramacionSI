package com.ejercicios.presentacion;

import com.ejercicios.modelo.Empleado;
import com.ejercicios.modelo.Gerente;

public class ProbarPolimorfismo {
    public static void main(String[] args) {
        //Polimorfismo
        /*Gerente g1 = new Gerente("pepe", 2_000, 500);*/
        Empleado e1 = new Gerente("Poli", 3_000, 400);
        System.out.println(e1.toString());
        //Para poder ver Bono y sus otros getters & setters
        // Se suele llamar 'castear' darle una referencia
        Gerente g2 = (Gerente) e1;


    }
}
