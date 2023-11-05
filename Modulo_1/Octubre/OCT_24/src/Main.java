import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        for(int i:numeros){
            System.out.println("Ingrese un número");
            numeros[counter] = sc.nextInt();
            counter++;
        }
        System.out.println(Arrays.toString(numeros));


    }
}