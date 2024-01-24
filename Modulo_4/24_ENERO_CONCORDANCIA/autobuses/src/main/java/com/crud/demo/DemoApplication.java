package com.crud.demo;

import com.crud.demo.modelo.Autobuses;
import com.crud.demo.modelo.Conductores;
import com.crud.demo.modelo.Lugares;
import com.crud.demo.servicio.IAutobusesServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private IAutobusesServicio autobusesServicio;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Autobuses a1 = new Autobuses(
				"12345238W",
				LocalDate.of(2022, 10, 30)
		);
		Conductores c1 = new Conductores("98765432D", "Pedrito");
		Lugares l1 = new Lugares(0, "El Retiro");
		//System.out.println(iemtServicio.insertar(a1));
		//System.out.println(iemtServicio.modificar(a1));
		//iemtServicio.eliminar("12345238W");
		//System.out.println(iemtServicio.obtenerUno("12345238W"));
		//System.out.println(iemtServicio.obtenerTodos());
		//System.out.println(autobusesServicio.obtenerTodos());
	}
}
