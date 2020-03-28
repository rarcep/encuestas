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
import org.springframework.web.bind.annotation.RestController;
	
import com.complise.encuesta.api.entity.Respuesta;
import com.complise.encuesta.api.service.IRespuestaService;
import com.complise.encuesta.api.util.JsonError;

@RestController
@RequestMapping("/respuesta")
public class RespuestaController {
	
	private final static Logger logger = LoggerFactory.getLogger(RespuestaController.class);

	@Autowired
	private IRespuestaService respuestaService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveRespuesta(@RequestBody Respuesta respuesta) {
		logger.info("Guardar respuesta!! ");
		return new ResponseEntity<Respuesta>(respuestaService.guardarRespuesta(respuesta), HttpStatus.CREATED);
	}
	
	@GetMapping
	@RequestMapping("/{usuario}")
	public ResponseEntity<?> getRespuestaPorUsuario(@PathVariable() String usuario) {
		logger.info("Obtener respuesta por usuario :: " + usuario + "");
		Respuesta respuesta = respuestaService.buscarRespuestaPorUsuario(usuario);

		if (respuesta != null) {
		    return new ResponseEntity<Respuesta>(respuesta, HttpStatus.OK);
		}

		return new ResponseEntity<JsonError>(new JsonError(HttpStatus.NO_CONTENT.value(), "no existen registros"),
			HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping
	@RequestMapping("/all")
	public ResponseEntity<?> getAllRespuestas() {
		logger.info("Obtener todas las respuestas ");
		List<Respuesta> repuestaList = respuestaService.buscarTodasRespuesta();

		if (!repuestaList.isEmpty())
			return new ResponseEntity<List<Respuesta>>(repuestaList, HttpStatus.OK);

		return new ResponseEntity<JsonError>(new JsonError(HttpStatus.NO_CONTENT.value(), "no existen registros"),
			HttpStatus.BAD_REQUEST);
	}
}
