/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanqara.wanqara.ws.crud.dao;

import com.wanqara.wanqara.ws.utilitario.Sql;
import com.wanqara.wanqara.ws.crud.dao.impl.DaoImpl;
import com.wanqara.wanqara.ws.modelo.Usuario;
import com.wanqara.wanqara.ws.utilitario.EjecutaSelectNativos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author ezamora
 */
@Stateless
public class UsuarioDao extends DaoImpl<Usuario> {

    /*   public Usuario obtenerUsuario(String usuario) throws Exception {
        Query q = getDao().getEntityManager().createNamedQuery(Sql.SQL_USUARIO_POR_USR);
        q.setParameter(1, usuario);
        List<Usuario> usuarios = new ArrayList<>();
        usuarios = (List<Usuario>) EjecutaSelectNativos.listarPorSentenciaSql(q, Usuario.class).get(0);
        if (usuarios.isEmpty()) {
            return new Usuario();
        } else {
            return usuarios.get(0);
        }

    }*/
    public Usuario obtenerUsuario(Usuario usuario) throws Exception {
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("usuario", usuario.getUsrUsuario());
        List<Usuario> usuarios = new ArrayList<>();
        usuarios = getDao().listarPorConsultaJpaNombrada(Usuario.OBTENER_USUARIO_POR_USR, parametros);
        if (usuarios.isEmpty()) {
            return new Usuario();
        } else {
            return usuarios.get(0);
        }

    }

}
