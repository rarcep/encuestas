package com.complise.encuesta.api.service;

import java.util.List;

import com.complise.encuesta.api.entity.EncuestaDetalle;

public interface IEncuestaDetalleService {
	
	void guardarEcuestaDetalle(EncuestaDetalle encuestaDetalle);
	
	List<EncuestaDetalle> buscarPorEcuestaId(int encuestaId);
	List<EncuestaDetalle> buscarPorSeccion(int seccion);

}
