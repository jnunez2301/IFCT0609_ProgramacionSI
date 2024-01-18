package com.demoCapas.demo;

import com.demoCapas.demo.modelo.Factura;
import com.demoCapas.demo.modelo.Inmueble;
import com.demoCapas.demo.modelo.Pedido;
import com.demoCapas.demo.servicio.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	ServicioPedido sp;
	@Autowired
	IServicioPedido capaServicio;
	@Autowired
	Pedido p1;

	@Autowired
	IServicioPedido capaServicioFactura;
	@Autowired
	ServicioFactura svFactura;
	@Autowired
	IServicioInmueble iServicioInmueble;
	@Autowired
	ServicioInmueble servicioInmueble;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(sp.insertar(p1));
//		Factura f1 = new Factura(10, 121, LocalDate.now());
//		System.out.println(svFactura.infoFactura(f1));
		Inmueble imb = new Inmueble(1, "Monte Perdido");

		System.out.println(servicioInmueble.infoInmueble(imb));

	}
}
