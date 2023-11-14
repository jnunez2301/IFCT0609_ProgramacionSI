package com.corenetworks.presentacion;

public class ProbarClasesEnvolventes {
    //Tipos primitivos convertirlos a objetos
    public static void main(String[] args) {
        int i = 5;
        Integer iEnvolvente = i;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        String numero = "10";
        System.out.println(Integer.parseInt(numero));

        float sueldo = 1_500.50f;
        Float sEnvolvente = sueldo;
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        System.out.println(Float.parseFloat("1500.5"));

        int i2 = iEnvolvente;
        System.out.println("Numero primitivo convertido de clase envolvente " + i2);

        // BOXING
        char letra = 'a';
        Character lEnvolvente = letra;
        System.out.println("Caracter primitivo convertido a envolvente-> " + lEnvolvente);
        System.out.println(lEnvolvente.hashCode() + " hash value");
        // UNBOXING
        char letra2 = lEnvolvente;
        System.out.println("Clase envolvente convertida a primitivo-> " + letra2);
        System.out.println("Ahora letra2 no puede usar las propiedades de objeto");

    }
}
