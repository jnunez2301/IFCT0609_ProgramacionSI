package com.corenetworks.ProyectoCapas;

import com.corenetworks.ProyectoCapas.modelo.Pedidos;
import com.corenetworks.ProyectoCapas.servicio.IPedidoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Optional;

@SpringBootApplication
public class ProyectoCapasApplication implements CommandLineRunner {

	//Instanciamos Service
	@Autowired
	private IPedidoServicio pedidoServicio;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoCapasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pedidos p1 = new Pedidos(0, LocalDate.now(), "CASH", 1000);
		System.out.println(pedidoServicio.insertar(p1));
		/*
		p1.setIdPedido(1);
		p1.setImporte(500);
		System.out.println(pedidoServicio.modificar(p1));
		System.out.println(pedidoServicio.insertar(new Pedidos(0, LocalDate.now(), "CASH", 5000)));
		System.out.println(pedidoServicio.obtenerUno(2));
		pedidoServicio.eliminar(1);
		*/
		Optional<Pedidos> oP1 = Optional.of(new Pedidos(5, LocalDate.now(), "CASH", 100));
		System.out.println(oP1.isEmpty());
		System.out.println("Existe un objecto " + oP1.isPresent());
		/*System.out.println(pedidoServicio.obtenerUno(2));*/
		System.out.println(pedidoServicio.obtenerTodos());
	}
}
