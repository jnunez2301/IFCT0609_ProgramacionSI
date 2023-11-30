public class Ejercicio6 {
    public static void main(String[] args) {
        int numero = 30;

        for(int i = 0; i < 30; i++){
            numero--;
            if(numero % 2 != 0){
                System.out.println("Impar -> " + numero);
            }
        }
    }
}
