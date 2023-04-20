package com.aljimez.T23C4.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aljimez.T23C4.dto.Empleado;
public interface IEmpleadoDAO extends JpaRepository<Empleado, Long>{
	
	public List<Empleado> findByTrabajo(String trabajo);

	
}