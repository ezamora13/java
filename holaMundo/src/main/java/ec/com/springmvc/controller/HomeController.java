package ec.com.springmvc.controller;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ec.com.springmvc.model.Pelicula;

@Controller
public class HomeController {
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String goHome() {
		return "home"; 
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String mostratPrincipal(Model model) throws Exception {
		/*
		 * List<String> peliculas = new LinkedList<String>();
		 * peliculas.add("Rapidos y Furiosos"); peliculas.add("El aro 2");
		 * peliculas.add("Aliens");
		 */
		model.addAttribute("peliculas", getPeliculas());
		return "home";
	}

	private List<Pelicula> getPeliculas() throws Exception {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		List<Pelicula> peliculas = new LinkedList<Pelicula>();
		Pelicula p = new Pelicula();
		p.setId(1);
		p.setTitulo("Power Ranger");
		p.setDuracion(120);
		p.setClasificacion("B");
		p.setGenero("Aventura");
		p.setFechaEstreno(dateFormat.parse("02-05-2018"));
		p.setImagen("powerranger.png");
		Pelicula p2 = new Pelicula();
		p2.setId(2);
		p2.setTitulo("La bella y la Bestia");
		p2.setDuracion(120);
		p2.setClasificacion("A");
		p2.setGenero("Aventura");
		p2.setFechaEstreno(dateFormat.parse("02-05-2018"));
		p2.setImagen("bella.png");
		Pelicula p3 = new Pelicula();
		p3.setId(3);
		p3.setTitulo("Contratiempo ");
		p3.setDuracion(120);
		p3.setClasificacion("B");
		p3.setGenero("Aventura");
		p3.setFechaEstreno(dateFormat.parse("02-05-2018"));
		p3.setImagen("contratiempo.png");
		Pelicula p4 = new Pelicula();
		p4.setId(4);
		p4.setTitulo("Kong la Insla Calavera");
		p4.setDuracion(180);
		p4.setClasificacion("B");
		p4.setGenero("Aventura");
		p4.setFechaEstreno(dateFormat.parse("02-05-2018"));
		p4.setImagen("kong.png");
		p4.setEstatus("Inactiva");
		peliculas.add(p);
		peliculas.add(p2);
		peliculas.add(p3);
		peliculas.add(p4);

		return peliculas;
	}

	@RequestMapping(value = "/detail")
	public String mostrarDettalle(Model model) {
		String tituloPelicula = "Rapido y Furioso";
		int duracion = 136;
		double precioEntrada = 50;
		model.addAttribute("titulo", tituloPelicula);
		model.addAttribute("duracion", duracion);
		model.addAttribute("precio", precioEntrada);
		return "detalle";
	}
}
