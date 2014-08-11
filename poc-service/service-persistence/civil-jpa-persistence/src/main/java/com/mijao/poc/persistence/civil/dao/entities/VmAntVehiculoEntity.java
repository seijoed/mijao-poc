package com.mijao.poc.persistence.civil.dao.entities;

import java.sql.Timestamp;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@javax.persistence.Table(name = "VM_ANT_VEHICULO", schema = "REPDIN", catalog = "")
@Entity
public class VmAntVehiculoEntity {

    private VmAntVehiculoEntityPK vmAntVehiculoEntityPK;

    @Id
    public VmAntVehiculoEntityPK getVmAntVehiculoEntityPK() {
        return vmAntVehiculoEntityPK;
    }

    public void setVmAntVehiculoEntityPK(VmAntVehiculoEntityPK vmAntVehiculoEntityPK) {
        this.vmAntVehiculoEntityPK = vmAntVehiculoEntityPK;
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

    private String aniofab;

    @javax.persistence.Column(name = "ANIOFAB")
    @Basic
    public String getAniofab() {
        return aniofab;
    }

    public void setAniofab(String aniofab) {
        this.aniofab = aniofab;
    }

    private String cilindra;

    @javax.persistence.Column(name = "CILINDRA")
    @Basic
    public String getCilindra() {
        return cilindra;
    }

    public void setCilindra(String cilindra) {
        this.cilindra = cilindra;
    }

    private String motor;

    @javax.persistence.Column(name = "MOTOR")
    @Basic
    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    private String combus;

    @javax.persistence.Column(name = "COMBUS")
    @Basic
    public String getCombus() {
        return combus;
    }

    public void setCombus(String combus) {
        this.combus = combus;
    }

    private String carroce;

    @javax.persistence.Column(name = "CARROCE")
    @Basic
    public String getCarroce() {
        return carroce;
    }

    public void setCarroce(String carroce) {
        this.carroce = carroce;
    }

    private Timestamp fechaba;

    @javax.persistence.Column(name = "FECHABA")
    @Basic
    public Timestamp getFechaba() {
        return fechaba;
    }

    public void setFechaba(Timestamp fechaba) {
        this.fechaba = fechaba;
    }

    private String modelo;

    @javax.persistence.Column(name = "MODELO")
    @Basic
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private String marca;

    @javax.persistence.Column(name = "MARCA")
    @Basic
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    private String tipovehi;

    @javax.persistence.Column(name = "TIPOVEHI")
    @Basic
    public String getTipovehi() {
        return tipovehi;
    }

    public void setTipovehi(String tipovehi) {
        this.tipovehi = tipovehi;
    }

    private String clasevehi;

    @javax.persistence.Column(name = "CLASEVEHI")
    @Basic
    public String getClasevehi() {
        return clasevehi;
    }

    public void setClasevehi(String clasevehi) {
        this.clasevehi = clasevehi;
    }

    private String tipomat;

    @javax.persistence.Column(name = "TIPOMAT")
    @Basic
    public String getTipomat() {
        return tipomat;
    }

    public void setTipomat(String tipomat) {
        this.tipomat = tipomat;
    }

    private String color1;

    @javax.persistence.Column(name = "COLOR1")
    @Basic
    public String getColor1() {
        return color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    private String color2;

    @javax.persistence.Column(name = "COLOR2")
    @Basic
    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    private String tipopro;

    @javax.persistence.Column(name = "TIPOPRO")
    @Basic
    public String getTipopro() {
        return tipopro;
    }

    public void setTipopro(String tipopro) {
        this.tipopro = tipopro;
    }

    private String identificacion;

    @javax.persistence.Column(name = "IDENTIFICACION")
    @Basic
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        VmAntVehiculoEntity that = (VmAntVehiculoEntity) o;

        if (aniofab != null ? !aniofab.equals(that.aniofab) : that.aniofab != null) {
            return false;
        }
        if (carroce != null ? !carroce.equals(that.carroce) : that.carroce != null) {
            return false;
        }
        if (chasis != null ? !chasis.equals(that.chasis) : that.chasis != null) {
            return false;
        }
        if (cilindra != null ? !cilindra.equals(that.cilindra) : that.cilindra != null) {
            return false;
        }
        if (clasevehi != null ? !clasevehi.equals(that.clasevehi) : that.clasevehi != null) {
            return false;
        }
        if (color1 != null ? !color1.equals(that.color1) : that.color1 != null) {
            return false;
        }
        if (color2 != null ? !color2.equals(that.color2) : that.color2 != null) {
            return false;
        }
        if (combus != null ? !combus.equals(that.combus) : that.combus != null) {
            return false;
        }
        if (fechaba != null ? !fechaba.equals(that.fechaba) : that.fechaba != null) {
            return false;
        }
        if (identificacion != null ? !identificacion.equals(that.identificacion) : that.identificacion != null) {
            return false;
        }
        if (marca != null ? !marca.equals(that.marca) : that.marca != null) {
            return false;
        }
        if (modelo != null ? !modelo.equals(that.modelo) : that.modelo != null) {
            return false;
        }
        if (motor != null ? !motor.equals(that.motor) : that.motor != null) {
            return false;
        }
        if (placa != null ? !placa.equals(that.placa) : that.placa != null) {
            return false;
        }
        if (tipomat != null ? !tipomat.equals(that.tipomat) : that.tipomat != null) {
            return false;
        }
        if (tipopro != null ? !tipopro.equals(that.tipopro) : that.tipopro != null) {
            return false;
        }
        if (tipovehi != null ? !tipovehi.equals(that.tipovehi) : that.tipovehi != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = placa != null ? placa.hashCode() : 0;
        result = 31 * result + (chasis != null ? chasis.hashCode() : 0);
        result = 31 * result + (aniofab != null ? aniofab.hashCode() : 0);
        result = 31 * result + (cilindra != null ? cilindra.hashCode() : 0);
        result = 31 * result + (motor != null ? motor.hashCode() : 0);
        result = 31 * result + (combus != null ? combus.hashCode() : 0);
        result = 31 * result + (carroce != null ? carroce.hashCode() : 0);
        result = 31 * result + (fechaba != null ? fechaba.hashCode() : 0);
        result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
        result = 31 * result + (marca != null ? marca.hashCode() : 0);
        result = 31 * result + (tipovehi != null ? tipovehi.hashCode() : 0);
        result = 31 * result + (clasevehi != null ? clasevehi.hashCode() : 0);
        result = 31 * result + (tipomat != null ? tipomat.hashCode() : 0);
        result = 31 * result + (color1 != null ? color1.hashCode() : 0);
        result = 31 * result + (color2 != null ? color2.hashCode() : 0);
        result = 31 * result + (tipopro != null ? tipopro.hashCode() : 0);
        result = 31 * result + (identificacion != null ? identificacion.hashCode() : 0);
        return result;
    }
}
