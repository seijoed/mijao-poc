package com.mijao.poc.persistence.civil.dao.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Embeddable;

@Embeddable
public class VmAntMatVehiculoEntityPK implements Serializable {

    private int nrorevi;

    private String letra;

    private Timestamp fechare;

    private Timestamp fechatran;

    private String tipotran;

    private int valormat;

    private String placa;

    private String chasis;

    private String orgapoli;

    private String anulada;

    public String getAnulada() {
        return anulada;
    }

    public void setAnulada(String anulada) {
        this.anulada = anulada;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Timestamp getFechare() {
        return fechare;
    }

    public void setFechare(Timestamp fechare) {
        this.fechare = fechare;
    }

    public Timestamp getFechatran() {
        return fechatran;
    }

    public void setFechatran(Timestamp fechatran) {
        this.fechatran = fechatran;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getNrorevi() {
        return nrorevi;
    }

    public void setNrorevi(int nrorevi) {
        this.nrorevi = nrorevi;
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

    public int getValormat() {
        return valormat;
    }

    public void setValormat(int valormat) {
        this.valormat = valormat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VmAntMatVehiculoEntityPK)) {
            return false;
        }

        VmAntMatVehiculoEntityPK that = (VmAntMatVehiculoEntityPK) o;

        if (nrorevi != that.nrorevi) {
            return false;
        }
        if (valormat != that.valormat) {
            return false;
        }
        if (anulada != null ? !anulada.equals(that.anulada) : that.anulada != null) {
            return false;
        }
        if (chasis != null ? !chasis.equals(that.chasis) : that.chasis != null) {
            return false;
        }
        if (fechare != null ? !fechare.equals(that.fechare) : that.fechare != null) {
            return false;
        }
        if (fechatran != null ? !fechatran.equals(that.fechatran) : that.fechatran != null) {
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
        int result = nrorevi;
        result = 31 * result + (letra != null ? letra.hashCode() : 0);
        result = 31 * result + (fechare != null ? fechare.hashCode() : 0);
        result = 31 * result + (fechatran != null ? fechatran.hashCode() : 0);
        result = 31 * result + (tipotran != null ? tipotran.hashCode() : 0);
        result = 31 * result + valormat;
        result = 31 * result + (placa != null ? placa.hashCode() : 0);
        result = 31 * result + (chasis != null ? chasis.hashCode() : 0);
        result = 31 * result + (orgapoli != null ? orgapoli.hashCode() : 0);
        result = 31 * result + (anulada != null ? anulada.hashCode() : 0);
        return result;
    }
}
