package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Materia;

public interface IMateriaRepository {
	public Materia seleccionar(String codigo);
	public void insertar();
	public void actualiar();
	public void borrar();

}
