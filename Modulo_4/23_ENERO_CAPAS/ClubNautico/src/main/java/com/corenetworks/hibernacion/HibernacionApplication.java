package com.corenetworks.hibernacion;

import com.corenetworks.hibernacion.modelo.Barcos;
import com.corenetworks.hibernacion.modelo.Patron;
import com.corenetworks.hibernacion.modelo.Salidas;
import com.corenetworks.hibernacion.modelo.Socios;
import com.corenetworks.hibernacion.servicio.IPatronServicio;
import com.corenetworks.hibernacion.servicio.ISocioServicio;
import com.corenetworks.hibernacion.servicio.SocioServicioImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HibernacionApplication implements CommandLineRunner {
	@Autowired
	ISocioServicio socioServicio;
	@Autowired
	IPatronServicio patronServicio;
	public static void main(String[] args) {
		SpringApplication.run(HibernacionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		--- SOCIOS_BARCOS ------ SOCIOS_BARCOS ------ SOCIOS_BARCOS ---
		List<Barcos> barcosList = new ArrayList<>();
		Barcos b1 = new Barcos("12345678W", "amarrao", "Barquito", 20);
		Barcos b2 = new Barcos("12345672W", "amarrao2", "Barquito2", 10);
		Socios nuevoSocio = new Socios("12345678D", "Pedrito", "Monte Perdido");
		// Añadimos el socio a los barcos
		b1.setS1(nuevoSocio);
		b2.setS1(nuevoSocio);

		//Añadimos los socios a la lista
		barcosList.add(b1);
		barcosList.add(b2);

		//Añadimos la lista de barcos al socio
		nuevoSocio.setBarcosList(barcosList);

		//Ejecutamos para el front
//		System.out.println(socioServicio.insertar(nuevoSocio));
		System.out.println("_".repeat(50));
		System.out.println(socioServicio.obtenerUno("12345678D"));
		--- SOCIOS_BARCOS ------ SOCIOS_BARCOS ------ SOCIOS_BARCOS ---
		*/
		Barcos b1 = new Barcos("12345678W", "amarrao", "Barquito", 20);
		Barcos b2 = new Barcos("12345672W", "amarrao2", "Barquito2", 10);

		Patron p1 = new Patron("98765432D", "Pablo Escobar", "Medellin");

		Salidas s1 = new Salidas(0, LocalDate.now(), LocalTime.now(), "U.S.A");
		Salidas s2 = new Salidas(1, LocalDate.now(), LocalTime.now(), "Mexico");

		s1.setB1(b1);
		s1.setP1(p1);

		s2.setB1(b2);
		s2.setP1(p1);

		List<Salidas> salidasList = new ArrayList<>();

		salidasList.add(s1);
		salidasList.add(s2);

		p1.setSalidas(salidasList);

		System.out.println(patronServicio.insertar(p1));
	}
}
