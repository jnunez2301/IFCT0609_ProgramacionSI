import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 1;
        int total = 0;
        while(numero > 0){

            System.out.println("Ingrese un numero");
            numero = scanner.nextInt();

            if(numero < 0){
                System.out.println("Ha sumado " + total + " cantidad de numeros");
                break;
            }
            total++;
        }
    }
}
