package com.mijao.poc.persistence.civil.dao.entities;

import java.sql.Timestamp;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@javax.persistence.Table(name = "VM_ANT_REV_VEHICULO", schema = "REPDIN", catalog = "")
@Entity
public class VmAntRevVehiculoEntity {

    private VmAntRevVehiculoEntityPK vmAntRevVehiculoEntityPK;

    @Id
    public VmAntRevVehiculoEntityPK getVmAntRevVehiculoEntityPK() {
        return vmAntRevVehiculoEntityPK;
    }

    public void setVmAntRevVehiculoEntityPK(VmAntRevVehiculoEntityPK vmAntRevVehiculoEntityPK) {
        this.vmAntRevVehiculoEntityPK = vmAntRevVehiculoEntityPK;
    }

    private int nrostick;

    @javax.persistence.Column(name = "NROSTICK")
    @Basic
    public int getNrostick() {
        return nrostick;
    }

    public void setNrostick(int nrostick) {
        this.nrostick = nrostick;
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

    private Timestamp fecha;

    @javax.persistence.Column(name = "FECHA")
    @Basic
    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
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

    private String tipotran;

    @javax.persistence.Column(name = "TIPOTRAN")
    @Basic
    public String getTipotran() {
        return tipotran;
    }

    public void setTipotran(String tipotran) {
        this.tipotran = tipotran;
    }

    private String anulado;

    @javax.persistence.Column(name = "ANULADO")
    @Basic
    public String getAnulado() {
        return anulado;
    }

    public void setAnulado(String anulado) {
        this.anulado = anulado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        VmAntRevVehiculoEntity that = (VmAntRevVehiculoEntity) o;

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
