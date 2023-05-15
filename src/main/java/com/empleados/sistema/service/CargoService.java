package com.empleados.sistema.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.empleados.sistema.entity.Cargo;

public interface CargoService {

	ResponseEntity<Cargo> guardarCargo(Cargo cargo);
	ResponseEntity<List<Cargo>> listarCargo();
	
}
