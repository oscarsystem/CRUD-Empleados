package com.empleados.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empleados.sistema.entity.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, String>{

}
