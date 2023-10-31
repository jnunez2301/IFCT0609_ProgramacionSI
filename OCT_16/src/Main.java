import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Para llamar el objeto constructor se debe llamar con la palabra
        // reservada 'new'
        // Coche miCoche = new Coche();
        // CLASE MI_VARIABLE = new Constructor();
        // miCoche.pasajeros o miCoche.numeroPuertas para poder asignar o llamar el valor del objeto
        // Esto es conocido como notación objeto
        int edad;
        Scanner tecladoEntrada = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        edad = tecladoEntrada.nextInt();
        if(edad >= 18){
            System.out.println("Mayor de edad");
        }else{
            System.out.println("Menor de edad");
        }




    }
}