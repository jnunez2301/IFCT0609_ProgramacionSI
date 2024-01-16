package com.corenetworks.presentacion;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ejercicio_3 {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(3000)) {
            while (true) {
                Socket socket = serverSocket.accept();

                // Recibir datos del cliente
                InputStream inputStream = socket.getInputStream();
                byte[] buffer = new byte[1024];
                int bytesRead = inputStream.read(buffer);
                String clienteInfo = new String(buffer, 0, bytesRead);
                System.out.println("Datos recibidos del cliente: " + clienteInfo);

                // Enviar respuesta al cliente
                OutputStream outputStream = socket.getOutputStream();
                String respuesta = "Transacción exitosa";
                outputStream.write(respuesta.getBytes());

                // Cierra la conexión del cliente
                socket.close();
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
