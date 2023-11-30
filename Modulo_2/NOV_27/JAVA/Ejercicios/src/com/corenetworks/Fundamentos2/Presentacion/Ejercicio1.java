package com.corenetworks.Fundamentos2.Presentacion;

public class Ejercicio1 {
    public static void main(String[] args) {
        Float[] numerosFloat = {1.23234f, 2.234234f, 3.32423f, 2342.5f, 23423.433f};
        float total = 0f;
        for(int i = 0; i < numerosFloat.length; i++){
            total += numerosFloat[i];
        }
        System.out.println("El promedio es " + total / numerosFloat.length);
    }
}
