package com.openwebinars.beans;

import lombok.Getter;
import lombok.Setter;

public class Bloque {

	@Getter
	@Setter	
	private int cantidadCilindros;
	
	
	

	public Bloque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bloque(int cantidadCilindros) {
		super();
		this.cantidadCilindros = cantidadCilindros;
	}

	@Override
	public String toString() {
		return "Bloque [cantidadCilindros=" + cantidadCilindros + "]";
	}
	
	
	
}
