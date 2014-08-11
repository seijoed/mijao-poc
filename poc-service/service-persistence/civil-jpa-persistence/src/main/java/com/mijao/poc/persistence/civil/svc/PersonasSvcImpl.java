package com.mijao.poc.persistence.civil.svc;

import com.mijao.poc.persistence.civil.dao.PersonasCteDao;
import com.mijao.poc.persistence.civil.dao.PersonasDao;
import com.mijao.poc.persistence.civil.dao.RevVehiculosDao;
import com.mijao.poc.persistence.civil.dao.entities.AntPersonasCteDTO;
import com.mijao.poc.persistence.civil.dao.entities.VmAntPersona;
import com.mijao.poc.persistence.civil.dao.entities.VmAntPersonasCte;

public class PersonasSvcImpl implements PersonasSvc {

    private PersonasDao personasDao;
    private PersonasCteDao personasCteDao;

    //Supporting DAO's

    private RevVehiculosDao revVehiculosDao;

    @Override
    public Object getPersona(String id) {

        VmAntPersona persona = personasDao.getById(id);

        if (persona == null) {

            AntPersonasCteDTO antPersonasCteDTO = new AntPersonasCteDTO();

            VmAntPersonasCte personasCte = personasCteDao.getById(id);
            if (personasCte != null) {
                antPersonasCteDTO.setVmAntPersonasCte(personasCte);

                if (personasCte.getVmAntVehiculos() != null && !personasCte.getVmAntVehiculos().isEmpty()) {

                }
            }
        }
        return null;
    }

    public void setPersonasCteDao(PersonasCteDao personasCteDao) {
        this.personasCteDao = personasCteDao;
    }

    public void setPersonasDao(PersonasDao personasDao) {
        this.personasDao = personasDao;
    }

    public void setRevVehiculosDao(RevVehiculosDao revVehiculosDao) {
        this.revVehiculosDao = revVehiculosDao;
    }
}
