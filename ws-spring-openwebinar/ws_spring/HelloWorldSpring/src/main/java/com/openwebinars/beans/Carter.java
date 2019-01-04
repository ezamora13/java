package com.openwebinars.beans;

import lombok.Getter;
import lombok.Setter;

public class Carter {

	@Getter
	@Setter
	private double volumenAceite;
	
	
	

	public Carter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carter(double volumenAceite) {
		super();
		this.volumenAceite = volumenAceite;
	}

	@Override
	public String toString() {
		return "Carter [volumenAceite=" + volumenAceite + "]";
	}
	
	
	
	
	
}
