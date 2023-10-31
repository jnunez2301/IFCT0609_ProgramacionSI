import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Mostrar la info del array
        // a bucle for
        //b bucle for each
        String[] palabras = new String[6];
        //rellenar array
        Scanner sc = new Scanner(System.in);
        for(int i= 0; i < palabras.length; i++){
            System.out.println("Escriba una palabra");
            palabras[i] = sc.next();
        }
        for(String palabra: palabras){
            System.out.println(palabra);
        }



        sc.close();
    }
}