import java.util.Scanner;

public class ArrayNumericos {
    public static void main(String[] args) {
        //Declarar un array de 5 números
        //Pone r los valores desde código
        //Obtener el número más pequeño
        Scanner sc = new Scanner(System.in);
        char[] vocales = {'a','e','i','o','u'};
        String palabra;
        System.out.println("Ingrese una palabra");
        palabra = sc.next();
        for(int i = 0; i < vocales.length; i++){
            System.out.println(palabra.charAt(i));
        }
    }
}
