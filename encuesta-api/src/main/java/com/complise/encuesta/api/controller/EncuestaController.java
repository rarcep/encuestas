package com.complise.encuesta.api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.complise.encuesta.api.entity.Encuesta;
import com.complise.encuesta.api.entity.EncuestaDetalle;
import com.complise.encuesta.api.entity.EncuestaResultado;
import com.complise.encuesta.api.repository.EncuestaDetalleRepository;
import com.complise.encuesta.api.repository.EncuestaRepository;
import com.complise.encuesta.api.repository.EncuestaResultadoRepository;
import com.complise.encuesta.api.service.IEncuestaDetalleService;
import com.complise.encuesta.api.service.IEncuestaResultadoService;
import com.complise.encuesta.api.service.IEncuestaService;
import com.complise.encuesta.api.util.JsonError;

@RestController
@RequestMapping("/encuesta")
public class EncuestaController {
	
	private final static Logger logger = LoggerFactory.getLogger(EncuestaController.class);

	@Autowired
	private IEncuestaService encuestaService;
	@Autowired
	private IEncuestaDetalleService encuestaDetalleService;
	@Autowired
	private IEncuestaResultadoService encuestaResultadoService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveEncuesta(@RequestBody Encuesta encuesta) {
		logger.info("Guardar encuesta!! ");
		return new ResponseEntity<Encuesta>(encuestaService.guardarEncuesta(encuesta), HttpStatus.CREATED);
	}
	
	@GetMapping
	@RequestMapping("/preguntas")
	public ResponseEntity<?> getEncuestaDetalleByEncuestaId(@RequestParam() int encuestaId) {
		logger.info("Obtener usuarios por encuestaId :: " + encuestaId + "");
		List<EncuestaDetalle> encuestaDetalles = encuestaDetalleService.buscarPorEcuestaId(encuestaId);

		if (!encuestaDetalles.isEmpty()) {
		    return new ResponseEntity<List<EncuestaDetalle>>(encuestaDetalles, HttpStatus.OK);
		}

		return new ResponseEntity<JsonError>(new JsonError(HttpStatus.NO_CONTENT.value(), "no existen registros"),
			HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping
	@RequestMapping("/resultado/{usuario}")
	public ResponseEntity<?> getResultadoPorUsuario(@PathVariable(required = true) String usuario) {
		logger.info("Obtener resulatdos por usuario :: " + usuario);
		List<EncuestaResultado> encuestaResultado = encuestaResultadoService.buscarTodosPorUsuario(usuario);

		if (!encuestaResultado.isEmpty())
			return new ResponseEntity<List<EncuestaResultado>>(encuestaResultado, HttpStatus.OK);

		return new ResponseEntity<JsonError>(new JsonError(HttpStatus.NO_CONTENT.value(), "no existen registros"),
			HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping
	@RequestMapping("/usuario")
	public ResponseEntity<?> getBuscarUsuario(@RequestParam() String usuario) {
		logger.info("Obtener resulatdos por usuario :: " + usuario);
		EncuestaResultado encuestaResultado = encuestaResultadoService.buscarPorUsuario(usuario);

		if (encuestaResultado != null)
			return new ResponseEntity<EncuestaResultado>(encuestaResultado, HttpStatus.OK);

		return new ResponseEntity<JsonError>(new JsonError(HttpStatus.NO_CONTENT.value(), "El usuario no existe"),
			HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping
	@RequestMapping("/resultado")
	public ResponseEntity<?> getAllResultado() {
		logger.info("Obtener todos los resultados!!");
		List<EncuestaResultado> encuestaResultado = encuestaResultadoService.buscarTodos();

		if (!encuestaResultado.isEmpty())
			return new ResponseEntity<List<EncuestaResultado>>(encuestaResultado, HttpStatus.OK);

		return new ResponseEntity<JsonError>(new JsonError(HttpStatus.NO_CONTENT.value(), "no existen registros"),
			HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping("/resultado/save")
	public ResponseEntity<?> saveEncuestaResultado(@RequestBody EncuestaResultado encuestaResultado) {
		logger.info("Guardar encuesta!! ");
		return new ResponseEntity<EncuestaResultado>(encuestaResultadoService.guardarEncuestaResultado(encuestaResultado), HttpStatus.CREATED);
	}
}
