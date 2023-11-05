import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        //pedir dos numeros y mostrarlos ordenados de mayor a menor
        int numero1, numero2;
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        numero1 = entradaTeclado.nextInt();
        System.out.println("ingrese el segundo numero");
        numero2 = entradaTeclado.nextInt();
        if(numero2 > numero1){
            System.out.println("El orden es " + numero2 + " "+ numero1);
        }else{
            System.out.println("El orden es " + numero1+ " " + numero2);
        }
    }
}
