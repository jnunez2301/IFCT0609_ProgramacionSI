import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        //pedir un número y decir si es par o impar
        int numero;
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        numero = entradaTeclado.nextInt();
        if(numero % 2 == 0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
}
