package com.demoCapas.demo;

import com.demoCapas.demo.modelo.Pedido;
import com.demoCapas.demo.servicio.clases.ServicioPedido;
import com.demoCapas.demo.servicio.interfaces.IServicioPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	ServicioPedido sp;
	@Autowired
	IServicioPedido capaServicio;
	@Autowired
	Pedido p1;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(sp.insertar(p1));
	}
}
