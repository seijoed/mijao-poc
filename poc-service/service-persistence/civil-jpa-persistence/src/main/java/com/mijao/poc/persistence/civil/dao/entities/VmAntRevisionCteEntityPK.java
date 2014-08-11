package com.mijao.poc.persistence.civil.dao.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Embeddable;

@Embeddable
public class VmAntRevisionCteEntityPK implements Serializable {

    private int nrorevi;

    private String letra;

    private Timestamp fechare;

    private Timestamp fechatran;

    private String tipotran;

    private String valormat;

    private String placa;

    private String chasis;

    private int idTramite;

    private String orgapoli;

    private String tipoIden;

    private String identificacion;

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

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getIdTramite() {
        return idTramite;
    }

    public void setIdTramite(int idTramite) {
        this.idTramite = idTramite;
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

    public String getTipoIden() {
        return tipoIden;
    }

    public void setTipoIden(String tipoIden) {
        this.tipoIden = tipoIden;
    }

    public String getTipotran() {
        return tipotran;
    }

    public void setTipotran(String tipotran) {
        this.tipotran = tipotran;
    }

    public String getValormat() {
        return valormat;
    }

    public void setValormat(String valormat) {
        this.valormat = valormat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VmAntRevisionCteEntityPK)) {
            return false;
        }

        VmAntRevisionCteEntityPK that = (VmAntRevisionCteEntityPK) o;

        if (idTramite != that.idTramite) {
            return false;
        }
        if (nrorevi != that.nrorevi) {
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
        if (identificacion != null ? !identificacion.equals(that.identificacion) : that.identificacion != null) {
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
        if (tipoIden != null ? !tipoIden.equals(that.tipoIden) : that.tipoIden != null) {
            return false;
        }
        if (tipotran != null ? !tipotran.equals(that.tipotran) : that.tipotran != null) {
            return false;
        }
        if (valormat != null ? !valormat.equals(that.valormat) : that.valormat != null) {
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
        result = 31 * result + (valormat != null ? valormat.hashCode() : 0);
        result = 31 * result + (placa != null ? placa.hashCode() : 0);
        result = 31 * result + (chasis != null ? chasis.hashCode() : 0);
        result = 31 * result + idTramite;
        result = 31 * result + (orgapoli != null ? orgapoli.hashCode() : 0);
        result = 31 * result + (tipoIden != null ? tipoIden.hashCode() : 0);
        result = 31 * result + (identificacion != null ? identificacion.hashCode() : 0);
        return result;
    }
}
