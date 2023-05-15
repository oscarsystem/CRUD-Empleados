package com.empleados.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empleados.sistema.entity.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, String>{

}
