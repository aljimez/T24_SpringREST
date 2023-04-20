package com.aljimez.T23C4.dto;

import java.util.Date;


//import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import com.aljimez.T23C4.Trabajo.Trabajo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="empleado")//en caso que la tabala sea diferente
public class Empleado {

	//Atributos de entidad cliente
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long id;
		@Column(name = "nombre")//no hace falta si se llama igual
		private String nombre;
		@Column(name = "trabajo")//no hace falta si se llama igual
		private String trabajo;
		@Temporal(TemporalType.TIMESTAMP)
		private Date fecha;
		@Column(name = "salario")
		private double salario;
		
	
		//Constructores
		
		public Empleado() {
		
		}

		/**
		 * @param id
		 * @param nombre
		 * @param apellido
		 * @param direccion
		 * @param dni
		 * @param fecha
		 */
		
		public Empleado(Long id, String nombre,  String trabajo) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.trabajo = trabajo;
			this.salario = obtenerSalarioPorTrabajo(trabajo);
		}


		public double getSalario() {
			
			
			return salario;
		}

		public void setSalario(int salario) {
		
			this.salario = salario;
		}

		public double obtenerSalarioPorTrabajo(String trabajo) {
			Trabajo[] trabajos_disponibles = Trabajo.values();

			for (Trabajo trabajos : trabajos_disponibles) {
				if (trabajos.name().equalsIgnoreCase(trabajo)) {
					return trabajos.getSalario();
				}
			}
			return 0;
		}
		public String getTrabajo() {
			return trabajo;
		}
		public void setTrabajo(String trabajo) {
			
			this.trabajo = trabajo;
			
		}

		//Getters y Setters
		
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


		/**
		 * @return the dni
		 */
	
		/**
		 * @return the fecha
		 */
		public Date getFecha() {
			return fecha;
		}

		/**
		 * @param fecha the fecha to set
		 */
		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}

		@Override
		public String toString() {
			return "Empleado [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + ", fecha=" + fecha
					+ ", salario=" + salario + "]";
		}

		

		
	
}
