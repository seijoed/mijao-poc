package com.mijao.poc.persistence.civil.dao.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@javax.persistence.Table(name = "VM_ANT_LICENCIA", schema = "REPDIN", catalog = "")
@Entity

public class VmAntLicencia {

    private AntLicenciaPK antLicenciaPK;

    @Id
    public AntLicenciaPK getAntLicenciaPK() {
        return antLicenciaPK;
    }

    public void setAntLicenciaPK(AntLicenciaPK antLicenciaPK) {
        this.antLicenciaPK = antLicenciaPK;
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
}
