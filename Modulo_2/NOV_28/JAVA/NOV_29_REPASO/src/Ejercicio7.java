public class Ejercicio7 {
    public static void main(String[] args) {
        int numero = 1;
        int previousValue = 0;
        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i +  "=" + (numero*i));
            if(i == 10){
                numero++;
            }
            for(int j = 1; j <= 10; j++){
                if(numero == 1){
                    continue;
                }else{
                    numero = 2;
                    System.out.println(numero + " x " + j +  "=" + (numero*j));
                }
            }
        }
    }
}
