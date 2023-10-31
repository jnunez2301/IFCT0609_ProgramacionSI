import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        //Ejercicio 1 pedir dos números y decir si son iguales o no
        int numero;
        int numero2;

        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Ingrese un número");
        numero = entradaTeclado.nextInt();
        System.out.println("Ingrese otro número");
        numero2 = entradaTeclado.nextInt();
        if(numero == numero2){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }

    }
}
