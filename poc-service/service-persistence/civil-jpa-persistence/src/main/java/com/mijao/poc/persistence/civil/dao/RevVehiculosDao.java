package com.mijao.poc.persistence.civil.dao;

import java.util.Collection;

import com.mijao.poc.jpa.generic.GenericDAO;
import com.mijao.poc.persistence.civil.dao.entities.VmAntRevVehiculoEntity;
import com.mijao.poc.persistence.civil.dao.entities.VmAntRevVehiculoEntityPK;


public interface RevVehiculosDao extends GenericDAO<VmAntRevVehiculoEntity, VmAntRevVehiculoEntityPK> {

    /**
     * The Spring bean name.
     */
    public static String BEAN_NAME = "revVehiculosDAO";

    Collection<? extends VmAntRevVehiculoEntity> find(String chasis, String placa);
}
