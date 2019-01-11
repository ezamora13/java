package com.openwebinars.beans.autowire;

import lombok.Getter;
import lombok.Setter;

public class Ciudad {

	@Getter
	@Setter
	private String nombre;
	@Getter
	@Setter
	private Ciudad ciudad;

	public Ciudad() {
	}

	public Ciudad(String nombre, Ciudad ciudad) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Ciudad [nombre=" + nombre + ", ciudad=" + ciudad + "]";
	}

}
