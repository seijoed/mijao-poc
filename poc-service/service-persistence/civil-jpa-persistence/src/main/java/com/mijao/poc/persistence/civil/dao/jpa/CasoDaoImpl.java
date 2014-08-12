package com.mijao.poc.persistence.civil.dao.jpa;

import java.util.List;

import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mijao.poc.jpa.generic.GenericJpaDao;
import com.mijao.poc.persistence.civil.dao.CasoDao;
import com.mijao.poc.persistence.civil.dao.PersonasCteDao;
import com.mijao.poc.persistence.civil.dao.entities.AntPersonasCtePK;
import com.mijao.poc.persistence.civil.dao.entities.AntPersonasPK;
import com.mijao.poc.persistence.civil.dao.entities.SarcCasoEntity;
import com.mijao.poc.persistence.civil.dao.entities.VmAntPersona;
import com.mijao.poc.persistence.civil.dao.entities.VmAntPersonasCte;

public class CasoDaoImpl extends GenericJpaDao<SarcCasoEntity, Integer> implements CasoDao {
	
	 public CasoDaoImpl() {
		 super(SarcCasoEntity.class);
	}

	Logger log = LoggerFactory.getLogger(PersonasCteDaoImpl.class);

	@Override
	public void create(SarcCasoEntity newInstance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SarcCasoEntity read(Integer id) {
		Query q = em.createQuery("select * from SarcCasoEntity caso where caso.id = :id");
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
        return (SarcCasoEntity) list.iterator().next();
	}
	

	@Override
	public void update(SarcCasoEntity persistentObject) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void delete(SarcCasoEntity persistentObject) {
		// TODO Auto-generated method stub		
	}

}
