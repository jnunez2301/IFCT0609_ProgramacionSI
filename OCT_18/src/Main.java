public class Main {
    public static void main(String[] args) {
        String nombre = "Jonathan";
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.isEmpty());
        System.out.println(nombre.indexOf("h"));
        System.out.println(nombre.lastIndexOf("n"));
        System.out.println(nombre.substring(2, 4));
        System.out.println(nombre.length());

        //Dada la cuenta bacnaria 123456789123456789123456789
        String cuentaBancaria = "123456789123456789123456789";
        //Extraer los primeros dos digitos
        //Extraer los 10 últimos digitos
        //Extraer en la posición 4 a la 9
        System.out.println("Primeros dos digitos -> " + cuentaBancaria.substring(0, 2));
        System.out.println("Ultimos dies digitos -> " + cuentaBancaria.substring(17));
        System.out.println("Posición 4 a la 9 -> " + cuentaBancaria.substring(4, 9));

         /*
        Crear la cadena de texto: “Nunca mates una mosca sobre la cabeza de un tigre.”
        • Mostrar la cadena toda en mayúsculas
        • Mostrar la cadena en minúsculas
        • Mostrar solo la palabra Nunca
        • Mostrar solo la palabra mosca
        • Mostrar la palabra cabeza
        • Mostrar la posición de la letra primera m
        • Devolver la longitud de la cadena
         */
        String frase = "Nunca mates una mosca sobre la cabeza de un tigre.";
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        System.out.println(frase.substring(0, 5));
        System.out.println(frase.substring(16,21));
        System.out.println(frase.substring(31, 37));
        System.out.println(frase.length());

    }
}