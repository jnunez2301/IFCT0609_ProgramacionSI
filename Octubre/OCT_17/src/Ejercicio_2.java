import java.util.Scanner;

public class Ejercicio_2 {
    //2. Pedir el dia, mes y año de una fecha e indiciar si la fecha es correcta. Suponiendo todos los meses de 30 dias.

    public static void main(String[] args) {
        int dia, mes, año;
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Ingrese un dia");
        dia = scanner.nextInt();
        System.out.println("Ingrese un mes");
        mes = scanner.nextInt();
        System.out.println("ingrese un año");
        año = scanner.nextInt();
        if(dia > 0 && dia <= 31 && mes > 0 && mes <=12 && año > 0){
            System.out.println("La fecha es correcta");
        }else{
            System.out.println("Fecha incorrecta");
        }
    }
}
