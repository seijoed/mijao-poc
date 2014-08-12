package com.mijao.poc.persistence.civil.dao.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@javax.persistence.Table(name = "C003T_CASO", schema = "PORTAL", catalog = "")
@Entity

@XmlRootElement(name = "SarcCaso")
public class SarcCasoEntity implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -1528422148825080465L;

    @Id
    private int id_caso;

    @javax.persistence.Column(name = "TX_ASUNTO")
    private String tx_asunto;

    @javax.persistence.Column(name = "FE_CASO")
    private String fe_caso;

    @javax.persistence.Column(name = "TX_DESCRIPCION")
    private String tx_descripcion;

    public SarcCasoEntity() {
        super();
    }

    public SarcCasoEntity(int id_caso, String tx_asunto, String fe_caso, String tx_descripcion) {
        super();
        this.id_caso = id_caso;
        this.tx_asunto = tx_asunto;
        this.fe_caso = fe_caso;
        this.tx_descripcion = tx_descripcion;
    }

    public int getId_caso() {
        return id_caso;
    }

    public void setId_caso(int id_caso) {
        this.id_caso = id_caso;
    }

    public String getTx_asunto() {
        return tx_asunto;
    }

    public void setTx_asunto(String tx_asunto) {
        this.tx_asunto = tx_asunto;
    }

    public String getFe_caso() {
        return fe_caso;
    }

    public void setFe_caso(String fe_caso) {
        this.fe_caso = fe_caso;
    }

    public String getTx_descripcion() {
        return tx_descripcion;
    }

    public void setTx_descripcion(String tx_descripcion) {
        this.tx_descripcion = tx_descripcion;
    }

    @Override
    public String toString() {
        return "SarcCasoEntity [id_caso=" + id_caso + ", tx_asunto=" + tx_asunto + ", fe_caso=" + fe_caso + ", tx_descripcion=" + tx_descripcion
            + "]";
    }
}
