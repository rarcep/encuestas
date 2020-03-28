package com.complise.encuesta.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String usuario;
	@Column(name = "encuesta_estatus")
	private String encuestaEstatus;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getEncuestaEstatus() {
		return encuestaEstatus;
	}
	public void setEncuestaEstatus(String encuestaEstatus) {
		this.encuestaEstatus = encuestaEstatus;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

}
