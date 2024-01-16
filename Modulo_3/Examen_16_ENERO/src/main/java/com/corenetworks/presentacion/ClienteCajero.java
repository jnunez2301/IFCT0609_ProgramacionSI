package com.corenetworks.presentacion;

import com.corenetworks.modelo.TarjetaCredito;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.time.LocalDate;
import java.util.Scanner;

public class ClienteCajero {
    public static void main(String[] args) {

        TarjetaCredito t1 = new TarjetaCredito();

        System.out.println("Bienvenido a su máquina ATM");
        System.out.println("-".repeat(50));
        System.out.println("Ingrese los datos de su tarjeta para proceder con la operación");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digitos de su tarjeta");
        t1.setNumTarjeta(sc.nextLine());
        System.out.println("El número secreto(CVV)");
        t1.setCVV(sc.nextLine());
        System.out.println("Fecha de vencimiento - YYYY-MM-DD");
        t1.setFVencimiento(LocalDate.parse(sc.nextLine()));
        t1.setSaldo(3000);
        // Verificamos la tarjeta
        if (t1.verificarTarjeta()) {
            try (Socket socket = new Socket("localhost", 3000)) {
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write(t1.toString().getBytes());

                InputStream inputStream = socket.getInputStream();
                byte[] buffer = new byte[1024];
                int bytesRead = inputStream.read(buffer);
                String serverResponse = new String(buffer, 0, bytesRead);
                System.out.println("Respuesta del servidor: " + serverResponse);
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
    }
}
