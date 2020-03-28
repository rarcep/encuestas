package com.complise.encuesta.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.complise.encuesta.api.entity.Encuesta;

@Repository
public interface EncuestaRepository extends JpaRepository<Encuesta, Integer> {
	
	public Encuesta findByEncuestaNombre(String nombre);

}
