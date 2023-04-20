package com.aljimez.T23C4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.aljimez.T23C4.service.EmpledosServiceImpl;
import com.aljimez.T23C4.dto.Empleado;


@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpledosServiceImpl empleadoServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleado>listarEmpleados(){
		
		return empleadoServiceImpl.listarEmpleados();
	}
	@GetMapping("/empleados/nombre/{nombre}")
	public List<Empleado>listarEmpleadoNombre(@PathVariable(name="nombre")String nombre){
		return empleadoServiceImpl.listarEmpleadoNombre(nombre);
	}
	@PostMapping("/empleados")
	public Empleado salvarEmpleado(@RequestBody Empleado empleados){
		return empleadoServiceImpl.guardarEmpleado(empleados);
	}
	@GetMapping("/empleados/{id}")
	public Empleado empleadoXID(@PathVariable(name="id") Long id){
		Empleado empleado_xid= new Empleado();
		
		empleado_xid=empleadoServiceImpl.empleadoXID(id);
		
		System.out.println("Cliente XID: "+empleado_xid);
		
		return empleado_xid;
	}

	@GetMapping("/empleados/trabajo/{nombre}")
	public List<Empleado> listEmpleadosJob(@PathVariable(name="nombre") String nombre) {
		return empleadoServiceImpl.listEmpleadoByJob(nombre);
	}
	
	@PutMapping("/empleados/{id}")
		public Empleado actualizarEmpleado(@PathVariable(name="id")Long id,@RequestBody Empleado empleado) {
			
		Empleado empleado_seleccionado= new Empleado();
		Empleado empleado_actualizado= new Empleado();
			
			empleado_seleccionado= empleadoServiceImpl.empleadoXID(id);
			
			empleado_seleccionado.setNombre(empleado.getNombre());
			empleado_seleccionado.setTrabajo(empleado.getTrabajo());

			empleado_seleccionado = empleadoServiceImpl.actualizarEmpleado(empleado_seleccionado);
			
			System.out.println("El empleado actualizado es: "+ empleado_actualizado);
			
			return empleado_actualizado;
	}
	@DeleteMapping("/empleados/{id}")
	public void eliminarEmpleado(@PathVariable(name="id")Long id) {
		empleadoServiceImpl.eliminarEmpleado(id);
	}
}
