package com.mijao.poc.persistence.civil.dao.entities;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Id;

@javax.persistence.Table(name = "VM_ANT_BLOQUEOS_LIC_CTE", schema = "REPDIN", catalog = "")
@Entity
public class VmAntBloqueosLicCte {

    private AntBloqueosLicCtePK antBloqueosLicCtePK;

    @Id
    public AntBloqueosLicCtePK getAntBloqueosLicCtePK() {
        return antBloqueosLicCtePK;
    }

    public void setAntBloqueosLicCtePK(AntBloqueosLicCtePK antBloqueosLicCtePK) {
        this.antBloqueosLicCtePK = antBloqueosLicCtePK;
    }

    private String nrolicen;

    @javax.persistence.Column(name = "NROLICEN")

    public String getNrolicen() {
        return nrolicen;
    }

    public void setNrolicen(String nrolicen) {
        this.nrolicen = nrolicen;
    }

    private String tipoli;

    @javax.persistence.Column(name = "TIPOLI")

    public String getTipoli() {
        return tipoli;
    }

    public void setTipoli(String tipoli) {
        this.tipoli = tipoli;
    }

    private Timestamp fechacat;

    @javax.persistence.Column(name = "FECHACAT")

    public Timestamp getFechacat() {
        return fechacat;
    }

    public void setFechacat(Timestamp fechacat) {
        this.fechacat = fechacat;
    }

    private String numerodo;

    @javax.persistence.Column(name = "NUMERODO")

    public String getNumerodo() {
        return numerodo;
    }

    public void setNumerodo(String numerodo) {
        this.numerodo = numerodo;
    }

    private Timestamp fechades;

    @javax.persistence.Column(name = "FECHADES")

    public Timestamp getFechades() {
        return fechades;
    }

    public void setFechades(Timestamp fechades) {
        this.fechades = fechades;
    }

    private String orgapoli;

    @javax.persistence.Column(name = "ORGAPOLI")

    public String getOrgapoli() {
        return orgapoli;
    }

    public void setOrgapoli(String orgapoli) {
        this.orgapoli = orgapoli;
    }

    private String nrodocde;

    @javax.persistence.Column(name = "NRODOCDE")

    public String getNrodocde() {
        return nrodocde;
    }

    public void setNrodocde(String nrodocde) {
        this.nrodocde = nrodocde;
    }

    private String estado;

    @javax.persistence.Column(name = "ESTADO")

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    private String descripcion;

    @javax.persistence.Column(name = "DESCRIPCION")

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        VmAntBloqueosLicCte that = (VmAntBloqueosLicCte) o;

        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) {
            return false;
        }
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) {
            return false;
        }
        if (fechacat != null ? !fechacat.equals(that.fechacat) : that.fechacat != null) {
            return false;
        }
        if (fechades != null ? !fechades.equals(that.fechades) : that.fechades != null) {
            return false;
        }
        if (nrodocde != null ? !nrodocde.equals(that.nrodocde) : that.nrodocde != null) {
            return false;
        }
        if (nrolicen != null ? !nrolicen.equals(that.nrolicen) : that.nrolicen != null) {
            return false;
        }
        if (numerodo != null ? !numerodo.equals(that.numerodo) : that.numerodo != null) {
            return false;
        }
        if (orgapoli != null ? !orgapoli.equals(that.orgapoli) : that.orgapoli != null) {
            return false;
        }
        if (tipoli != null ? !tipoli.equals(that.tipoli) : that.tipoli != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = nrolicen != null ? nrolicen.hashCode() : 0;
        result = 31 * result + (tipoli != null ? tipoli.hashCode() : 0);
        result = 31 * result + (fechacat != null ? fechacat.hashCode() : 0);
        result = 31 * result + (numerodo != null ? numerodo.hashCode() : 0);
        result = 31 * result + (fechades != null ? fechades.hashCode() : 0);
        result = 31 * result + (orgapoli != null ? orgapoli.hashCode() : 0);
        result = 31 * result + (nrodocde != null ? nrodocde.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
