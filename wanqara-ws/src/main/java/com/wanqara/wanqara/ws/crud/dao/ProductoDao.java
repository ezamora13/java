/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanqara.wanqara.ws.crud.dao;

import com.wanqara.wanqara.ws.crud.dao.impl.DaoImpl;
import com.wanqara.wanqara.ws.modelo.Producto;
import com.wanqara.wanqara.ws.modelo.ProductoRespuesta;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author ezamora
 */
@Stateless
public class ProductoDao extends DaoImpl<Producto> {

    public ProductoRespuesta obtenerProducto() throws Exception {
        ProductoRespuesta respuesta = new ProductoRespuesta();
        List<Producto> productos = new ArrayList<>();
        productos = getDao().listarPorConsultaJpaNombrada(Producto.OBTENER_PRODUCTOS, null);
        if (productos.isEmpty()) {
            respuesta.setProductos(new ArrayList<Producto>());
            return respuesta;
        } else {
            respuesta.setProductos(productos);
            return respuesta;
        }

    }

    public Producto guardarProducto(Producto producto) throws Exception {
        producto = getDao().guardarRetorno(producto);
        return producto;
    }

}
