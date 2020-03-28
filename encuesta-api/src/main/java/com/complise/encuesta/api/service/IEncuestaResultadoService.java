package com.complise.encuesta.api.service;

import java.util.List;

import com.complise.encuesta.api.entity.EncuestaResultado;

public interface IEncuestaResultadoService {
	
	EncuestaResultado guardarEncuestaResultado(EncuestaResultado encuestaResultado);
	
	EncuestaResultado buscarPorUsuario(String usuario);
	List<EncuestaResultado> buscarTodosPorEncuestaId(int encuestaId);
	List<EncuestaResultado> buscarTodosPorUsuario(String usuario);
	List<EncuestaResultado> buscarTodos();

}
