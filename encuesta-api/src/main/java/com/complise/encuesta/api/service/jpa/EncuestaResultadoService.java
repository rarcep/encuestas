package com.complise.encuesta.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.complise.encuesta.api.entity.EncuestaResultado;
import com.complise.encuesta.api.repository.EncuestaResultadoRepository;
import com.complise.encuesta.api.service.IEncuestaResultadoService;

@Service
public class EncuestaResultadoService implements IEncuestaResultadoService {
	
	@Autowired
	private EncuestaResultadoRepository encuestaResultadoRepository;

	@Override
	public EncuestaResultado guardarEncuestaResultado(EncuestaResultado encuestaResultado) {
		return encuestaResultadoRepository.save(encuestaResultado);
	}

	@Override
	public List<EncuestaResultado> buscarTodosPorEncuestaId(int encuestaId) {
		return encuestaResultadoRepository.findAllByEncuestaId(encuestaId);
	}

	@Override
	public List<EncuestaResultado> buscarTodosPorUsuario(String usuario) {
		return encuestaResultadoRepository.findAllByUsuario(usuario);
	}

	@Override
	public List<EncuestaResultado> buscarTodos() {
		return encuestaResultadoRepository.findAll();
	}

	@Override
	public EncuestaResultado buscarPorUsuario(String usuario) {
		return encuestaResultadoRepository.findByUsuario(usuario);
	}

}
