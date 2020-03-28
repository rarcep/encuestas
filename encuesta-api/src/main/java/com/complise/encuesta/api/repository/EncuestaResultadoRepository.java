package com.complise.encuesta.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.complise.encuesta.api.entity.EncuestaResultado;

public interface EncuestaResultadoRepository extends JpaRepository<EncuestaResultado, Integer> {
	
	public EncuestaResultado findByUsuario(String usuario);
	public List<EncuestaResultado> findAllByEncuestaId(int encuestaId);
	public List<EncuestaResultado> findAllByUsuario(String usuario);

}
