package com.corenetworks.presentacion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Encontrar el número mayor en un Array
        // Encontrar el número menor en un Array
        // También indicar el número de veces que se repiten tanto el mayor como el menor
        int[] numbers = new int[]{2, -4, -13, 1, -3, 15, 1, 9, 6, -8, 4, 23, 7, -13, 13, 23, 15, -13, 9, 0};
        int currentHighestNumber = 0;
        int currentLowestNumber = 0;
        int lowestTimes = 0;
        int highestTimes = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > currentHighestNumber){
                currentHighestNumber = numbers[i];
            }
            if(numbers[i] < currentLowestNumber){
                currentLowestNumber = numbers[i];
            }
        }
        for(int elemento: numbers){
            if(elemento == currentHighestNumber){
                highestTimes++;
            }
            if(elemento == currentLowestNumber){
                lowestTimes++;
            }
        }
        System.out.println("El mayor es -> " + currentHighestNumber + " y se repite veces ->" + highestTimes);
        System.out.println("El menor es -> " + currentLowestNumber + " y se repite veces ->" + lowestTimes);
    }
}


