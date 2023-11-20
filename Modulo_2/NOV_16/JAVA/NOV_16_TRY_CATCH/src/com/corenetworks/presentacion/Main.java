package com.corenetworks.presentacion;

public class Main {
    public static void main(String[] args) {
        int[] enteros = new int[5];
        try{
            enteros[5] = 6;
        }catch(Exception e1){
            System.out.println(e1.getMessage());
            System.out.println(e1.toString());
            System.out.println(e1.getCause());
        }
        System.out.println("Después de catch");
    }
}
