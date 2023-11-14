package com.uce.edu.ioc.di;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;
@Component
public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private BigDecimal sueldo;
	
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", sueldo=" + sueldo
				+ "]";
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public BigDecimal getSueldo() {
		return sueldo;
	}
	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}
}
