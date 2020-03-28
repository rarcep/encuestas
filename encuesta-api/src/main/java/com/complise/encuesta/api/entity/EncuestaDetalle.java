package com.complise.encuesta.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "encuesta_detalles")
public class EncuestaDetalle implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "encuesta_id")
	private int encuestaId;
	private int seccion;
	@Column(name = "seccion_nombre")
	private String seccionNombre;
	private String pregunta;
	@Column(name = "respuesta_opciones")
	private int respuestaOpciones;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEncuestaId() {
		return encuestaId;
	}

	public void setEncuestaId(int encuestaId) {
		this.encuestaId = encuestaId;
	}

	public int getSeccion() {
		return seccion;
	}

	public void setSeccion(int seccion) {
		this.seccion = seccion;
	}

	public String getSeccionNombre() {
		return seccionNombre;
	}

	public void setSeccionNombre(String seccionNombre) {
		this.seccionNombre = seccionNombre;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public int getRespuestaOpciones() {
		return respuestaOpciones;
	}

	public void setRespuestaOpciones(int respuestaOpciones) {
		this.respuestaOpciones = respuestaOpciones;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
