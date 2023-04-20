package com.aljimez.T23C4.Trabajo;

public enum Trabajo {
	GESTOR(2500), OPERARIO(1500), ADMINISTRATOR(1800);

	private double salario;

	Trabajo(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return this.salario;
	}
}
