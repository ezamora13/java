package com.openwebinars.beans;

import lombok.Getter;
import lombok.Setter;

public class Culata {
	
	@Getter
	@Setter
	private int cantidadBujias;
	
	

	public Culata() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Culata(int cantidadBujias) {
		super();
		this.cantidadBujias = cantidadBujias;
	}

	@Override
	public String toString() {
		return "Culata [cantidadBujias=" + cantidadBujias + "]";
	}

	
	
	
}
