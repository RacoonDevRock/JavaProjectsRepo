package com.guillermo.springbootwebcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:values.properties")	// En application properties podemos aplicar nuestras variables de entornos personalizadas,
												// pero además podemos crear nuestros propios archivo 'properties', para configurar el proyecto
												// por ello debemo agregar en la clase de arranque @PropertySource("classpath:nombre_archivo")
public class SpringbootWebCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebCourseApplication.class, args);
	}

}
