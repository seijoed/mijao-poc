package com.mijao.poc.persistence.civil.dao.jpa;

import java.util.List;
import javax.persistence.Query;

import com.mijao.poc.jpa.generic.GenericJpaDao;
import com.mijao.poc.persistence.civil.dao.PersonasDao;
import com.mijao.poc.persistence.civil.dao.entities.AntPersonasPK;
import com.mijao.poc.persistence.civil.dao.entities.VmAntPersona;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonasDaoImpl extends GenericJpaDao<VmAntPersona, AntPersonasPK> implements PersonasDao {

    Logger log = LoggerFactory.getLogger(PersonasDaoImpl.class);

    public PersonasDaoImpl() {
        super(VmAntPersona.class);
    }

    @Override
    public VmAntPersona getById(String id) {
        Query q = em.createQuery("select contactos from VmAntPersona contactos where contactos.documento = :id");
        q.setParameter("id", id);
        List list = null;
        try {
            list = q.getResultList();
        } catch (Exception e) {
            log.error("Personas error " + e);
        }

        if (list == null || list.size() == 0) {
            return null;
        }

        return (VmAntPersona) list.iterator().next();
    }
}
