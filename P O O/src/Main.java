import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char letra = 'j';
        boolean bandera =  true;
        long numero = 8_000_000L;
        float numeroConDecimales = 9.5F;

        //Array
        int[] numeros = new int[5];

        for(int i =0; i < numeros.length; i++){
            numeros[i] = i;
           /* System.out.println(numeros[i]);*/
        }
      /*  for(int numeroEntero: numeros){
            System.out.println(numeroEntero);
        }*/

        //leer por consola una palabra
        //guardar cada letra en una posicion de un array de chars
        //recomendacion se puede usar el metodo charAt
        String palabra = "palabraLarga";

        char[] charPalabras = new char[palabra.length()];

        for(int i = 0; i < palabra.length(); i++){
            charPalabras[i] = palabra.charAt(i);
        }
        System.out.println(Arrays.toString(charPalabras));

    }
}