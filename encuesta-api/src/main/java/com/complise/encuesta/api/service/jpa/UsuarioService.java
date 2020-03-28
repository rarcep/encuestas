package com.complise.encuesta.api.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.complise.encuesta.api.entity.Usuario;
import com.complise.encuesta.api.repository.UsuarioRepository;
import com.complise.encuesta.api.service.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public void guardarUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	@Override
	public Usuario buscarUsuario(String username) {
		return usuarioRepository.findByUsuario(username);
	}

}
