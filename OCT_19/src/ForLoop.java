import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        // 1.	Pedir un número N, y mostrar todos los números del 1 al N.

        Scanner scanner = new Scanner(System.in);

//
//                System.out.println("Ingrese un número");
//        numero = scanner.nextInt();
//        if(numero > 0){
//            for(int i = 0; i <= numero; i++){
//                System.out.println(i);
//            }
//        }else{
//            System.out.println("El número no puede ser negativo");
//        }
        // 2. 	Escribir todos los números del 100 al 0 de 7 en 7

//        for(int i = 0; i <= 100; i = i + 7){
//            System.out.println(i);
//        }
        // 3.	Pedir 15 números y escribir la suma total
//        int total = 0;
//        int numero;
//        for(int i = 0; i < 15; i++){
//            System.out.println("Ingrese un número");
//            numero = scanner.nextInt();
//            total += numero;
//        }
//        System.out.println(total);
//        scanner.close();

        //4.	Diseñar un programa que muestre el producto de los 10 primeros números impares

//        System.out.println("Ingrese un número");
//        for(int i = 0; i <= 10; i++){
//            if(i % 2 != 0){
//                System.out.println(i);
//            }
//        }
        //5.Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.

//
//
//        int positivos = 0;
//        int casosPositivos = 0;
//        int mediaPositivos = 0;
//        int negativos = 0;
//        int casosNegativos = 0;
//        int mediaNegativos = 0;
//        int ceros = 0;
//
//        for(int i = 0; i < 10; i++){
//            System.out.println("dime un número");
//            int numero = scanner.nextInt();
//            if(numero > 0){
//               positivos += numero;
//               casosPositivos++;
//
//          }else if(numero < 0){
//               negativos += numero;
//               casosNegativos++;
//            }else{
//                ceros++;
//            }
//        }
//        if(positivos > 0){
//            mediaPositivos = positivos / casosPositivos;
//        }
//        else{
//            mediaNegativos = negativos / casosNegativos;
//        }
//
//        System.out.println("Media de positivos -> " + mediaPositivos);
//        System.out.println("Media de negativos -> " + mediaNegativos);
//        System.out.println("Cantidad de ceros -> " + ceros);

        //Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
//        int sueldo;
//        int total = 0;
//        for(int i = 0; i < 10; i++){
//            sueldo = scanner.nextInt();
//            if(sueldo > 1000){
//                total++;
//            }
//        }
//        System.out.println("Hay " + total +" empleados con un sueldo superior a 1000");
//
//      7. Dadas las edades y alturas de 5 alumnos,
//      Mostrar la edad y la estatura media,
//      La cantidad de alumnos mayores de  18 años
//      La cantidad de alumnos que miden más de 1.75.
        int edad;
        int totalEdad = 0;
        int altura;
        int totalAltura = 0;
        int mayor18 = 0;
        int mideMas175 = 0;
        int mediaAltura;
        int mediaEdad;

        for(int i = 0; i < 5; i++){
            System.out.println("Inserte una edad");
            edad = scanner.nextInt();
            totalEdad += edad;
            System.out.println("Inserte una altura en cm");
            altura = scanner.nextInt();
            totalAltura += altura;
            if(edad > 18){
                mayor18++;
            }else if(altura > 175){
                mideMas175++;
            }
        }
        System.out.println("Mayores de 18 -> " +  mayor18);
        System.out.println("Miden más de 175cm -> " + mideMas175);
        mediaEdad = totalEdad / 5;
        System.out.println("La media de Edad es -> " + mediaEdad);

        mediaAltura = totalAltura / 5;
        System.out.println("La media de altura es -> " + mediaAltura);


    }
}
