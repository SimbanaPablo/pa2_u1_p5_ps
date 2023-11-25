package com.uce.edu.transferencia.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.transferencia.repository.ICuentaBancariaRepository;
import com.uce.edu.transferencia.repository.ITransferenciaRepository;
import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;
import com.uce.edu.transferencia.repository.modelo.Transferencia;

@Service
public class TransferenciaServiceImp implements ITransferenciaService {

	@Autowired
	private ICuentaBancariaRepository iCuentaBancariaRepository;
	
	@Autowired
	private ITransferenciaRepository iTransferenciaRepository;
	
	@Override
	public Transferencia buscar(String numero) {
		return this.iTransferenciaRepository.seleccionar(numero);
	}

	@Override
	public void guardar(Transferencia transferencia) {
		this.iTransferenciaRepository.insertar(transferencia);
		
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		this.iTransferenciaRepository.actualizar(transferencia);
		
	}

	@Override
	public void eliminar(String numero) {
		this.iTransferenciaRepository.eliminar(numero);
		
	}

	@Override
	public void realizar(String numeroOrigen, String numeroDestino, BigDecimal monto) {
		//1. Buscar Cta origen
		CuentaBancaria ctaOrigen = this.iCuentaBancariaRepository.seleccionar(numeroOrigen);
		//2. Consultar el saldo
		//3. Validar el saldo
		//4. Restar el monto
		//5. Actualizar origen
		//6. Buscar Cta destino 
		//7. Consultar saldo
		//8. Sumar el monto
		//9. actualizar Cta destino
	   //10. crear la transferencia  
		
	}
}
