package com.empleados.sistema.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.empleados.sistema.entity.Empleado;
import com.empleados.sistema.repository.EmpleadoRepository;
import com.empleados.sistema.service.EmpleadoService;
import com.empleados.sistema.util.LogerUtil;
import com.empleados.sistema.util.LogsError;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	
	@Autowired
	EmpleadoRepository empleadoRepository;
	
	@Override
	public ResponseEntity<Empleado> guardarEmpleado(Empleado empleado) {

		try {
			if(empleadoRepository.findAll().size() <= 5) {
				empleadoRepository.save(empleado);				
			}else {
				LogerUtil.logMessage("Metodo, En cosntruccion, por ahora solo permite insertar 5 Empleados");
			}
			return new ResponseEntity<>(empleado, HttpStatus.OK);
		} catch (Exception e) {
			LogerUtil.logException(e, LogsError.ERROR);
			return new ResponseEntity<>(empleado, HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<List<Empleado>> listarEmpleados() {
		try {
			List<Empleado> listEmpleados = empleadoRepository.findAll();		
			return new ResponseEntity<>(listEmpleados, HttpStatus.OK);
		} catch (Exception e) {
			LogerUtil.logException(e, LogsError.ERROR);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
		
	}

	@Override
	public ResponseEntity<Empleado> eliminarEmpleado(String idEmpleado) {
		try {
			empleadoRepository.deleteById(idEmpleado);		
			return new ResponseEntity<>(null, HttpStatus.OK);
		} catch (Exception e) {
			LogerUtil.logException(e, LogsError.ERROR);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
		
	}

	@Override
	public ResponseEntity<Empleado> actualizarEmpleado(Empleado empleado) {

		try {
			if(empleadoRepository.findAll().size() <= 5) {
				empleadoRepository.save(empleado);	
			}else {
				LogerUtil.logMessage("Metodo, En cosntruccion, por ahora solo permite insertar 5 Empleados");
			}
			return new ResponseEntity<>(empleado, HttpStatus.OK);
		} catch (Exception e) {
			LogerUtil.logException(e, LogsError.ERROR);
			return new ResponseEntity<>(empleado, HttpStatus.BAD_REQUEST);
		}
	}

}
