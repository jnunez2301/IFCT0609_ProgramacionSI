package com.corenetworks._ENERO;

import com.corenetworks._ENERO.modelo.Cliente;
import com.corenetworks._ENERO.repositorio.clase.CapaPersistencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	Cliente c1;
	@Autowired
	CapaPersistencia cP1;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(cP1.insertar(c1));
	}
}
