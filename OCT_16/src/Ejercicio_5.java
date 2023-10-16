import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        //pedir dos numeros y decir cual es mayor
        int numero1, numero2;
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        numero1 = entradaTeclado.nextInt();
        System.out.println("Ingrese el segundo valor");
        numero2 = entradaTeclado.nextInt();
        if(numero1 > numero2){
            System.out.println(numero1 + " es mayor que " + numero2);
        }else{
            System.out.println(numero2 + " es mayor que " + numero1);
        }
    }
}
