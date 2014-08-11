package com.mijao.poc.persistence.civil.dao.entities;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Id;

@javax.persistence.Table(name = "VM_ANT_INFRACCIONES_CTE", schema = "REPDIN", catalog = "")
@Entity
public class VmAntInfraccionesCte {

    private AntInfraccionesCtePK antInfraccionesCtePK;

    @Id
    public AntInfraccionesCtePK getAntInfraccionesCtePK() {
        return antInfraccionesCtePK;
    }

    public void setAntInfraccionesCtePK(AntInfraccionesCtePK antInfraccionesCtePK) {
        this.antInfraccionesCtePK = antInfraccionesCtePK;
    }

    private String codinf;

    @javax.persistence.Column(name = "CODINF")
    public String getCodinf() {
        return codinf;
    }

    public void setCodinf(String codinf) {
        this.codinf = codinf;
    }

    private String persona;

    @javax.persistence.Column(name = "PERSONA")
    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    private String licencia;

    @javax.persistence.Column(name = "LICENCIA")
    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    private String tipoli;

    @javax.persistence.Column(name = "TIPOLI")
    public String getTipoli() {
        return tipoli;
    }

    public void setTipoli(String tipoli) {
        this.tipoli = tipoli;
    }

    private String vehiculo;

    @javax.persistence.Column(name = "VEHICULO")
    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    private String contravencion;

    @javax.persistence.Column(name = "CONTRAVENCION")
    public String getContravencion() {
        return contravencion;
    }

    public void setContravencion(String contravencion) {
        this.contravencion = contravencion;
    }

    private Timestamp fecha;

    @javax.persistence.Column(name = "FECHA")
    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    private Timestamp fechal;

    @javax.persistence.Column(name = "FECHAL")
    public Timestamp getFechal() {
        return fechal;
    }

    public void setFechal(Timestamp fechal) {
        this.fechal = fechal;
    }

    private String cancelada;

    @javax.persistence.Column(name = "CANCELADA")
    public String getCancelada() {
        return cancelada;
    }

    public void setCancelada(String cancelada) {
        this.cancelada = cancelada;
    }

    private String desactiv;

    @javax.persistence.Column(name = "DESACTIV")
    public String getDesactiv() {
        return desactiv;
    }

    public void setDesactiv(String desactiv) {
        this.desactiv = desactiv;
    }

    private Integer idFactura;

    @javax.persistence.Column(name = "ID_FACTURA")
    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    private String localidad;

    @javax.persistence.Column(name = "LOCALIDAD")
    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    private String origen;

    @javax.persistence.Column(name = "ORIGEN")
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    private Integer puntos;

    @javax.persistence.Column(name = "PUNTOS")
    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        VmAntInfraccionesCte that = (VmAntInfraccionesCte) o;

        if (cancelada != null ? !cancelada.equals(that.cancelada) : that.cancelada != null) {
            return false;
        }
        if (codinf != null ? !codinf.equals(that.codinf) : that.codinf != null) {
            return false;
        }
        if (contravencion != null ? !contravencion.equals(that.contravencion) : that.contravencion != null) {
            return false;
        }
        if (desactiv != null ? !desactiv.equals(that.desactiv) : that.desactiv != null) {
            return false;
        }
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) {
            return false;
        }
        if (fechal != null ? !fechal.equals(that.fechal) : that.fechal != null) {
            return false;
        }
        if (idFactura != null ? !idFactura.equals(that.idFactura) : that.idFactura != null) {
            return false;
        }
        if (licencia != null ? !licencia.equals(that.licencia) : that.licencia != null) {
            return false;
        }
        if (localidad != null ? !localidad.equals(that.localidad) : that.localidad != null) {
            return false;
        }
        if (origen != null ? !origen.equals(that.origen) : that.origen != null) {
            return false;
        }
        if (persona != null ? !persona.equals(that.persona) : that.persona != null) {
            return false;
        }
        if (puntos != null ? !puntos.equals(that.puntos) : that.puntos != null) {
            return false;
        }
        if (tipoli != null ? !tipoli.equals(that.tipoli) : that.tipoli != null) {
            return false;
        }
        if (vehiculo != null ? !vehiculo.equals(that.vehiculo) : that.vehiculo != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = codinf != null ? codinf.hashCode() : 0;
        result = 31 * result + (persona != null ? persona.hashCode() : 0);
        result = 31 * result + (licencia != null ? licencia.hashCode() : 0);
        result = 31 * result + (tipoli != null ? tipoli.hashCode() : 0);
        result = 31 * result + (vehiculo != null ? vehiculo.hashCode() : 0);
        result = 31 * result + (contravencion != null ? contravencion.hashCode() : 0);
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (fechal != null ? fechal.hashCode() : 0);
        result = 31 * result + (cancelada != null ? cancelada.hashCode() : 0);
        result = 31 * result + (desactiv != null ? desactiv.hashCode() : 0);
        result = 31 * result + (idFactura != null ? idFactura.hashCode() : 0);
        result = 31 * result + (localidad != null ? localidad.hashCode() : 0);
        result = 31 * result + (origen != null ? origen.hashCode() : 0);
        result = 31 * result + (puntos != null ? puntos.hashCode() : 0);
        return result;
    }
}
