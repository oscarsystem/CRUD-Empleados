package com.empleados.sistema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empleados.sistema.entity.Empleado;
import com.empleados.sistema.service.EmpleadoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@PostMapping(value = "empleado/guardar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Empleado> guardarEmpleado(@RequestBody Empleado empleado) {
		return empleadoService.guardarEmpleado(empleado);
	}
	
	@GetMapping(value = "empleado/listar")
	public ResponseEntity<List<Empleado>> listarEmpleado (){
		return empleadoService.listarEmpleados();
	}
	
	@DeleteMapping(value = "empleado/eliminar/{id}")
	public ResponseEntity<Empleado> eliminarEmpleado (@PathVariable(value = "id") String idEmpleado){
		return empleadoService.eliminarEmpleado(idEmpleado);
	}
	
	@PutMapping(value = "empleado/actualizar")
	public ResponseEntity<Empleado> actualizarEmpleado(@RequestBody Empleado empleado){
		return empleadoService.actualizarEmpleado(empleado);
	}
	
}
