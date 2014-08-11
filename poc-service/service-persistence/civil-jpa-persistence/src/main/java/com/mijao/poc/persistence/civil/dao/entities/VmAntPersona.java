package com.mijao.poc.persistence.civil.dao.entities;

import java.sql.Timestamp;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@javax.persistence.Table(name = "VM_ANT_PERSONA", schema = "REPDIN", catalog = "")
@Entity

public class VmAntPersona {

    private AntPersonasPK antPersonasPK;

    @Id
    public AntPersonasPK getAntPersonasPK() {
        return antPersonasPK;
    }

    public void setAntPersonasPK(AntPersonasPK antPersonasPK) {
        this.antPersonasPK = antPersonasPK;
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

    private String tsangre;

    @javax.persistence.Column(name = "TSANGRE")

    public String getTsangre() {
        return tsangre;
    }

    public void setTsangre(String tsangre) {
        this.tsangre = tsangre;
    }

    private Timestamp fechanac;

    @javax.persistence.Column(name = "FECHANAC")

    public Timestamp getFechanac() {
        return fechanac;
    }

    public void setFechanac(Timestamp fechanac) {
        this.fechanac = fechanac;
    }

    private String sexo;

    @javax.persistence.Column(name = "SEXO")

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    private Timestamp fechadef;

    @javax.persistence.Column(name = "FECHADEF")

    public Timestamp getFechadef() {
        return fechadef;
    }

    public void setFechadef(Timestamp fechadef) {
        this.fechadef = fechadef;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        VmAntPersona that = (VmAntPersona) o;

        if (apellido1 != null ? !apellido1.equals(that.apellido1) : that.apellido1 != null) {
            return false;
        }
        if (apellido2 != null ? !apellido2.equals(that.apellido2) : that.apellido2 != null) {
            return false;
        }
        if (direccion != null ? !direccion.equals(that.direccion) : that.direccion != null) {
            return false;
        }
        if (documento != null ? !documento.equals(that.documento) : that.documento != null) {
            return false;
        }
        if (fechadef != null ? !fechadef.equals(that.fechadef) : that.fechadef != null) {
            return false;
        }
        if (fechanac != null ? !fechanac.equals(that.fechanac) : that.fechanac != null) {
            return false;
        }
        if (nombre1 != null ? !nombre1.equals(that.nombre1) : that.nombre1 != null) {
            return false;
        }
        if (nombre2 != null ? !nombre2.equals(that.nombre2) : that.nombre2 != null) {
            return false;
        }
        if (numero != null ? !numero.equals(that.numero) : that.numero != null) {
            return false;
        }
        if (sexo != null ? !sexo.equals(that.sexo) : that.sexo != null) {
            return false;
        }
        if (tipo != null ? !tipo.equals(that.tipo) : that.tipo != null) {
            return false;
        }
        if (tsangre != null ? !tsangre.equals(that.tsangre) : that.tsangre != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = nombre1 != null ? nombre1.hashCode() : 0;
        result = 31 * result + (nombre2 != null ? nombre2.hashCode() : 0);
        result = 31 * result + (apellido1 != null ? apellido1.hashCode() : 0);
        result = 31 * result + (apellido2 != null ? apellido2.hashCode() : 0);
        result = 31 * result + (tipo != null ? tipo.hashCode() : 0);
        result = 31 * result + (documento != null ? documento.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (numero != null ? numero.hashCode() : 0);
        result = 31 * result + (tsangre != null ? tsangre.hashCode() : 0);
        result = 31 * result + (fechanac != null ? fechanac.hashCode() : 0);
        result = 31 * result + (sexo != null ? sexo.hashCode() : 0);
        result = 31 * result + (fechadef != null ? fechadef.hashCode() : 0);
        return result;
    }

    //Lists of actions

    private Collection<VmAntLicencia> vmAntLicencias;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "NROLICEN", referencedColumnName = "DOCUMENTO", insertable = false, updatable = false)
    public Collection<VmAntLicencia> getVmAntLicencias() {
        return vmAntLicencias;
    }

    public void setVmAntLicencias(Collection<VmAntLicencia> vmAntLicencias) {
        this.vmAntLicencias = vmAntLicencias;
    }

    private Collection<VmAntMovLicencia> vmAntMovLicencias;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "NROLICEN", referencedColumnName = "DOCUMENTO", insertable = false, updatable = false)
    public Collection<VmAntMovLicencia> getVmAntMovLicencias() {
        return vmAntMovLicencias;
    }

    public void setVmAntMovLicencias(Collection<VmAntMovLicencia> licencias) {
        vmAntMovLicencias = licencias;
    }

    private Collection<VmAntBloLicencia> vmAntBloLicencias;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "NROLICEN", referencedColumnName = "DOCUMENTO", insertable = false, updatable = false)
    public Collection<VmAntBloLicencia> getVmAntBloLicencias() {
        return vmAntBloLicencias;
    }

    public void setVmAntBloLicencias(Collection<VmAntBloLicencia> licencias) {
        vmAntBloLicencias = licencias;
    }

    private Collection<VmAntInfraccion> vmAntInfraccions;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "LICENCIA", referencedColumnName = "DOCUMENTO", insertable = false, updatable = false)
    public Collection<VmAntInfraccion> getVmAntInfraccions() {
        return vmAntInfraccions;
    }

    public void setVmAntInfraccions(Collection<VmAntInfraccion> licencias) {
        vmAntInfraccions = licencias;
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

    private Collection<VmAntVehiculoEntity> vmAntVehiculos;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "IDENTIFICACION", referencedColumnName = "DOCUMENTO", insertable = false, updatable = false)
    public Collection<VmAntVehiculoEntity> getVmAntVehiculos() {
        return vmAntVehiculos;
    }

    public void setVmAntVehiculos(Collection<VmAntVehiculoEntity> vmAntVehiculos) {
        this.vmAntVehiculos = vmAntVehiculos;
    }
}
