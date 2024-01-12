package com.spring.security.config;

import lombok.NonNull;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(@NonNull CorsRegistry registry) {
        registry.addMapping("/**")  // rutas publicas
                .allowedOrigins("http://localhost:4200") // url del frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS")
                .allowedHeaders("Origin", "Content-Type", "Accept", "Authorization")
                .allowCredentials(true)
                .maxAge(3600);

        registry.addMapping("/auth/**")  // rutas publicas
                .allowedOrigins("http://localhost:4200") // url del frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS")
                .allowedHeaders("Origin", "Content-Type", "Accept", "Authorization")
                .allowCredentials(false)
                .maxAge(3600);
    }
}
