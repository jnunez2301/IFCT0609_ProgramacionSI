import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        //pedir un numero entre 0 y 9.999 y decir cuantas cifras tiene
        double numero;
        int length;
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 0 y 9.999");
        numero = entradaTeclado.nextDouble();
        if(numero > 0 && numero < 1){
            length = String.valueOf(numero).length();
            System.out.println("la longitud del numero es " + length);
            // Ejercicio 9 invertir el numero
            double inverso;
            inverso = Math.pow(numero, -1);
            System.out.println("el numero invertido es" +inverso);
        }else{
            System.out.println("ingrese un dato valido");
        }

    }
}
