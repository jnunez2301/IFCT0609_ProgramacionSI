import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Arrays
        int[] numeros = new int[5];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i + 5;
            System.out.println(numeros[i]);
        }

        //Definir un Array String de 7 posiciones y asignarles valor nombre

        String[] nombres = new String[7];

        nombres[0]="Pepito";
        nombres[1]="Manolo";
        nombres[2]="Juanito";
        nombres[3]="Daniel";
        nombres[4]="Dulce";
        nombres[5]="Ramiro";
        nombres[6]="Gonzalo";
        //Contar nombres que empiezan por D
        int total = 0;
        for(int i = 0; i < nombres.length; i++){
            if(nombres[i].charAt(0) == 'D'){
                total++;
            }
        }
        System.out.println("Hay un total de " +  total + " de nombres que empiezan por D");

        //Declarar un array de 5 posiciones de tipo char y hay que leerlo por la consola
        //Scanner usando el metodo next y el metodo charAt() String
       /* Scanner sc = new Scanner(System.in);
        char[] letras = new char[5];
        String palabra = new String;

        for(int i = 0; i < letras.length; i++){
            System.out.println("Ingrese una letra para formar una palabra de 5 caracteres");
            letras[i] = sc.next().charAt(0);
            palabra = palabra + letras[i].charAt(0);
        }
        System.out.println(palabra);*/

    }
}