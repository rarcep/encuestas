package com.complise.encuesta.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.complise.encuesta.api.entity.EncuestaDetalle;

@Repository
public interface EncuestaDetalleRepository extends JpaRepository<EncuestaDetalle, Integer> {

	public List<EncuestaDetalle> findAllByEncuestaId(int encuestaId);
	public List<EncuestaDetalle> findAllBySeccion(int seccion);
}
