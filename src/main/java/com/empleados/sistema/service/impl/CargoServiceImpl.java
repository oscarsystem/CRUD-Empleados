package com.empleados.sistema.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.empleados.sistema.entity.Cargo;
import com.empleados.sistema.repository.CargoRepository;
import com.empleados.sistema.service.CargoService;
import com.empleados.sistema.util.LogerUtil;
import com.empleados.sistema.util.LogsError;

@Service
public class CargoServiceImpl implements CargoService {

	@Autowired
	private CargoRepository cargoRepository;
	
	@Override
	public ResponseEntity<Cargo> guardarCargo(Cargo cargo) {
		try {

			if(listarCargo().getBody().size() < 3) {
				cargoRepository.save(cargo);				
			}else {
				LogerUtil.logMessage("Metodo, En cosntruccion, por ahora solo permite insertar 3 Cargos");
			}
			return new ResponseEntity<>(cargo, HttpStatus.OK);
		} catch (Exception e) {
			LogerUtil.logException(e, LogsError.ERROR);
			return new ResponseEntity<>(cargo, HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public ResponseEntity<List<Cargo>> listarCargo() {
		
		try {
			List<Cargo> listCargo = cargoRepository.findAll();
			return new ResponseEntity<>(listCargo, HttpStatus.OK);
		} catch (Exception e) {
			LogerUtil.logException(e, LogsError.ERROR);
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}

}
