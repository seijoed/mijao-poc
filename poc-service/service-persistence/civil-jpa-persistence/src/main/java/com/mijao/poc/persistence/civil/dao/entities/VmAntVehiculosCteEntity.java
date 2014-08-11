package com.mijao.poc.persistence.civil.dao.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@javax.persistence.Table(name = "VM_ANT_VEHICULOS_CTE", schema = "REPDIN", catalog = "")
@Entity
public class VmAntVehiculosCteEntity {

    private VmAntVehiculosCteEntityPK vmAntVehiculosCteEntityPK;

    @Id
    public VmAntVehiculosCteEntityPK getVmAntVehiculosCteEntityPK() {
        return vmAntVehiculosCteEntityPK;
    }

    public void setVmAntVehiculosCteEntityPK(VmAntVehiculosCteEntityPK vmAntVehiculosCteEntityPK) {
        this.vmAntVehiculosCteEntityPK = vmAntVehiculosCteEntityPK;
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

    private String combustible;

    @javax.persistence.Column(name = "COMBUSTIBLE")
    @Basic
    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    private String carroceria;

    @javax.persistence.Column(name = "CARROCERIA")
    @Basic
    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    private String fechaba;

    @javax.persistence.Column(name = "FECHABA")
    @Basic
    public String getFechaba() {
        return fechaba;
    }

    public void setFechaba(String fechaba) {
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

    private String tipoIdentificacion;

    @javax.persistence.Column(name = "TIPO_IDENTIFICACION")
    @Basic
    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    private String identificacionPropietario;

    @javax.persistence.Column(name = "IDENTIFICACION_PROPIETARIO")
    @Basic
    public String getIdentificacionPropietario() {
        return identificacionPropietario;
    }

    public void setIdentificacionPropietario(String identificacionPropietario) {
        this.identificacionPropietario = identificacionPropietario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        VmAntVehiculosCteEntity that = (VmAntVehiculosCteEntity) o;

        if (aniofab != null ? !aniofab.equals(that.aniofab) : that.aniofab != null) {
            return false;
        }
        if (carroceria != null ? !carroceria.equals(that.carroceria) : that.carroceria != null) {
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
        if (combustible != null ? !combustible.equals(that.combustible) : that.combustible != null) {
            return false;
        }
        if (fechaba != null ? !fechaba.equals(that.fechaba) : that.fechaba != null) {
            return false;
        }
        if (identificacionPropietario != null ? !identificacionPropietario.equals(that.identificacionPropietario)
            : that.identificacionPropietario != null) {
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
        if (tipoIdentificacion != null ? !tipoIdentificacion.equals(that.tipoIdentificacion) : that.tipoIdentificacion != null) {
            return false;
        }
        if (tipomat != null ? !tipomat.equals(that.tipomat) : that.tipomat != null) {
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
        result = 31 * result + (combustible != null ? combustible.hashCode() : 0);
        result = 31 * result + (carroceria != null ? carroceria.hashCode() : 0);
        result = 31 * result + (fechaba != null ? fechaba.hashCode() : 0);
        result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
        result = 31 * result + (marca != null ? marca.hashCode() : 0);
        result = 31 * result + (tipovehi != null ? tipovehi.hashCode() : 0);
        result = 31 * result + (clasevehi != null ? clasevehi.hashCode() : 0);
        result = 31 * result + (tipomat != null ? tipomat.hashCode() : 0);
        result = 31 * result + (color1 != null ? color1.hashCode() : 0);
        result = 31 * result + (color2 != null ? color2.hashCode() : 0);
        result = 31 * result + (tipoIdentificacion != null ? tipoIdentificacion.hashCode() : 0);
        result = 31 * result + (identificacionPropietario != null ? identificacionPropietario.hashCode() : 0);
        return result;
    }
}
