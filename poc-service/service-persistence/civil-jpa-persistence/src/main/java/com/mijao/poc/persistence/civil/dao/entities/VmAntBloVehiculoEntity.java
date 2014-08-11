package com.mijao.poc.persistence.civil.dao.entities;

import java.sql.Timestamp;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@javax.persistence.Table(name = "VM_ANT_BLO_VEHICULO", schema = "REPDIN", catalog = "")
@Entity
public class VmAntBloVehiculoEntity {

    private VmAntBloVehiculoPK vmAntBloVehiculoPK;

    @Id
    public VmAntBloVehiculoPK getVmAntBloVehiculoPK() {
        return vmAntBloVehiculoPK;
    }

    public void setVmAntBloVehiculoPK(VmAntBloVehiculoPK vmAntBloVehiculoPK) {
        this.vmAntBloVehiculoPK = vmAntBloVehiculoPK;
    }

    private String placa;

    @javax.persistence.Column(name = "PLACA")
    @Basic
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    private String chasis;

    @javax.persistence.Column(name = "CHASIS")
    @Basic
    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    private String descripcion;

    @javax.persistence.Column(name = "DESCRIPCION")
    @Basic
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private Timestamp fechares;

    @javax.persistence.Column(name = "FECHARES")
    @Basic
    public Timestamp getFechares() {
        return fechares;
    }

    public void setFechares(Timestamp fechares) {
        this.fechares = fechares;
    }

    private String activado;

    @javax.persistence.Column(name = "ACTIVADO")
    @Basic
    public String getActivado() {
        return activado;
    }

    public void setActivado(String activado) {
        this.activado = activado;
    }

    private Timestamp fechades;

    @javax.persistence.Column(name = "FECHADES")
    @Basic
    public Timestamp getFechades() {
        return fechades;
    }

    public void setFechades(Timestamp fechades) {
        this.fechades = fechades;
    }

    private String orgapoli1;

    @javax.persistence.Column(name = "ORGAPOLI1")
    @Basic
    public String getOrgapoli1() {
        return orgapoli1;
    }

    public void setOrgapoli1(String orgapoli1) {
        this.orgapoli1 = orgapoli1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        VmAntBloVehiculoEntity that = (VmAntBloVehiculoEntity) o;

        if (activado != null ? !activado.equals(that.activado) : that.activado != null) {
            return false;
        }
        if (chasis != null ? !chasis.equals(that.chasis) : that.chasis != null) {
            return false;
        }
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) {
            return false;
        }
        if (fechades != null ? !fechades.equals(that.fechades) : that.fechades != null) {
            return false;
        }
        if (fechares != null ? !fechares.equals(that.fechares) : that.fechares != null) {
            return false;
        }
        if (orgapoli1 != null ? !orgapoli1.equals(that.orgapoli1) : that.orgapoli1 != null) {
            return false;
        }
        if (placa != null ? !placa.equals(that.placa) : that.placa != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = placa != null ? placa.hashCode() : 0;
        result = 31 * result + (chasis != null ? chasis.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (fechares != null ? fechares.hashCode() : 0);
        result = 31 * result + (activado != null ? activado.hashCode() : 0);
        result = 31 * result + (fechades != null ? fechades.hashCode() : 0);
        result = 31 * result + (orgapoli1 != null ? orgapoli1.hashCode() : 0);
        return result;
    }
}
