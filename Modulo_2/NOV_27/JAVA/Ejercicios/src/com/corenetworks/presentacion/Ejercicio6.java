package com.corenetworks.presentacion;

public class Ejercicio6 {
    public static void main(String[] args) {
        Integer[] numeros = {20, 50 , 30};

        int max = numeros[0];

        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] > max){
                max = numeros[i];
            }
        }
        System.out.println(max);
    }
}
