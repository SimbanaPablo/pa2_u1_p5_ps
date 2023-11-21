package com.uce.edu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Materia;
import com.uce.edu.service.IMateriaService;

@SpringBootApplication
public class Pa2U1P5PsApplication implements CommandLineRunner{
	
	@Autowired
	private Materia materia;

	@Autowired
	private IMateriaService iMateriaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5PsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Materia analisis = new Materia();
		analisis.setCodigo("an");
		analisis.setNombre("Analisis");
		analisis.setNumeroCreditos("20");
		
		Materia fisica = new Materia();
		fisica.setCodigo("fs");
		fisica.setNombre("Fisica");
		fisica.setNumeroCreditos("12");
		
		
		this.iMateriaService.registrar(fisica);
		this.iMateriaService.registrar(analisis);
		
		this.materia.setCodigo("av");
		this.materia.setNombre("P. Avanzada");
		this.materia.setNumeroCreditos("10");
	
		this.iMateriaService.registrar(materia);
		
		List<Materia> reporte = this.iMateriaService.buscarTodos();
		for(Materia mate: reporte) {
			System.out.println(mate);
		}
		System.out.println("--------------------------------");
		
		this.iMateriaService.eliminar("fs");
		
		for(Materia mate: reporte) {
			System.out.println(mate);
		}

	}
}
