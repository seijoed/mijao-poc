package com.mijao.poc.persistence.civil.dao;

import com.mijao.poc.jpa.generic.GenericDAO;
import com.mijao.poc.persistence.civil.dao.entities.AntPersonasPK;
import com.mijao.poc.persistence.civil.dao.entities.VmAntPersona;

public interface PersonasDao extends GenericDAO<VmAntPersona, AntPersonasPK> {

    /**
     * The Spring bean name.
     */
    public static String BEAN_NAME = "personasDAO";

    public VmAntPersona getById(String contactos);


}
