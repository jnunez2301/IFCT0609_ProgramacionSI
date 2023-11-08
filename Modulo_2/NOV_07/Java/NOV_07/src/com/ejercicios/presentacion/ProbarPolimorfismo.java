package com.ejercicios.presentacion;

import com.ejercicios.modelo.Empleado;
import com.ejercicios.modelo.Gerente;
import com.ejercicios.modelo.Operador;
import com.ejercicios.modelo.Vendedor;

public class ProbarPolimorfismo {
    public static void main(String[] args) {
        //Polimorfismo
        /*Gerente g1 = new Gerente("pepe", 2_000, 500);*/
        Empleado e1 = new Gerente("Poli", 3_000, 400);
        System.out.println(e1.toString());
        //Para poder ver Bono y sus otros getters & setters
        // Se suele llamar 'castear' darle una referencia
        // g2 y e1 hacen referencia al mismo Objeto, no se crea uno nuevo
        Gerente g2 = (Gerente) e1;

        Empleado e2 = new Vendedor("Vendedor", 1050, 5000, 0.01);
        Vendedor v2 = (Vendedor) e2;
        System.out.println(e2.toString());
        System.out.println(e2.calcularNomina());

        Empleado e3 = new Operador("Pedro", 1_000, 1_000, 0.02);
        Operador o2 = (Operador) e3;
        System.out.println(o2.toString());
        System.out.println("Incentivo -> " + o2.getIncentivo());

        //Array de Empleados
        Empleado[] empleados = new Empleado[3];
        empleados[0] = e1;
        empleados[1] = e2;
        empleados[2] = e3;
        for(Empleado elemento: empleados){

            System.out.println(elemento.toString());
            System.out.println("Calcular nomina ->" + elemento.calcularNomina());
        }




    }
}
