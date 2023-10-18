import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        //pedir tres numeros y mostrarlos ordenados de menor a mayor

        int numero1, numero2, numero3;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("ingrese un numero");
        numero1 = entradaTeclado.nextInt();

        System.out.println("ingrese un numero");
        numero2 = entradaTeclado.nextInt();

        System.out.println("ingrese un numero");
        numero3 = entradaTeclado.nextInt();

        entradaTeclado.close();
    }
}
