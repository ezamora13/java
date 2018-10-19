package ec.com.springmvc.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class Pelicula {
	
	@Getter
	@Setter
	private int id;
	@Getter
	@Setter
	private String titulo;
	@Getter
	@Setter
	private int duracion;
	@Getter
	@Setter
	private String clasificacion;
	@Getter
	@Setter
	private String genero;
	@Getter
	@Setter
	private String imagen="imagen.png";
	@Getter
	@Setter
	private Date fechaEstreno;
	@Getter
	@Setter
	private String estatus="Activa";
	
	
	
	public Pelicula() {
		super();
	}
	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", titulo=" + titulo + ", duracion=" + duracion + ", clasificacion="
				+ clasificacion + ", genero=" + genero + ", imagen=" + imagen + ", fechaEstreno=" + fechaEstreno
				+ ", estatus=" + estatus + "]";
	}
	
	
	
	
	

}
