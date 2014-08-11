package com.mijao.poc.persistence.civil.dao.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Embeddable;

@Embeddable
public class AntMovLicenciaPK implements Serializable {

    private String nrolicen;

    private String tipoli;

    private String nombre1;

    private String nombre2;

    private String apellido1;

    private String apellido2;

    private Timestamp fecha;

    private String orgapoli;

    private Integer examed;

    private String tipotran;

    private Integer numero;

    private String letrafor;

    private Timestamp fechacad;

    private String anulada;

    public String getAnulada() {
        return anulada;
    }

    public void setAnulada(String anulada) {
        this.anulada = anulada;
    }

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

    public Integer getExamed() {
        return examed;
    }

    public void setExamed(Integer examed) {
        this.examed = examed;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public Timestamp getFechacad() {
        return fechacad;
    }

    public void setFechacad(Timestamp fechacad) {
        this.fechacad = fechacad;
    }

    public String getLetrafor() {
        return letrafor;
    }

    public void setLetrafor(String letrafor) {
        this.letrafor = letrafor;
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

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
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

    public String getTipotran() {
        return tipotran;
    }

    public void setTipotran(String tipotran) {
        this.tipotran = tipotran;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AntMovLicenciaPK)) {
            return false;
        }

        AntMovLicenciaPK that = (AntMovLicenciaPK) o;

        if (anulada != null ? !anulada.equals(that.anulada) : that.anulada != null) {
            return false;
        }
        if (apellido1 != null ? !apellido1.equals(that.apellido1) : that.apellido1 != null) {
            return false;
        }
        if (apellido2 != null ? !apellido2.equals(that.apellido2) : that.apellido2 != null) {
            return false;
        }
        if (examed != null ? !examed.equals(that.examed) : that.examed != null) {
            return false;
        }
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) {
            return false;
        }
        if (fechacad != null ? !fechacad.equals(that.fechacad) : that.fechacad != null) {
            return false;
        }
        if (letrafor != null ? !letrafor.equals(that.letrafor) : that.letrafor != null) {
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
        if (numero != null ? !numero.equals(that.numero) : that.numero != null) {
            return false;
        }
        if (orgapoli != null ? !orgapoli.equals(that.orgapoli) : that.orgapoli != null) {
            return false;
        }
        if (tipoli != null ? !tipoli.equals(that.tipoli) : that.tipoli != null) {
            return false;
        }
        if (tipotran != null ? !tipotran.equals(that.tipotran) : that.tipotran != null) {
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
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (orgapoli != null ? orgapoli.hashCode() : 0);
        result = 31 * result + (examed != null ? examed.hashCode() : 0);
        result = 31 * result + (tipotran != null ? tipotran.hashCode() : 0);
        result = 31 * result + (numero != null ? numero.hashCode() : 0);
        result = 31 * result + (letrafor != null ? letrafor.hashCode() : 0);
        result = 31 * result + (fechacad != null ? fechacad.hashCode() : 0);
        result = 31 * result + (anulada != null ? anulada.hashCode() : 0);
        return result;
    }
}
