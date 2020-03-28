package com.complise.encuesta.api.service;

import java.util.List;

import com.complise.encuesta.api.entity.Respuesta;

public interface IRespuestaService {
	
	Respuesta guardarRespuesta(Respuesta respuesta);
	
	Respuesta buscarPorId(int id);
	Respuesta buscarRespuestaPorUsuario(String usuario);
	List<Respuesta> buscarTodasPorUsuario(String usuario);
	List<Respuesta> buscarTodasRespuesta();

}
