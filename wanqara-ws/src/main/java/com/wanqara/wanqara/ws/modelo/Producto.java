/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanqara.wanqara.ws.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ezamora
 */
@Entity
@Table(name = "producto", catalog = "wanqara", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = Producto.OBTENER_PRODUCTOS, query = "SELECT p FROM Producto p")
    , @NamedQuery(name = "Producto.findByIdproducto", query = "SELECT p FROM Producto p WHERE p.idproducto = :idproducto")
    , @NamedQuery(name = "Producto.findByPrdDescripcion", query = "SELECT p FROM Producto p WHERE p.prdDescripcion = :prdDescripcion")
    , @NamedQuery(name = "Producto.findByPrdprecioUnitario", query = "SELECT p FROM Producto p WHERE p.prdprecioUnitario = :prdprecioUnitario")
    , @NamedQuery(name = "Producto.findByPrdEstadado", query = "SELECT p FROM Producto p WHERE p.prdEstadado = :prdEstadado")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final String OBTENER_PRODUCTOS="Producto.OBTENER_PRODUCTOS";
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idproducto")
    private Integer idproducto;
    @Size(max = 45)
    @Column(name = "prd_descripcion")
    private String prdDescripcion;
    @Size(max = 45)
    @Column(name = "prd_precioUnitario")
    private String prdprecioUnitario;
    @Column(name = "prd_estadado")
    private Integer prdEstadado;

    public Producto() {
    }

    public Producto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getPrdDescripcion() {
        return prdDescripcion;
    }

    public void setPrdDescripcion(String prdDescripcion) {
        this.prdDescripcion = prdDescripcion;
    }

    public String getPrdprecioUnitario() {
        return prdprecioUnitario;
    }

    public void setPrdprecioUnitario(String prdprecioUnitario) {
        this.prdprecioUnitario = prdprecioUnitario;
    }

    public Integer getPrdEstadado() {
        return prdEstadado;
    }

    public void setPrdEstadado(Integer prdEstadado) {
        this.prdEstadado = prdEstadado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproducto != null ? idproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idproducto == null && other.idproducto != null) || (this.idproducto != null && !this.idproducto.equals(other.idproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wanqara.wanqara.ws.modelo.Producto[ idproducto=" + idproducto + " ]";
    }
    
}
