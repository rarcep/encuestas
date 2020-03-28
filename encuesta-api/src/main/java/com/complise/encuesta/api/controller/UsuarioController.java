package com.complise.encuesta.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.complise.encuesta.api.entity.Usuario;
import com.complise.encuesta.api.repository.UsuarioRepository;
import com.complise.encuesta.api.util.JsonError;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/usuario")
public class UsuarioController {
	
	private final static Logger logger = LoggerFactory.getLogger(EncuestaController.class);

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveUsuario(@RequestBody Usuario usuario) {
		logger.info("Guardar usuario!! ");
		return new ResponseEntity<Usuario>(usuarioRepository.save(usuario), HttpStatus.CREATED);
	}
	
	@PostMapping()
	@RequestMapping("/login")
	public ResponseEntity<?> login(@RequestBody Usuario user) {
		logger.info("Obtener usuario por username :: " + user.getUsuario());
		Usuario usuario = usuarioRepository.findByUsuario(user.getUsuario());
		if (usuario != null) {
		    return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
		}
		return new ResponseEntity<JsonError>(new JsonError(HttpStatus.NO_CONTENT.value(), "usuario no encontrado.."),
			HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping()
	@RequestMapping("/buscar")
	public ResponseEntity<?> buscarPorUsuario(@RequestParam String celular) {
		logger.info("Obtener usuario por username :: " + celular);
		Usuario user = usuarioRepository.findByUsuario(celular);
		if (user != null) {
		    return new ResponseEntity<Usuario>(user, HttpStatus.OK);
		}
		return new ResponseEntity<JsonError>(new JsonError(HttpStatus.NO_CONTENT.value(), "usuario no encontrado.."),
			HttpStatus.BAD_REQUEST);
	}
}
