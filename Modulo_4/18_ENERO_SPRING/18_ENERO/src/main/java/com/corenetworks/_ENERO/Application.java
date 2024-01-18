package com.corenetworks._ENERO;

import com.corenetworks._ENERO.modelo.Cliente;
import com.corenetworks._ENERO.persistencia.CapaPersistenciaMongoDB;
import com.corenetworks._ENERO.persistencia.CapaPersistenciaPostgres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	Cliente c1;
	@Autowired
	CapaPersistenciaMongoDB cpM;
	@Autowired
	CapaPersistenciaPostgres cpP;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		c1.setDni("1234");
		c1.setNombre("Jon");
		System.out.println(cpM.insertar(c1));
		System.out.println(cpP.insertar(c1));
	}
}
