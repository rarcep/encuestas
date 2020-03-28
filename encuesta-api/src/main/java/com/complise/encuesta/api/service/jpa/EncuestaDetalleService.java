package com.complise.encuesta.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.complise.encuesta.api.entity.EncuestaDetalle;
import com.complise.encuesta.api.repository.EncuestaDetalleRepository;
import com.complise.encuesta.api.service.IEncuestaDetalleService;

@Service
public class EncuestaDetalleService implements IEncuestaDetalleService {
	
	@Autowired
	private EncuestaDetalleRepository encuestaDetalleRepository;
 
	@Override
	public void guardarEcuestaDetalle(EncuestaDetalle encuestaDetalle) {
		encuestaDetalleRepository.save(encuestaDetalle);
	}

	@Override
	public List<EncuestaDetalle> buscarPorEcuestaId(int encuestaId) {
		return encuestaDetalleRepository.findAllByEncuestaId(encuestaId);
	}

	@Override
	public List<EncuestaDetalle> buscarPorSeccion(int seccion) {
		return encuestaDetalleRepository.findAllBySeccion(seccion);
	}

}
