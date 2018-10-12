/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanqara.wanqara.web.controlador;

import com.wanqara.wanqara.web.cliente.restful.WsClienteRestful;
import com.wanqara.wanqara.ws.dto.Usuario;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;

/**
 *
 * @author ezamora
 */
@Named
@ViewScoped
public class LoginControlador implements Serializable {

    @Getter
    @Setter
    private Usuario usuario;

    WsClienteRestful cliente = new WsClienteRestful();

    @PostConstruct
    public void init() {
        setUsuario(new Usuario());
    }

    public String obtenerLogin() {
        Usuario usr = new Usuario();
        String url = "";
        usr = cliente.invocaWs("http://localhost:8080/wanqara-ws/resources/usuarioServicio/obtenerUsuario", getUsuario(), Usuario.class);
        if (usr == null || usr.getIdusuario() == null) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login", "Usuario no exite!..");
            PrimeFaces.current().dialog().showMessageDynamic(message);
            url = "/pages/login.jsf";
        } else {
            if (usr.getUsrUsuario().equals(getUsuario().getUsrUsuario()) && usr.getUsrPassword().equals(getUsuario().getUsrPassword())) {
                url = "/pages/producto.jsf";
            } else {
                FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login", "Usuario o Contraseña incorrecta!..");
                PrimeFaces.current().dialog().showMessageDynamic(message);
                url = "/pages/login.jsf";
            }
        }
        return url;
    }

    // String existe = cliente.invocaWsCrud(getNavegacionControlador().getNavegacionControladorBb().getMapaUrlsServicios().get(CodigoServicioRestEnum.LOGUNE_001.getCodigo()), entrada);
}
