import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        //1. Pedir una nota de 0 a 10 y mostrarla de la forma: insuficente, suficiente, bien, sobresaliente

        int nota;
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Inserte su nota");
        nota = entradaTeclado.nextInt();

        if(nota < 5) {
            System.out.println("insuficiente");
        }
        else if(nota >= 5 && nota < 7) {
            System.out.println("suficiente");
        }
        else if(nota >=7 && nota < 9) {
            System.out.println("notable");
        }
        else if(nota == 10) {
            System.out.println("sobresaliente");
        }
        else {
            System.out.println("Inserte un valor valido");
        }
        entradaTeclado.close();
    }
}
