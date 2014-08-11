package com.mijao.poc.persistence.civil.dao.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Embeddable;

@Embeddable
public class VmAntVehiculoEntityPK implements Serializable {

    private String placa;


       private String chasis;


       private String aniofab;


       private String cilindra;

       private String motor;


       private String combus;


       private String carroce;


       private Timestamp fechaba;


       private String modelo;


       private String marca;


       private String tipovehi;


       private String clasevehi;


       private String tipomat;


       private String color1;

       private String color2;


       private String tipopro;

       private String identificacion;

    public String getAniofab() {
        return aniofab;
    }

    public void setAniofab(String aniofab) {
        this.aniofab = aniofab;
    }

    public String getCarroce() {
        return carroce;
    }

    public void setCarroce(String carroce) {
        this.carroce = carroce;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getCilindra() {
        return cilindra;
    }

    public void setCilindra(String cilindra) {
        this.cilindra = cilindra;
    }

    public String getClasevehi() {
        return clasevehi;
    }

    public void setClasevehi(String clasevehi) {
        this.clasevehi = clasevehi;
    }

    public String getColor1() {
        return color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public String getCombus() {
        return combus;
    }

    public void setCombus(String combus) {
        this.combus = combus;
    }

    public Timestamp getFechaba() {
        return fechaba;
    }

    public void setFechaba(Timestamp fechaba) {
        this.fechaba = fechaba;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipomat() {
        return tipomat;
    }

    public void setTipomat(String tipomat) {
        this.tipomat = tipomat;
    }

    public String getTipopro() {
        return tipopro;
    }

    public void setTipopro(String tipopro) {
        this.tipopro = tipopro;
    }

    public String getTipovehi() {
        return tipovehi;
    }

    public void setTipovehi(String tipovehi) {
        this.tipovehi = tipovehi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VmAntVehiculoEntityPK)) {
            return false;
        }

        VmAntVehiculoEntityPK that = (VmAntVehiculoEntityPK) o;

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
