package com.openwebinars.beans.list;

import lombok.Getter;
import lombok.Setter;

public class Poblacion {

	@Getter
	@Setter
	private String nombre;
	@Getter
	@Setter
	private int cantidadHabitantes;

	public Poblacion() {
		super();
	}

	public Poblacion(String nombre, int cantidadHabitantes) {
		super();
		this.nombre = nombre;
		this.cantidadHabitantes = cantidadHabitantes;
	}

	@Override
	public String toString() {
		return "Poblacion [nombre=" + nombre + ", cantidadHabitantes=" + cantidadHabitantes + "]";
	}


}
