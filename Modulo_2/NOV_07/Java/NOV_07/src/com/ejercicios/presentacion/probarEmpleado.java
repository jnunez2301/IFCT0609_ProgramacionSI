package com.ejercicios.presentacion;

import com.ejercicios.modelo.Gerente;
import com.ejercicios.modelo.Operador;
import com.ejercicios.modelo.Vendedor;

public class probarEmpleado {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("pablo", 1000, 100);
        System.out.println(g1.toString());
        System.out.println("Nomina -> " +g1.calcularNomina() + " € ");

        Vendedor v1 = new Vendedor("pedro", 1250, 10000, 0.015);

        System.out.println(v1.toString());
        System.out.println("Nomina -> "+ v1.calcularNomina() + " €");

        Operador o1 = new Operador("jose", 1050, 300, 0.025);
        System.out.println(o1.toString());
        System.out.println("Nomina -> "+ o1.calcularNomina() + " €");
    }
}
