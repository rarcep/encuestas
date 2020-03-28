package com.complise.encuesta.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "encuestas")
public class Encuesta implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "encuesta_nombre")
	private String encuestaNombre;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEncuestaNombre() {
		return encuestaNombre;
	}

	public void setEncuestaNombre(String encuestaNombre) {
		this.encuestaNombre = encuestaNombre;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
