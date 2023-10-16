import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        // pedir dos numeros y decir si uno es multiplo del otro
        int numero, multiplo;
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("ingrese un numero");
        numero = entradaTeclado.nextInt();
        System.out.println("ingrese su multiplo");
        multiplo = entradaTeclado.nextInt();
        if(numero % multiplo == 0){
            System.out.println("Es multiplo");
        }else{
            System.out.println("no es multiplo");
        }


    }
}
