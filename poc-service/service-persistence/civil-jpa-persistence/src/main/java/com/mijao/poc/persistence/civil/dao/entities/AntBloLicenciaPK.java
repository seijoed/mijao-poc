package com.mijao.poc.persistence.civil.dao.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Embeddable;

@Embeddable
public class AntBloLicenciaPK implements Serializable {

    private String nrolicen;

    private String tipoli;

    private Timestamp fechaact;

    private String numerodo;

    private Timestamp fechades;

    private String orgapoli;

    private String nrodocde;

    private String activo;

    private String descripcion;

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Timestamp getFechaact() {
        return fechaact;
    }

    public void setFechaact(Timestamp fechaact) {
        this.fechaact = fechaact;
    }

    public Timestamp getFechades() {
        return fechades;
    }

    public void setFechades(Timestamp fechades) {
        this.fechades = fechades;
    }

    public String getNrodocde() {
        return nrodocde;
    }

    public void setNrodocde(String nrodocde) {
        this.nrodocde = nrodocde;
    }

    public String getNrolicen() {
        return nrolicen;
    }

    public void setNrolicen(String nrolicen) {
        this.nrolicen = nrolicen;
    }

    public String getNumerodo() {
        return numerodo;
    }

    public void setNumerodo(String numerodo) {
        this.numerodo = numerodo;
    }

    public String getOrgapoli() {
        return orgapoli;
    }

    public void setOrgapoli(String orgapoli) {
        this.orgapoli = orgapoli;
    }

    public String getTipoli() {
        return tipoli;
    }

    public void setTipoli(String tipoli) {
        this.tipoli = tipoli;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AntBloLicenciaPK)) {
            return false;
        }

        AntBloLicenciaPK that = (AntBloLicenciaPK) o;

        if (activo != null ? !activo.equals(that.activo) : that.activo != null) {
            return false;
        }
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) {
            return false;
        }
        if (fechaact != null ? !fechaact.equals(that.fechaact) : that.fechaact != null) {
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
        result = 31 * result + (fechaact != null ? fechaact.hashCode() : 0);
        result = 31 * result + (numerodo != null ? numerodo.hashCode() : 0);
        result = 31 * result + (fechades != null ? fechades.hashCode() : 0);
        result = 31 * result + (orgapoli != null ? orgapoli.hashCode() : 0);
        result = 31 * result + (nrodocde != null ? nrodocde.hashCode() : 0);
        result = 31 * result + (activo != null ? activo.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
