import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 1;
        int total = 0;
        int media = 0;
        while(numero > 0){

            System.out.println("Ingrese un numero");
            numero = scanner.nextInt();
            media += numero;
            if(numero < 0){
                System.out.println("Ha sumado " + total + " cantidad de numeros");
                break;
            }
            total++;
        }
        System.out.println("Y la media es" + media/total);
    }
}
