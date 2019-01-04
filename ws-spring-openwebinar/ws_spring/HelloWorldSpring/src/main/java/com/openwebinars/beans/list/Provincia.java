package com.openwebinars.beans.list;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Provincia {

	@Getter
	@Setter
	private String nombre;
	@Getter
	@Setter
	private List<Poblacion> poblaciones;

	public Provincia() {
		super();
	}

	public Provincia(String nombre, List<Poblacion> poblaciones) {
		super();
		this.nombre = nombre;
		this.poblaciones = poblaciones;
	}

	@Override
	public String toString() {
		return "Provincia [nombre=" + nombre + ", poblaciones=" + poblaciones + "]";
	}

	
	
	
}
