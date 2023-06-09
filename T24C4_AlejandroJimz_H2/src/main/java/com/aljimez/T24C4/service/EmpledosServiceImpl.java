package com.aljimez.T24C4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.aljimez.T24C4.dao.IEmpleadoDAO;
import com.aljimez.T24C4.dto.Empleado;

@Service
public class EmpledosServiceImpl {

	// Utilizamos los metodos de la interface IEmpleadoDAO, es como si
	// instaciaramos.
	@Autowired
	IEmpleadoDAO iEmpleadoDAO;

	public List<Empleado> listarEmpleados() {

		return iEmpleadoDAO.findAll();
	}

	public Empleado createEmpleado(Empleado empleado) {
		return iEmpleadoDAO.save(empleado);
	}

	public Empleado empleadoXID(Long id) {

		return iEmpleadoDAO.findById(id).get();
	}

	public List<Empleado> listEmpleadoByJob(String trabajo) {
		return iEmpleadoDAO.findByTrabajo(trabajo);
	}

	public Empleado actualizarEmpleado(Empleado empleado) {

		return iEmpleadoDAO.save(empleado);
	}


	public void eliminarEmpleado(Long id) {

		iEmpleadoDAO.deleteById(id);
	}

}
