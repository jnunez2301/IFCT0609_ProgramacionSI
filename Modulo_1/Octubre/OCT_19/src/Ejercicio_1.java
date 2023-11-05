import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        // Leer un número y mostrar su cuadrado,
        // repetir el proceso hasta que se introduzca un número
        // negativo
        Scanner scanner = new Scanner(System.in);
        int numero = 1;
        while(numero > 0){

            System.out.println("Ingrese un numero");
            numero = scanner.nextInt();
            if(numero < 0){
                System.out.println("El número debe ser mayor de 0");
                break;
            }
            System.out.println("El cuadrado es: "+ numero * numero);

        }
    }
}
