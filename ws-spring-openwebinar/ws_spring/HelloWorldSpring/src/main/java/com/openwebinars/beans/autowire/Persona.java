package com.openwebinars.beans.autowire;

import lombok.Getter;
import lombok.Setter;

public class Persona {
	
	@Getter
	@Setter
	private String nombre;
	
	

	public Persona() {
		super();
	}

	


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}




	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	
	
	
	

}
