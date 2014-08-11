package com.mijao.poc.persistence.civil.dao.entities;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Id;

@javax.persistence.Table(name = "VM_ANT_MOVIMIENTOS_LIC_CTE", schema = "REPDIN", catalog = "")
@Entity
public class VmAntMovimientosLicCte {

    private AntMovimientosLicCtePK antMovimientosLicCtePK;

    @Id
    public AntMovimientosLicCtePK getAntMovimientosLicCtePK() {
        return antMovimientosLicCtePK;
    }

    public void setAntMovimientosLicCtePK(AntMovimientosLicCtePK antMovimientosLicCtePK) {
        this.antMovimientosLicCtePK = antMovimientosLicCtePK;
    }

    private String nrolicen;

    @javax.persistence.Column(name = "NROLICEN")
    public String getNrolicen() {
        return nrolicen;
    }

    public void setNrolicen(String nrolicen) {
        this.nrolicen = nrolicen;
    }

    private String tipoli;

    @javax.persistence.Column(name = "TIPOLI")
    public String getTipoli() {
        return tipoli;
    }

    public void setTipoli(String tipoli) {
        this.tipoli = tipoli;
    }

    private String nombre1;

    @javax.persistence.Column(name = "NOMBRE1")
    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    private String nombre2;

    @javax.persistence.Column(name = "NOMBRE2")
    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    private String apellido1;

    @javax.persistence.Column(name = "APELLIDO1")
    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    private String apellido2;

    @javax.persistence.Column(name = "APELLIDO2")
    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    private Timestamp fecha;

    @javax.persistence.Column(name = "FECHA")
    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    private String orgapoli;

    @javax.persistence.Column(name = "ORGAPOLI")
    public String getOrgapoli() {
        return orgapoli;
    }

    public void setOrgapoli(String orgapoli) {
        this.orgapoli = orgapoli;
    }

    private Integer examed;

    @javax.persistence.Column(name = "EXAMED")
    public Integer getExamed() {
        return examed;
    }

    public void setExamed(Integer examed) {
        this.examed = examed;
    }

    private String numero;

    @javax.persistence.Column(name = "NUMERO",length = 10)
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    private String letrafor;

    @javax.persistence.Column(name = "LETRAFOR")
    public String getLetrafor() {
        return letrafor;
    }

    public void setLetrafor(String letrafor) {
        this.letrafor = letrafor;
    }

    private Timestamp fechacad;

    @javax.persistence.Column(name = "FECHACAD")
    public Timestamp getFechacad() {
        return fechacad;
    }

    public void setFechacad(Timestamp fechacad) {
        this.fechacad = fechacad;
    }
}
