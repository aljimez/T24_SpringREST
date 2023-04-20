package com.aljimez.T23C4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.aljimez.T23C4.dao.IEmpleadoDAO;
import com.aljimez.T23C4.dto.Empleado;
import com.aljimez.T23C4.utils.Jobs;
@RestController
public class EmpledosServiceImpl {

	//Utilizamos los metodos de la interface IEmpleadoDAO, es como si instaciaramos.
	@Autowired
	IEmpleadoDAO iEmpleadoDAO;
	
	public List<Empleado> listarEmpleados() {
		
		return iEmpleadoDAO.findAll();
	}

	public Empleado guardarEmpleado(Empleado empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}

	public Empleado empleadoXID(Long id) {
		
		return iEmpleadoDAO.findById(id).get();
	}
	

	public Empleado actualizarEmpleado(Empleado empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}

	public void eliminarEmpleado(Long id) {
		
		iEmpleadoDAO.deleteById(id);		
	}

	public List<Empleado> listarEmpleadoNombre(String nombre) {
		
		return iEmpleadoDAO.findByNombre(nombre);
	}
	
	public List<Empleado> listEmpleadoByJob(String trabajo) {
		Jobs trabajo_actual = Jobs.OPERARIO;
		switch (trabajo) {
		case "OPERARIO":
			trabajo_actual = Jobs.OPERARIO;
			break;
			
		case "COMERCIAL":
			trabajo_actual = Jobs.COMERCIAL;
			break;
			
		case "TECNICO":
			trabajo_actual = Jobs.TECNICO;
			break;

		default:
			break;
		}
		return iEmpleadoDAO.findByTrabajo(trabajo_actual);
	}
}
