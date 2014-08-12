package com.mijao.poc.persistence.civil.dao.jpa;

import com.mijao.poc.jpa.generic.GenericJpaDao;
import com.mijao.poc.persistence.civil.dao.CasoDao;
import com.mijao.poc.persistence.civil.dao.entities.SarcCasoEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CasoDaoImpl extends GenericJpaDao<SarcCasoEntity, Integer> implements CasoDao {

    public CasoDaoImpl() {
        super(SarcCasoEntity.class);
    }

    Logger log = LoggerFactory.getLogger(CasoDaoImpl.class);
}
