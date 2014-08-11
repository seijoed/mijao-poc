package com.mijao.poc.persistence.civil.dao;

import com.mijao.poc.jpa.generic.GenericDAO;
import com.mijao.poc.persistence.civil.dao.entities.AntPersonasCtePK;
import com.mijao.poc.persistence.civil.dao.entities.VmAntPersonasCte;

public interface PersonasCteDao extends GenericDAO<VmAntPersonasCte, AntPersonasCtePK> {

    /**
     * The Spring bean name.
     */
    public static String BEAN_NAME = "personasCteDAO";

    public VmAntPersonasCte getById(String contactos);
}
