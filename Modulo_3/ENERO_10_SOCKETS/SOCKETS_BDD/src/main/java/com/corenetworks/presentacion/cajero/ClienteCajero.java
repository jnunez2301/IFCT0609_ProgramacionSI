package com.corenetworks.presentacion.cajero;

import com.corenetworks.modelo.CuentaBancaria;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteCajero {
    public static void main(String[] args) {
        CuentaBancaria cB1 = solicitarDatos();
        try (Socket cliente = new Socket("localhost", 3000)) {

        } catch (UnknownHostException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }


    }

    private static CuentaBancaria solicitarDatos() {
        CuentaBancaria cb1 = new CuentaBancaria();
        Scanner sc = new Scanner(System.in);
        int tipoOperacion = 0;
        while(true) {

            System.out.printf("%s%n", "-".repeat(50));
            System.out.printf("%-50s%n", "MENU BANCARIO");
            System.out.printf("%s%n", "-".repeat(50));
            System.out.printf("%s%n", "1) Consultar Saldo");
            System.out.printf("%s%n", "2) Retirar una cantidad");
            System.out.printf("%s%n", "3) Ingresar una cantidad");
            System.out.printf("%s%n", "4) Salir");
            System.out.printf("%s%n", "Elija la operación");

            tipoOperacion = sc.nextInt();
            cb1.setTipoOperacion(tipoOperacion);
            if(tipoOperacion == 4){
                break;
            }

            if (cb1.getTipoOperacion() == 2 || cb1.getTipoOperacion() == 3) {
                System.out.println(cb1.getCantidad());
            }

            System.out.printf("%s%n", "Escriba su numero de cuenta");
            cb1.setNumeroCuenta(sc.nextLine());
            sc.nextLine();
            System.out.printf("%s%n", "Escriba la cantidad");
            cb1.setCantidad(sc.nextDouble());


        }
        sc.close();
        return cb1;
    }
}
