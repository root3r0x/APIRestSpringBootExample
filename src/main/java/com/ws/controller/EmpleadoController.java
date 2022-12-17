package com.ws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ws.entity.Empleado;
import com.ws.service.EmpleadoService;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

	@Autowired
	private EmpleadoService empService;
	
	@GetMapping
	public List<Empleado> all(){
		return empService.listar();
	}
	
	/**
	 * 
	 * @param emp Objeto tipo empleado para almacenar en la base 
	 * de datos.
	 * Con RequestBody le decimos que trabajaremos un JSON.
	 */
	@PostMapping
	public Empleado add(@RequestBody Empleado emp) {
		return empService.insertar(emp);		
	}
	
	@PutMapping
	public Empleado update(@RequestBody Empleado emp) {
		return empService.actualizar(emp);
	}
	
	@DeleteMapping
	public void delete(@RequestBody Empleado emp) {
		empService.eliminar(emp);
	}
}
