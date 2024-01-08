package com.corenetworks.presentacion;

import com.corenetworks.modelo.Calculadora;
import com.corenetworks.modelo.CalculadoraMonetaria;

public class ProbarCalculadora {
    public static void main(String[] args) {
        System.out.println(Calculadora.sumar(1, 1));
        System.out.println(Calculadora.restar(2, 1));
        System.out.println(Calculadora.dividir(20, 5));
        System.out.println(Calculadora.multiplicar(5, 5));
        System.out.println(CalculadoraMonetaria.dollarEuro(20));
    }
}
