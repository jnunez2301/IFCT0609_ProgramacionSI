import java.util.Scanner;

public class ArrayNumericos {
    public static void main(String[] args) {
        //Declarar un array de 5 numeros
        //Pone r los valores desde código
        //Obtener el número más pequeño
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int numeroPequeno = numeros[0];
        for(int i = 0; i < numeros.length; i++){
            System.out.println("ingrese un numero");
            numeros[i] = sc.nextInt();

            if(numeroPequeno > numeros[i]){
                numeroPequeno = numeros[i];
            }
        }
        System.out.println("El numero más pequeño es -> " + numeroPequeno);
    }
}
