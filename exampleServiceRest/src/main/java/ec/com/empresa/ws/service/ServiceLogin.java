package ec.com.empresa.ws.service;



import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ec.com.empresa.ws.vo.Usuario;


@Path("/javaServiceRest")
public class ServiceLogin {

	@POST
	@Path("/validarUsuario")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Usuario validaUsuario(Usuario usuario) {
		if (usuario.getUsuario().equals("ezamora") && usuario.getPassword().equals("123")) {
			usuario.setUserValido(true);
		}

		return usuario;
	}

}
