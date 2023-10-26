package com.corenetworks.presentacion;

import com.corenetworks.modelo.Pedido;

import java.util.Scanner;

public class probarPedido {
    public static void main(String[] args) {
        Pedido p = new Pedido();
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte la id del pedido ");
        p.setIdPedido(sc.nextInt());
        System.out.println("Ingrese su forma de pago 'e' para efectivo y 't' para tarjeta");
        p.setFormaPago(sc.next().charAt(0));
        System.out.println("Importe del pedido");
        p.setImporte(sc.nextInt());

        System.out.println(
                "\n FACTURA Nº" + p.getIdPedido()
                        + "\n IMPORTE " + p.getImporte()+ " €"
                        + "\n FORMA DE PAGO " + p.getFormaPago()
                        + "\n IVA " + p.getIVA() + " €"
                        + "\n TOTAL " + (p.getImporte() + p.getIVA())
        );
        sc.close();
    }
}
