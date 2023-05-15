package com.empleados.sistema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empleados.sistema.entity.Cargo;
import com.empleados.sistema.service.CargoService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class CargoController {

	@Autowired
	private CargoService cargoService;
	
	@PostMapping(value = "/cargo/guardar")
	public ResponseEntity<Cargo>guardarCargo(@RequestBody Cargo cargo){
		return cargoService.guardarCargo(cargo);
	}
	
	@GetMapping(value = "cargo/listar")
	public ResponseEntity<List<Cargo>> listarCargo(){
		return cargoService.listarCargo();
	}
	
}
