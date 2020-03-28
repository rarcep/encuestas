package com.complise.encuesta.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.complise.encuesta.api.entity.Respuesta;
import com.complise.encuesta.api.repository.RespuestaRepository;
import com.complise.encuesta.api.service.IRespuestaService;

@Service
public class RespuestaService implements IRespuestaService {

	@Autowired
	private RespuestaRepository respuestaRepository;

	@Override
	public Respuesta guardarRespuesta(Respuesta respuesta) {
		String celular = respuesta.getUsuario();
		List<Respuesta> res = buscarTodasPorUsuario(celular);
		if (res.size() > 0) {
			respuesta.setId(res.get(0).getId());
		}
		return respuestaRepository.saveAndFlush(respuesta);
	}

	@Override
	public Respuesta buscarPorId(int id) {
		return respuestaRepository.findById(id);
	}

	@Override
	public Respuesta buscarRespuestaPorUsuario(String usuario) {
		return respuestaRepository.findByUsuario(usuario);
	}

	@Override
	public List<Respuesta> buscarTodasRespuesta() {
		return respuestaRepository.findAll();
	}

	@Override
	public List<Respuesta> buscarTodasPorUsuario(String usuario) {
		return respuestaRepository.findAllByUsuario(usuario);
	}

}
