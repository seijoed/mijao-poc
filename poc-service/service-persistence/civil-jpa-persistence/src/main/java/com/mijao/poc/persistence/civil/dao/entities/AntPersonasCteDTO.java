package com.mijao.poc.persistence.civil.dao.entities;

import java.util.ArrayList;
import java.util.Collection;

public class AntPersonasCteDTO {

    private VmAntPersonasCte vmAntPersonasCte ;

    private Collection<VmAntBloqueosVehCteEntity> vmAntBloqueosVehCtes = new ArrayList<VmAntBloqueosVehCteEntity>();

    private Collection<VmAntMatriculacionCteEntity> vmAntMatriculacionCtes = new ArrayList<VmAntMatriculacionCteEntity>();

    private Collection<VmAntRevisionCteEntity> vmAntRevisionCtes = new ArrayList<VmAntRevisionCteEntity>();

    public Collection<VmAntBloqueosVehCteEntity> getVmAntBloqueosVehCtes() {
        return vmAntBloqueosVehCtes;
    }

    public void setVmAntBloqueosVehCtes(Collection<VmAntBloqueosVehCteEntity> vmAntBloqueosVehCtes) {
        this.vmAntBloqueosVehCtes = vmAntBloqueosVehCtes;
    }

    public Collection<VmAntMatriculacionCteEntity> getVmAntMatriculacionCtes() {
        return vmAntMatriculacionCtes;
    }

    public void setVmAntMatriculacionCtes(Collection<VmAntMatriculacionCteEntity> vmAntMatriculacionCtes) {
        this.vmAntMatriculacionCtes = vmAntMatriculacionCtes;
    }

    public VmAntPersonasCte getVmAntPersonasCte() {
        return vmAntPersonasCte;
    }

    public void setVmAntPersonasCte(VmAntPersonasCte vmAntPersonasCte) {
        this.vmAntPersonasCte = vmAntPersonasCte;
    }

    public Collection<VmAntRevisionCteEntity> getVmAntRevisionCtes() {
        return vmAntRevisionCtes;
    }

    public void setVmAntRevisionCtes(Collection<VmAntRevisionCteEntity> vmAntRevisionCtes) {
        this.vmAntRevisionCtes = vmAntRevisionCtes;
    }
}
