package com.complise.encuesta.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.complise.encuesta.api.entity.Respuesta;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Integer> {

	public Respuesta findById(int id);

	public Respuesta findByUsuario(String usuario);

	public List<Respuesta> findAllByUsuario(String usuario);

	public List<Respuesta> findAll();

}
