package com.corenetworks.presentacion;

public class Ejercicio8 {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++){
            if(i % 2 == 0 && i % 3 == 0){
                System.out.println(i + " Es par y múltiplo de 3");
            }else if(i % 3 == 0){
                System.out.println(i + " Es impar y multiplo de 3");
            }else if( i % 2 == 0){
                System.out.println(i + " Es par, pero no es multiplo de 3");
            }else{
                System.out.println(i + " No es ni par ni múltiplo de 3");
            }
        }
    }
}
