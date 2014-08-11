package com.mijao.poc.persistence.civil.dao.jpa;

import java.util.Collection;
import java.util.List;
import javax.persistence.Query;

import com.mijao.poc.jpa.generic.GenericJpaDao;
import com.mijao.poc.persistence.civil.dao.RevVehiculosDao;
import com.mijao.poc.persistence.civil.dao.entities.VmAntRevVehiculoEntity;
import com.mijao.poc.persistence.civil.dao.entities.VmAntRevVehiculoEntityPK;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RevVehiculosDaoImpl extends GenericJpaDao<VmAntRevVehiculoEntity, VmAntRevVehiculoEntityPK> implements RevVehiculosDao {

    Logger log = LoggerFactory.getLogger(RevVehiculosDaoImpl.class);

    public RevVehiculosDaoImpl() {
        super(VmAntRevVehiculoEntity.class);
    }

    @Override
    public Collection<? extends VmAntRevVehiculoEntity> find(String chasis, String placa) {
        Query q = em.createQuery("select ent from VmAntRevVehiculoEntity ent where ent.chasis = :chasis and ent.placa = :placa");
        q.setParameter("chasis", chasis);
        q.setParameter("placa", placa);
        List list = null;
        try {
            list = q.getResultList();
        } catch (Exception e) {
            log.error("Personas error " + e);
        }

        if (list == null || list.size() == 0) {
            return null;
        }

        return list;
    }
}
