package com.aljimez.T23C4.service;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.aljimez.T23C4.dto.Empleado;
@RestController
public interface IEmpleadoService {
	//Metodos del CRUD
	public abstract List<Empleado> listarEmpleados(); //Listar All 
	
	public abstract Empleado guardarEmpleado(Empleado empleados);	//Guarda un empleado CREATE
	
	public abstract Empleado empleadosXID(Long id); //Leer datos de un empleado READ
	
	public abstract List<Empleado> listarEmpleadoNomnbre(String nombre);//Listar Empleados por campo nombre
	
	public abstract Empleado actualizarEmpleado(Empleado empleados); //Actualiza datos del empleado UPDATE
	
	public abstract void eliminarEmpleado(Long id);// Elimina el empleado DELETE
	
	public List<Empleado> listEmpleadoByJob(String trabajo);

	
}
