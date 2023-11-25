package com.uce.edu.transferencia.repository;

import java.util.ArrayList;
import java.util.List;

import com.uce.edu.transferencia.repository.modelo.Transferencia;

public class TranferenciaRepositoryImp implements ITransferenciaRepository {
	
	public static List<Transferencia> base = new ArrayList<Transferencia>();
	
	
	@Override
	public Transferencia seleccionar(String numero) {
		System.out.println("Se selecciono el codigo: " +numero);
		for(Transferencia ma: base) {
			if(ma.getNumero().equals(numero))
				return ma;
			return null;
		}
		return new Transferencia();
	}

	@Override
	public void insertar(Transferencia trans) {
		base.add(trans);
	}

	@Override
	public void actualizar(Transferencia trans) {
		this.eliminar(trans.getNumero());
		this.insertar(trans);
	}

	@Override
	public void eliminar(String numero) {
		Transferencia trans = this.seleccionar(numero);
		base.remove(trans);
	}

	

}
