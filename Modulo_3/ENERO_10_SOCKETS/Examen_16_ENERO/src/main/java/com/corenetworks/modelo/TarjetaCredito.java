package com.corenetworks.modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TarjetaCredito {
    private String numTarjeta;
    private String CVV;
    private LocalDate fVencimiento;
    private double saldo;
    private double saldoRetirar;

    public boolean verificarTarjeta() {
        String formatoPrint = "%-20s %-20s %n";
        LocalDate fechaActual = LocalDate.now();
        boolean tarjetaValida = true;
        if (fVencimiento.isBefore(fechaActual)) {
            System.out.println("La fecha de vencimiento no puede ser inferior a la actual");
            tarjetaValida = false;
            return tarjetaValida;
        }
        if (numTarjeta.length() != 16) {
            System.out.printf(formatoPrint, "9137", "Error al intentar validar tarjeta");
            tarjetaValida = false;
            return tarjetaValida;
        }
        if (CVV.length() != 3) {
            System.out.printf(formatoPrint, "9221", "El cliente no está introduciendo el CVV");
            tarjetaValida = false;
            return tarjetaValida;
        }
        if (tarjetaValida) {
            System.out.printf(formatoPrint, "0000", "Transacción aceptada");

        }
        if(saldoRetirar > saldo){
            System.out.println("No dispone del saldo suficiente");
            tarjetaValida = false;
        }
        return  tarjetaValida;
    }

    public double saldoDisponible(){
        return saldo - saldoRetirar;
    }


}
