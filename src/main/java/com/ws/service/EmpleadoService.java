package com.ws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws.entity.Empleado;
import com.ws.repository.EmpleadoRepository;

@Service
public class EmpleadoService {
	
	/**
	 * Aqui con Autorwired aplicamos 
	 * inyección de dependencias.
	 */
	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	public Empleado insertar(Empleado emp) {
		return empleadoRepository.save(emp); //el save retorna un emp.
	}
	
	/**
	* El metodo save se encarga de verificar
	* si es un nuevo usuario o si se modifico
	* uno existente. 
	* */
	public Empleado actualizar(Empleado emp) {
		return empleadoRepository.save(emp); 
	}
	
	/**
	 * Listamos todos los usuarios de la
	 * tabla.
	 * */
	public List<Empleado> listar(){
		return empleadoRepository.findAll();
	}
	
	/** Metodo para eliminar. */
	public void eliminar(Empleado emp) {
		empleadoRepository.delete(emp);
	}
	
}
