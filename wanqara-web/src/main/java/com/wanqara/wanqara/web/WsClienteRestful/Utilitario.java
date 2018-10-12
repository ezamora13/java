/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanqara.wanqara.web.WsClienteRestful;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ezamora
 */
public class Utilitario {
    
      public static void error(String clase, String mensaje, Exception e) {
        Logger.getLogger(clase).log(Level.SEVERE, mensaje.toUpperCase(), e);
    }
}
