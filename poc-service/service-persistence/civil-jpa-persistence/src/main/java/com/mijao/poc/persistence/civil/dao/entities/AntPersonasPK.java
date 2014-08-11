package com.mijao.poc.persistence.civil.dao.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Embeddable;

@Embeddable
public class AntPersonasPK implements Serializable {

    private String nombre1;

    private String nombre2;

    private String apellido1;

    private String apellido2;

    private String tipo;

    private String documento;

    private String direccion;

    private String numero;

    private String tsangre;

    private Timestamp fechanac;

    private String sexo;

    private Timestamp fechadef;

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Timestamp getFechadef() {
        return fechadef;
    }

    public void setFechadef(Timestamp fechadef) {
        this.fechadef = fechadef;
    }

    public Timestamp getFechanac() {
        return fechanac;
    }

    public void setFechanac(Timestamp fechanac) {
        this.fechanac = fechanac;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTsangre() {
        return tsangre;
    }

    public void setTsangre(String tsangre) {
        this.tsangre = tsangre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AntPersonasPK)) {
            return false;
        }

        AntPersonasPK that = (AntPersonasPK) o;

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
}
