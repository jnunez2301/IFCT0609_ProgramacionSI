import java.util.Random;
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Random numeroRandom = new Random();
        Scanner scanner = new Scanner(System.in);
        int respuesta = numeroRandom.nextInt(10), numero = 0;
        while(numero != respuesta){
            System.out.println("Adivina el número del 1 al 10");
            numero = scanner.nextInt();
        }
        System.out.println("Bien hecho!");

    }
}



