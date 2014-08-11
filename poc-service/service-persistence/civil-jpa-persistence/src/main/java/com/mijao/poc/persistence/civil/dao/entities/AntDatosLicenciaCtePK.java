package com.mijao.poc.persistence.civil.dao.entities;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class AntDatosLicenciaCtePK implements Serializable {

    private String nrolicen;

    private String tipoli;

    private String nombre1;

    private String nombre2;

    private String apellido1;

    private String apellido2;

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getNrolicen() {
        return nrolicen;
    }

    public void setNrolicen(String nrolicen) {
        this.nrolicen = nrolicen;
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
        if (!(o instanceof AntDatosLicenciaCtePK)) {
            return false;
        }

        AntDatosLicenciaCtePK that = (AntDatosLicenciaCtePK) o;

        if (apellido1 != null ? !apellido1.equals(that.apellido1) : that.apellido1 != null) {
            return false;
        }
        if (apellido2 != null ? !apellido2.equals(that.apellido2) : that.apellido2 != null) {
            return false;
        }
        if (nombre1 != null ? !nombre1.equals(that.nombre1) : that.nombre1 != null) {
            return false;
        }
        if (nombre2 != null ? !nombre2.equals(that.nombre2) : that.nombre2 != null) {
            return false;
        }
        if (nrolicen != null ? !nrolicen.equals(that.nrolicen) : that.nrolicen != null) {
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
        result = 31 * result + (nombre1 != null ? nombre1.hashCode() : 0);
        result = 31 * result + (nombre2 != null ? nombre2.hashCode() : 0);
        result = 31 * result + (apellido1 != null ? apellido1.hashCode() : 0);
        result = 31 * result + (apellido2 != null ? apellido2.hashCode() : 0);
        return result;
    }
}
