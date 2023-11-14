package com.uce.edu;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ioc.di.Estudiante;

@SpringBootApplication
public class Pa2U1P5PsApplication implements CommandLineRunner{
	
	@Autowired
	private Estudiante estudiante;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5PsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		estudiante.setNombre("Pablo");
		estudiante.setApellido("Simbaña");
		estudiante.setCedula("1752245041");
		estudiante.setSueldo(new BigDecimal(100));
		System.out.println(estudiante);
	}
}
