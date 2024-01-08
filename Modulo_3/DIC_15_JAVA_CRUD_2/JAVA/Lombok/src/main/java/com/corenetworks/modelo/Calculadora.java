package com.corenetworks.modelo;

import jdk.jfr.DataAmount;

@DataAmount
public class Calculadora {
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    public static double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: División por cero.");
            return Double.NaN; // NaN (Not a Number) representa un resultado indefinido o no válido.
        }
    }
}
