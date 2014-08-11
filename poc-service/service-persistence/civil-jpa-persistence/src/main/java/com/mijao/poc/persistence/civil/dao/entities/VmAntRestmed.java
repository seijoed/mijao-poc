package com.mijao.poc.persistence.civil.dao.entities;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Id;

@javax.persistence.Table(name = "VM_ANT_RESTMED", schema = "REPDIN", catalog = "")
@Entity

public class VmAntRestmed {

    private AntRestMedPK antRestMedPK;

    @Id
    public AntRestMedPK getAntRestMedPK() {
        return antRestMedPK;
    }

    public void setAntRestMedPK(AntRestMedPK antRestMedPK) {
        this.antRestMedPK = antRestMedPK;
    }

    private String documento;

    @javax.persistence.Column(name = "DOCUMENTO")
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    private Timestamp fecha;

    @javax.persistence.Column(name = "FECHA")
    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    private String solodia;

    @javax.persistence.Column(name = "SOLODIA")
    public String getSolodia() {
        return solodia;
    }

    public void setSolodia(String solodia) {
        this.solodia = solodia;
    }

    private String lentes;

    @javax.persistence.Column(name = "LENTES")
    public String getLentes() {
        return lentes;
    }

    public void setLentes(String lentes) {
        this.lentes = lentes;
    }

    private String lentesco;

    @javax.persistence.Column(name = "LENTESCO")
    public String getLentesco() {
        return lentesco;
    }

    public void setLentesco(String lentesco) {
        this.lentesco = lentesco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        VmAntRestmed that = (VmAntRestmed) o;

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
}
