package com.corenetworks.examen;

import com.corenetworks.examen.modelo.ejercicio1.Factura;
import com.corenetworks.examen.modelo.ejercicio1.IvaGeneral;
import com.corenetworks.examen.modelo.ejercicio1.IvaSuperReducido;
import com.corenetworks.examen.modelo.ejercicio1.Producto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ExamenApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ExamenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Productos
		Producto p1 = new Producto("Té Chai", 5.00);
		Producto p2 = new Producto("Café", 3.00);

		Producto p3 = new Producto("Leche", 3.00);
		Producto p4 = new Producto("Agua Mineral", 2.00);

		List<Producto> productosGenerales = new ArrayList<>();

		productosGenerales.add(p1);
		productosGenerales.add(p2);

		List<Producto> productosReducidos = new ArrayList<>();
		productosReducidos.add(p3);
		productosReducidos.add(p4);

		// implementaciones
		IvaGeneral ivg = new IvaGeneral();
		IvaSuperReducido isr = new IvaSuperReducido();

		// Calculo de factura | Capa presentación
		Factura facturaIvaGeneral = new Factura(ivg, productosGenerales);
		System.out.println(facturaIvaGeneral.calcularTotalFactura());

		Factura facturaIvaReducido = new Factura(isr, productosReducidos);
		System.out.println(facturaIvaReducido.calcularTotalFactura());


	}
}
