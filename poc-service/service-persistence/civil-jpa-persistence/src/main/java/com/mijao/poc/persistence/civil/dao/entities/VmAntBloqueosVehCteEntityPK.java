package com.mijao.poc.persistence.civil.dao.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Embeddable;

@Embeddable
public class VmAntBloqueosVehCteEntityPK implements Serializable {

    private String placa;

    private String chasis;

    private String descripcion;

    private Timestamp fechares;

    private String activado;

    private Timestamp fechades;

    private String orgapoli1;

    public String getActivado() {
        return activado;
    }

    public void setActivado(String activado) {
        this.activado = activado;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Timestamp getFechades() {
        return fechades;
    }

    public void setFechades(Timestamp fechades) {
        this.fechades = fechades;
    }

    public Timestamp getFechares() {
        return fechares;
    }

    public void setFechares(Timestamp fechares) {
        this.fechares = fechares;
    }

    public String getOrgapoli1() {
        return orgapoli1;
    }

    public void setOrgapoli1(String orgapoli1) {
        this.orgapoli1 = orgapoli1;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VmAntBloqueosVehCteEntityPK)) {
            return false;
        }

        VmAntBloqueosVehCteEntityPK that = (VmAntBloqueosVehCteEntityPK) o;

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
