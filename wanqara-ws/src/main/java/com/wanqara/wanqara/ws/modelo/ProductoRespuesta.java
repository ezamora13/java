/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanqara.wanqara.ws.modelo;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ezamora
 */
public class ProductoRespuesta {
    
    @Getter
    @Setter
    private List<Producto> productos;

    public ProductoRespuesta() {
    }
     
    
    
}
