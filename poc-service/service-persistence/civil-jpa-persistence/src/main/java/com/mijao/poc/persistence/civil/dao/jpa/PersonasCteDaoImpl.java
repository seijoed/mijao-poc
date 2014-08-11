package com.mijao.poc.persistence.civil.dao.jpa;

import java.util.List;
import javax.persistence.Query;

import com.mijao.poc.jpa.generic.GenericJpaDao;
import com.mijao.poc.persistence.civil.dao.PersonasCteDao;
import com.mijao.poc.persistence.civil.dao.entities.AntPersonasCtePK;
import com.mijao.poc.persistence.civil.dao.entities.VmAntPersonasCte;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonasCteDaoImpl extends GenericJpaDao<VmAntPersonasCte, AntPersonasCtePK> implements PersonasCteDao {

    Logger log = LoggerFactory.getLogger(PersonasCteDaoImpl.class);

    public PersonasCteDaoImpl() {
        super(VmAntPersonasCte.class);
    }

    @Override
    public VmAntPersonasCte getById(String id) {
        Query q = em.createQuery("select contactos from VmAntPersonasCte contactos where contactos.documento = :id");
        q.setParameter("id", id);
        List list = null;
        try {
            list = q.getResultList();
        } catch (Exception e) {
            log.error("PersonasCte error " + e);
        }

        if (list == null || list.size() == 0) {
            return null;
        }

        return (VmAntPersonasCte) list.iterator().next();
    }
}
