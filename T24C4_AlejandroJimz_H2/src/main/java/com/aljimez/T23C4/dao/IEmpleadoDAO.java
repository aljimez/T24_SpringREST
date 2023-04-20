package com.aljimez.T23C4.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.aljimez.T23C4.dto.Empleado;
import com.aljimez.T23C4.utils.Jobs;
@RestController
public interface IEmpleadoDAO extends JpaRepository<Empleado, Long>{
	
	//Listar empleados por campo nombre
	public List<Empleado> findByNombre(String nombre);

	public List<Empleado> findByTrabajo(Jobs trabajo_actual);

	
}