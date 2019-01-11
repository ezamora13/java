package com.openwebinars.beans.autowire;

import lombok.Getter;
import lombok.Setter;

public class Cliente {

	@Getter
	@Setter
	private long id;
	@Getter
	@Setter
	private Persona persona;

	public Cliente() {
	}

	public Cliente(long id, Persona persona) {
		super();
		this.id = id;
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", persona=" + persona + "]";
	}

}
