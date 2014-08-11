package com.mijao.poc.persistence.civil.dao.entities;

import java.sql.Timestamp;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@javax.persistence.Table(name = "VM_ANT_MAT_VEHICULO", schema = "REPDIN", catalog = "")
@Entity
public class VmAntMatVehiculoEntity {

    private VmAntMatVehiculoEntityPK vmAntMatVehiculoEntityPK;

    @Id
    public VmAntMatVehiculoEntityPK getVmAntMatVehiculoEntityPK() {
        return vmAntMatVehiculoEntityPK;
    }

    public void setVmAntMatVehiculoEntityPK(VmAntMatVehiculoEntityPK vmAntMatVehiculoEntityPK) {
        this.vmAntMatVehiculoEntityPK = vmAntMatVehiculoEntityPK;
    }

    private int nrorevi;

    @javax.persistence.Column(name = "NROREVI")
    @Basic
    public int getNrorevi() {
        return nrorevi;
    }

    public void setNrorevi(int nrorevi) {
        this.nrorevi = nrorevi;
    }

    private String letra;

    @javax.persistence.Column(name = "LETRA")
    @Basic
    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    private Timestamp fechare;

    @javax.persistence.Column(name = "FECHARE")
    @Basic
    public Timestamp getFechare() {
        return fechare;
    }

    public void setFechare(Timestamp fechare) {
        this.fechare = fechare;
    }

    private Timestamp fechatran;

    @javax.persistence.Column(name = "FECHATRAN")
    @Basic
    public Timestamp getFechatran() {
        return fechatran;
    }

    public void setFechatran(Timestamp fechatran) {
        this.fechatran = fechatran;
    }

    private String tipotran;

    @javax.persistence.Column(name = "TIPOTRAN")
    @Basic
    public String getTipotran() {
        return tipotran;
    }

    public void setTipotran(String tipotran) {
        this.tipotran = tipotran;
    }

    private int valormat;

    @javax.persistence.Column(name = "VALORMAT")
    @Basic
    public int getValormat() {
        return valormat;
    }

    public void setValormat(int valormat) {
        this.valormat = valormat;
    }

    private String placa;

    @javax.persistence.Column(name = "PLACA")
    @Basic
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    private String chasis;

    @javax.persistence.Column(name = "CHASIS")
    @Basic
    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    private String orgapoli;

    @javax.persistence.Column(name = "ORGAPOLI")
    @Basic
    public String getOrgapoli() {
        return orgapoli;
    }

    public void setOrgapoli(String orgapoli) {
        this.orgapoli = orgapoli;
    }

    private String anulada;

    @javax.persistence.Column(name = "ANULADA")
    @Basic
    public String getAnulada() {
        return anulada;
    }

    public void setAnulada(String anulada) {
        this.anulada = anulada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        VmAntMatVehiculoEntity that = (VmAntMatVehiculoEntity) o;

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
