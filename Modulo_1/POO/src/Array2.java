import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        // Leer por consola una palabra
        // Definir un array de String
        // Obtener la longitud del Array considerando que en cada posición
        // se guardan 2 letras
        // Rellenar el Array
        String palabra;
        String[] arrPalabras;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        palabra = sc.next();
        if(palabra.length() % 2 == 0) {
            arrPalabras = new String[palabra.length() / 2];



            System.out.println(Arrays.toString(arrPalabras));
        }else{
            arrPalabras = new String[palabra.length() / 2 + 1];

            System.out.println(Arrays.toString(arrPalabras));
        }

        //Double loop



        sc.close();
    }
}
