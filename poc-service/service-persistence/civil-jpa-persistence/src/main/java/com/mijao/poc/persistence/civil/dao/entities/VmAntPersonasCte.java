package com.mijao.poc.persistence.civil.dao.entities;

import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@javax.persistence.Table(name = "VM_ANT_PERSONAS_CTE", schema = "REPDIN", catalog = "")
@Entity
public class VmAntPersonasCte {

    private AntPersonasCtePK antPersonasCtePK;

    @Id
    public AntPersonasCtePK getAntPersonasCtePK() {
        return antPersonasCtePK;
    }

    public void setAntPersonasCtePK(AntPersonasCtePK antPersonasCtePK) {
        this.antPersonasCtePK = antPersonasCtePK;
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

    private String tipo;

    @javax.persistence.Column(name = "TIPO")
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private String documento;

    @javax.persistence.Column(name = "DOCUMENTO")
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    private String direccion;

    @javax.persistence.Column(name = "DIRECCION")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    private String numero;

    @javax.persistence.Column(name = "NUMERO")
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    private String tipoSangre;

    @javax.persistence.Column(name = "TIPO_SANGRE")
    @Basic
    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    private String fechaNacimiento;

    @javax.persistence.Column(name = "FECHA_NACIMIENTO")
    @Basic
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    //Join-Selects

    //Lists of actions

    private Collection<VmAntDatosLicenciaCte> vmAntDatosLicenciaCte;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "NROLICEN", referencedColumnName = "DOCUMENTO", insertable = false, updatable = false)
    public Collection<VmAntDatosLicenciaCte> getVmAntDatosLicenciaCte() {
        return vmAntDatosLicenciaCte;
    }

    public void setVmAntDatosLicenciaCte(Collection<VmAntDatosLicenciaCte> licencias) {
        vmAntDatosLicenciaCte = licencias;
    }

    private Collection<VmAntMovimientosLicCte> vmAntMovimientosLicCte;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "NROLICEN", referencedColumnName = "DOCUMENTO", insertable = false, updatable = false)
    public Collection<VmAntMovimientosLicCte> getVmAntMovimientosLicCte() {
        return vmAntMovimientosLicCte;
    }

    public void setVmAntMovimientosLicCte(Collection<VmAntMovimientosLicCte> licencias) {
        vmAntMovimientosLicCte = licencias;
    }

    private Collection<VmAntBloqueosLicCte> vmAntBloqueosLicCtes;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "NROLICEN", referencedColumnName = "DOCUMENTO", insertable = false, updatable = false)
    public Collection<VmAntBloqueosLicCte> getVmAntBloqueosLicCtes() {
        return vmAntBloqueosLicCtes;
    }

    public void setVmAntBloqueosLicCtes(Collection<VmAntBloqueosLicCte> licencias) {
        vmAntBloqueosLicCtes = licencias;
    }

    private Collection<VmAntInfraccionesCte> vmAntInfraccionesCtes;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "LICENCIA", referencedColumnName = "DOCUMENTO", insertable = false, updatable = false)
    public Collection<VmAntInfraccionesCte> getVmAntInfraccionesCtes() {
        return vmAntInfraccionesCtes;
    }

    public void setVmAntInfraccionesCtes(Collection<VmAntInfraccionesCte> licencias) {
        vmAntInfraccionesCtes = licencias;
    }

    private Collection<VmAntRestmed> vmAntRestmeds;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "DOCUMENTO", referencedColumnName = "DOCUMENTO", insertable = false, updatable = false)
    public Collection<VmAntRestmed> getVmAntRestmeds() {
        return vmAntRestmeds;
    }

    public void setVmAntRestmeds(Collection<VmAntRestmed> licencias) {
        vmAntRestmeds = licencias;
    }

    //Vehiculos

    private Collection<VmAntVehiculosCteEntity> vmAntVehiculos;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "IDENTIFICACION_PROPIETARIO", referencedColumnName = "DOCUMENTO", insertable = false, updatable = false)
    public Collection<VmAntVehiculosCteEntity> getVmAntVehiculos() {
        return vmAntVehiculos;
    }

    public void setVmAntVehiculos(Collection<VmAntVehiculosCteEntity> vmAntVehiculos) {
        this.vmAntVehiculos = vmAntVehiculos;
    }
}
