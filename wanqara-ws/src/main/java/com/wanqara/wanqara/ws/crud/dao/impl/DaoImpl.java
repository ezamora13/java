/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanqara.wanqara.ws.crud.dao.impl;

import com.wanqara.wanqara.ws.crud.CrudImpl;
import javax.annotation.Resource;
import javax.ejb.EJBContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContexts;
import lombok.Getter;

/**
 *
 * @author ezamora
 */
@PersistenceContexts({
    @PersistenceContext(name = DaoImpl.WANQARA_PU, unitName = DaoImpl.WANQARA_PU)})
public class DaoImpl<T> {

    public static final String WANQARA_PU = "wanqara_wanqara-ws_PU";

    @Resource
    @Getter
    private EJBContext ejbContext;

    private final CrudImpl<T> dao;

    public DaoImpl() {
        dao = new CrudImpl<>();
    }

    public DaoImpl(Class<T> entidad) {
        dao = new CrudImpl();
        dao.setEntity(entidad);
    }

    public CrudImpl<T> getDao() {

        EntityManager em = (EntityManager) ejbContext.lookup(WANQARA_PU);
        dao.setEntityManager(em);
        return dao;
    }
    
     public CrudImpl<T> getDao(String unidadPersistencia) {
        EntityManager em = (EntityManager) ejbContext.lookup(unidadPersistencia);
        dao.setEntityManager(em);
        return dao;
    }

}
