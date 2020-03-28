package com.complise.encuesta.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@SpringBootApplication
//public class EncuestaApiApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(EncuestaApiApplication.class, args);
//	}
//
//}


@SpringBootApplication
public class EncuestaApiApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(EncuestaApiApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	    return builder.sources(EncuestaApiApplication.class);
	}
}
