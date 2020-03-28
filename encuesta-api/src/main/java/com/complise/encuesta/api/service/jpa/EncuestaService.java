package com.complise.encuesta.api.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.complise.encuesta.api.entity.Encuesta;
import com.complise.encuesta.api.repository.EncuestaRepository;
import com.complise.encuesta.api.service.IEncuestaService;

@Service
public class EncuestaService implements IEncuestaService {
	
	@Autowired
	private EncuestaRepository encuestaRepository;

	@Override
	public Encuesta guardarEncuesta(Encuesta encuesta) {
		return encuestaRepository.save(encuesta);
	}

}
