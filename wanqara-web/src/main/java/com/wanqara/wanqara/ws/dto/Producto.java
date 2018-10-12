/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanqara.wanqara.ws.dto;

import lombok.Getter;
import lombok.Setter;

public class Producto {

    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    private String idproducto;
    @Getter
    @Setter
    private String prdDescripcion;
    @Getter
    @Setter
    private String prdprecioUnitario;
    @Getter
    @Setter
    private String prdEstadado;

    public Producto() {
    }

    public Producto(String idproducto, String prdDescripcion, String prdprecioUnitario, String prdEstadado) {
        this.idproducto = idproducto;
        this.prdDescripcion = prdDescripcion;
        this.prdprecioUnitario = prdprecioUnitario;
        this.prdEstadado = prdEstadado;
    }
    
    

    
    
    

}
