package com.aljimez.T24C4.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado") // en caso que la tabala sea diferente
public class Empleado {

	// Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column // no hace falta si se llama igual
	private String nombre;
	@Column // no hace falta si se llama igual
	private String trabajo;
	@Column
	private double salario;

	// Constructores

	public Empleado() {

	}

	public Empleado(Long id, String nombre, String trabajo, double salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.salario = salario;
	}

	public double getSalario() {

		return salario;// trabajoDisponible(trabajo);
	}

	public void setSalario(double salario) {

		this.salario = salario;
	}

	public String getTrabajo() {

		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
		switch (trabajo) {
		case "gestor":
			salario = 2000.00;
			break;
		case "operario":
			salario = 1800.00;
			break;
		case "administrador":
			salario = 1000.00;
			break;
		}
	}

	// Getters y Setters

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + ", salario=" + salario + "]";
	}

}
