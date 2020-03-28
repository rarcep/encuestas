package com.complise.encuesta.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "encuesta_resultados")
public class EncuestaResultado implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	@Column(name = "encuesta_id")
	private int encuestaId;
	private String usuario;
	@Column(name = "pregunta_id")
	private int preguntaId;
	private String respuesta;
	private String fecha;

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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getPreguntaId() {
		return preguntaId;
	}

	public void setPreguntaId(int preguntaId) {
		this.preguntaId = preguntaId;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
