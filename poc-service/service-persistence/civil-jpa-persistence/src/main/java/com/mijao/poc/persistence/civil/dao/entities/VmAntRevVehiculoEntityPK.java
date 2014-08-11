package com.mijao.poc.persistence.civil.dao.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Embeddable;

@Embeddable
public class VmAntRevVehiculoEntityPK implements Serializable {

    private int nrostick;

    private String letra;

    private Timestamp fecha;

    private String placa;

    private String chasis;

    private String orgapoli;

    private String tipotran;

    private String anulado;

    public String getAnulado() {
        return anulado;
    }

    public void setAnulado(String anulado) {
        this.anulado = anulado;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getNrostick() {
        return nrostick;
    }

    public void setNrostick(int nrostick) {
        this.nrostick = nrostick;
    }

    public String getOrgapoli() {
        return orgapoli;
    }

    public void setOrgapoli(String orgapoli) {
        this.orgapoli = orgapoli;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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
        if (!(o instanceof VmAntRevVehiculoEntityPK)) {
            return false;
        }

        VmAntRevVehiculoEntityPK that = (VmAntRevVehiculoEntityPK) o;

        if (nrostick != that.nrostick) {
            return false;
        }
        if (anulado != null ? !anulado.equals(that.anulado) : that.anulado != null) {
            return false;
        }
        if (chasis != null ? !chasis.equals(that.chasis) : that.chasis != null) {
            return false;
        }
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) {
            return false;
        }
        if (letra != null ? !letra.equals(that.letra) : that.letra != null) {
            return false;
        }
        if (orgapoli != null ? !orgapoli.equals(that.orgapoli) : that.orgapoli != null) {
            return false;
        }
        if (placa != null ? !placa.equals(that.placa) : that.placa != null) {
            return false;
        }
        if (tipotran != null ? !tipotran.equals(that.tipotran) : that.tipotran != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = nrostick;
        result = 31 * result + (letra != null ? letra.hashCode() : 0);
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (placa != null ? placa.hashCode() : 0);
        result = 31 * result + (chasis != null ? chasis.hashCode() : 0);
        result = 31 * result + (orgapoli != null ? orgapoli.hashCode() : 0);
        result = 31 * result + (tipotran != null ? tipotran.hashCode() : 0);
        result = 31 * result + (anulado != null ? anulado.hashCode() : 0);
        return result;
    }
}
