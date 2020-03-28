package com.complise.encuesta.api.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;




@Configuration
public class SecurityConfig {
    
    @SuppressWarnings("deprecation")
	@Bean
    CorsConfigurationSource corsConfigurationSource()
    {
        CorsConfiguration configuration = new CorsConfiguration();
       
        configuration.setAllowedOrigins(Arrays.asList("http://0.0.0.0:8084"));
        configuration.setAllowedMethods(Arrays.asList("GET","POST","PUT","DELETE"));
        configuration.setAllowedHeaders(Arrays.asList("X-Auth-Token", "Content-Type"));
        configuration.setAllowCredentials(true);
        configuration.setMaxAge(new Long(4800));
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/encuesta2kAPI/**", configuration);
        return source;
    }

}
