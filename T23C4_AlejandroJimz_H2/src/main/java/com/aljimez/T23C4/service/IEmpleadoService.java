package com.aljimez.T23C4.service;

import java.util.List;

import com.aljimez.T23C4.dto.Empleado;
public interface IEmpleadoService {
	//Metodos del CRUD
	public  List<Empleado> listarEmpleados(); //Listar All 
	
	
	public Empleado createEmpleado(Empleado empleado); 

	public  Empleado empleadosXID(Long id); //Leer datos de un empleado READ
	
	
	public List<Empleado> listEmpleadoByJob(String trabajo);

	
	public  Empleado actualizarEmpleado(Empleado empleados); //Actualiza datos del empleado UPDATE
	
	public  void eliminarEmpleado(Long id);// Elimina el empleado DELETE
	
	


}
