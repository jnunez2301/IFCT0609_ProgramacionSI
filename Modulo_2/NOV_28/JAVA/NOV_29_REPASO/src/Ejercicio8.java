public class Ejercicio8 {
    public static void main(String[] args) {
        int numero = 1;
        for(int i = 1; i <=20; i++){
            if(i % numero == 0){
                System.out.println(i + " es divisible entre " + numero);
            }
            numero++;
        }
    }
}
