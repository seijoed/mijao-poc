package com.mijao.poc.persistence.civil;

import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

import com.mijao.poc.persistence.civil.dao.CasoDao;
import com.mijao.poc.persistence.civil.dao.entities.SarcCasoEntity;

public class CasoTest extends TestBase {

    @Test
    // @Ignore("Integration test.")
    @Ignore("Integration test.")
    public void testGetById() {

       CasoDao dao = (CasoDao) getBean("casoDAO");
       SarcCasoEntity caso = dao.read(1);
       assertNotNull(caso);
    }

    @Test
    @Ignore("Integration test.")
    public void testCte() {
       // PersonasCteDao dao = (PersonasCteDao) getBean(PersonasCteDao.BEAN_NAME);
       // VmAntPersonasCte persona = dao.getById("1703781011");
       // assertNotNull(persona);
    }
}


