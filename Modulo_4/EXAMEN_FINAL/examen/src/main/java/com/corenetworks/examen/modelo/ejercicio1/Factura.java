package com.corenetworks.examen.modelo.ejercicio1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Factura{

    private IImpuesto impuesto;
    private List<Producto> productos;

    public String calcularTotalFactura(){
        System.out.printf("%s Factura %s\n", "-".repeat(10), "-".repeat(10));
        double importeTotal = 0;
        for (Producto producto : productos) {
            importeTotal += producto.getPrecio() + impuesto.calcularImpuesto(producto);

            System.out.printf("Producto: %s:  \nPrecio: %.2f IVA: %.2f%n", producto.getNombre(), producto.getPrecio(),impuesto.calcularImpuesto(producto));
        }

        return "El importe total es: " + importeTotal + "€";
    }

}
