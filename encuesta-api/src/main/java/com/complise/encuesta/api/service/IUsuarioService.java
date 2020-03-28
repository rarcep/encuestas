package com.complise.encuesta.api.service;

import com.complise.encuesta.api.entity.Usuario;

public interface IUsuarioService {

	void guardarUsuario(Usuario usuario);
	Usuario buscarUsuario(String username);
}
