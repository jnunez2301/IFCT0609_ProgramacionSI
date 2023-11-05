import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        //Leer numeros hasta que se introduzca un 0
        //Indicar si el número es impar o par
        Scanner scanner = new Scanner(System.in);
        int numero = 1;
        while(numero > 0){
            System.out.println("Ingrese un número, pulse cero para salir");
            numero = scanner.nextInt();
            if(numero % 2 == 0 && numero != 0){
                System.out.println(numero + " es par");
            }
            if(numero % 2 != 0){
                System.out.println(numero + " es impar");
            }
            if(numero == 0){
                System.out.println("Programa finalizado");
                break;
            }
        }
    }
}
