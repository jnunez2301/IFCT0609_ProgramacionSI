package com.crud.demo;

import com.crud.demo.modelo.Autobuses;
import com.crud.demo.modelo.Conductores;
import com.crud.demo.modelo.Lugares;
import com.crud.demo.modelo.Visitas;
import com.crud.demo.servicio.IAutobusesServicio;
import com.crud.demo.servicio.IConductorServicio;
import com.crud.demo.servicio.ILugaresServicio;
import com.crud.demo.servicio.IVisitasServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private IAutobusesServicio autobusesServicio;
	@Autowired
	private IConductorServicio conductorServicio;
	@Autowired
	private ILugaresServicio lugaresServicio;
	@Autowired
	private IVisitasServicio visitasServicio;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Autobuses a1 = new Autobuses(
				"21345238W",
				LocalDate.of(2022, 10, 30)
		);
		Conductores c1 = new Conductores("89765432D", "Juanito");
		Lugares l1 = new Lugares(0, "El Retiro");
		Visitas visitas = new Visitas(LocalDate.now(), c1, a1, l1);

		System.out.println(autobusesServicio.insertar(a1));
		System.out.println(conductorServicio.insetar(c1));
		System.out.println(lugaresServicio.insertar(l1));
		System.out.println(visitasServicio.insertar(visitas));
		System.out.println(lugaresServicio.obtenerTodos());
	}
}
