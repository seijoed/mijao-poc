package com.mijao.poc.persistence.civil.dao.entities;

import java.util.ArrayList;
import java.util.Collection;

public class AntPersonaDTO {

    private VmAntPersona vmAntPersona;

    private Collection<VmAntBloVehiculoEntity> vmAntBloVehiculos = new ArrayList<VmAntBloVehiculoEntity>();

    private Collection<VmAntMatVehiculoEntity> vmAntMatVehiculos = new ArrayList<VmAntMatVehiculoEntity>();

    private Collection<VmAntRevVehiculoEntity> vmAntRevVehiculos = new ArrayList<VmAntRevVehiculoEntity>();

    public Collection<VmAntBloVehiculoEntity> getVmAntBloVehiculos() {
        return vmAntBloVehiculos;
    }

    public void setVmAntBloVehiculos(Collection<VmAntBloVehiculoEntity> vmAntBloVehiculos) {
        this.vmAntBloVehiculos = vmAntBloVehiculos;
    }

    public Collection<VmAntMatVehiculoEntity> getVmAntMatVehiculos() {
        return vmAntMatVehiculos;
    }

    public void setVmAntMatVehiculos(Collection<VmAntMatVehiculoEntity> vmAntMatVehiculos) {
        this.vmAntMatVehiculos = vmAntMatVehiculos;
    }

    public VmAntPersona getVmAntPersona() {
        return vmAntPersona;
    }

    public void setVmAntPersona(VmAntPersona vmAntPersona) {
        this.vmAntPersona = vmAntPersona;
    }

    public Collection<VmAntRevVehiculoEntity> getVmAntRevVehiculos() {
        return vmAntRevVehiculos;
    }

    public void setVmAntRevVehiculos(Collection<VmAntRevVehiculoEntity> vmAntRevVehiculos) {
        this.vmAntRevVehiculos = vmAntRevVehiculos;
    }
}
