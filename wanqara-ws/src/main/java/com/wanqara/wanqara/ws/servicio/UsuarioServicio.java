/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanqara.wanqara.ws.servicio;

import com.wanqara.wanqara.ws.crud.dao.UsuarioDao;
import com.wanqara.wanqara.ws.modelo.Usuario;
import javax.ejb.EJB;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import lombok.Getter;

/**
 *
 * @author ezamora
 */
@Singleton
@Consumes(MediaType.APPLICATION_JSON)
@Path("usuarioServicio")
public class UsuarioServicio {

    @EJB
    @Getter
    private UsuarioDao usuarioDao;

    @POST
    @Produces({"application/json"})
    @Path("/obtenerUsuario")
    @Lock(LockType.READ)
    public Usuario obtenerUsuario(Usuario usuario) throws Exception {
        Usuario u = new Usuario();
        u.setUsrUsuario(usuario.getUsrUsuario());
        u = getUsuarioDao().obtenerUsuario(u);

        return u;
    }

}
