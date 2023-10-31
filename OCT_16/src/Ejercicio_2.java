import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        //Pedir un numero e indiciar si es positivo o negativo
        int numero;
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Ingrese un número");
        numero = entradaTeclado.nextInt();
        if(numero > 0){
            System.out.println("Es positivo");
        }else{
            System.out.println("Es negativo");
        }
    }
}
