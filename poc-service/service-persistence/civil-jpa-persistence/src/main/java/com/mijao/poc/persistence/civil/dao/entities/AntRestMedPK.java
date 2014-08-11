package com.mijao.poc.persistence.civil.dao.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Embeddable;

@Embeddable
public class AntRestMedPK implements Serializable {

    private String documento;

    private Timestamp fecha;

    private String solodia;

    private String lentes;

    private String lentesco;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AntRestMedPK)) {
            return false;
        }

        AntRestMedPK that = (AntRestMedPK) o;

        if (documento != null ? !documento.equals(that.documento) : that.documento != null) {
            return false;
        }
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) {
            return false;
        }
        if (lentes != null ? !lentes.equals(that.lentes) : that.lentes != null) {
            return false;
        }
        if (lentesco != null ? !lentesco.equals(that.lentesco) : that.lentesco != null) {
            return false;
        }
        if (solodia != null ? !solodia.equals(that.solodia) : that.solodia != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = documento != null ? documento.hashCode() : 0;
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (solodia != null ? solodia.hashCode() : 0);
        result = 31 * result + (lentes != null ? lentes.hashCode() : 0);
        result = 31 * result + (lentesco != null ? lentesco.hashCode() : 0);
        return result;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getLentes() {
        return lentes;
    }

    public void setLentes(String lentes) {
        this.lentes = lentes;
    }

    public String getLentesco() {
        return lentesco;
    }

    public void setLentesco(String lentesco) {
        this.lentesco = lentesco;
    }

    public String getSolodia() {
        return solodia;
    }

    public void setSolodia(String solodia) {
        this.solodia = solodia;
    }
}
