package com.mijao.poc.persistence.civil.dao.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@javax.persistence.Table(name = "", schema = "", catalog = "")
@Entity
public class SarcActa implements Serializable {

	@Id
	private int id;
    
    private String number;
    private String tipo;
    private String fechaRegistro;
    
    
    
    
}
