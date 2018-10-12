/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanqara.wanqara.ws.servicio;

import com.wanqara.wanqara.ws.crud.dao.ProductoDao;
import com.wanqara.wanqara.ws.crud.dao.UsuarioDao;
import com.wanqara.wanqara.ws.modelo.Producto;
import com.wanqara.wanqara.ws.modelo.ProductoRespuesta;
import com.wanqara.wanqara.ws.modelo.Usuario;
import java.util.List;
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
@Path("productoServicio")
public class ProductoServicio {
    
    @EJB
    @Getter
    private ProductoDao productoDao;
    
    @POST
    @Produces({"application/json"})
    @Path("/obtenerProductos")
    @Lock(LockType.READ)
    public ProductoRespuesta obtenerProductos() throws Exception {
        return productoDao.obtenerProducto();
    }
    
     
    @POST
    @Produces({"application/json"})
    @Path("/guardarProducto")
    @Lock(LockType.READ)
    public Producto obtenerProductos(Producto producto) throws Exception {
        return productoDao.guardarProducto(producto);
    }
    
}
