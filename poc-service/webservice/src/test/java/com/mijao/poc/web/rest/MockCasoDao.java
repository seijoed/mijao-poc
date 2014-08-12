package com.mijao.poc.web.rest;

import com.mijao.poc.persistence.civil.dao.CasoDao;
import com.mijao.poc.persistence.civil.dao.entities.SarcCasoEntity;

public class MockCasoDao implements CasoDao {
    @Override
    public void create(SarcCasoEntity newInstance) {
        //TODO
    }

    @Override
    public SarcCasoEntity read(Integer id) {
        return new SarcCasoEntity();
    }

    @Override
    public void update(SarcCasoEntity persistentObject) {
        //TODO
    }

    @Override
    public void delete(SarcCasoEntity persistentObject) {
        //TODO
    }
}
