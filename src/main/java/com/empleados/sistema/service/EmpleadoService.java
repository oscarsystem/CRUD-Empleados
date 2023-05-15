package com.empleados.sistema.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.empleados.sistema.entity.Empleado;

public interface EmpleadoService {
	
	ResponseEntity<Empleado> guardarEmpleado(Empleado empleado);
	
	ResponseEntity<List<Empleado>> listarEmpleados();
	
	ResponseEntity<Empleado> eliminarEmpleado(String idEmpleado);
	
	ResponseEntity<Empleado> actualizarEmpleado(Empleado empleado);
	

}
