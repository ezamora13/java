/*
 * Copyright 2016 INSTITUTO ECUATORIANO DE SEGURIDAD SOCIAL - ECUADOR
 * Todos los derechos reservados
 */
package com.wanqara.wanqara.web.cliente.restful;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author christian
 */
public class Utilitario {

    /**
     * @author christian Constructor privado
     */
    private Utilitario() {
    }

    /**
     * @author christian
     * @param clase clase
     * @param mensaje mensaje
     * @param e e
     */
    public static void error(String clase, String mensaje, Exception e) {
        Logger.getLogger(clase).log(Level.SEVERE, mensaje.toUpperCase(), e);
    }
}
