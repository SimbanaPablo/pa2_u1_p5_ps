package com.uce.edu.transferencia.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoryImp implements ICuentaBancariaRepository{
	
	public static List<CuentaBancaria> base = new ArrayList<CuentaBancaria>();
	

	@Override
	public CuentaBancaria seleccionar(String numero) {
		for(CuentaBancaria ma: base) {
			if(ma.getNumero().equals(numero))
				return ma;
			return null;
		}
		return new CuentaBancaria();
	}

	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		base.add(cuentaBancaria);
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		this.eliminar(cuentaBancaria.getNumero());
		this.insertar(cuentaBancaria);
	}

	@Override
	public void eliminar(String numero) {
		CuentaBancaria cuenta = this.seleccionar(numero);
		base.remove(cuenta);
	}


}
