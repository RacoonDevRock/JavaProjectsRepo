package com.interceptor.springbootinterceptor.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

@Configuration
public class AppConfig implements WebMvcConfigurer {

    @Qualifier("loadingTimeInterceptor")
    private final HandlerInterceptor handlerInterceptor;

    @Autowired
    public AppConfig(HandlerInterceptor handlerInterceptor) {
        this.handlerInterceptor = handlerInterceptor;
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(handlerInterceptor)
                .addPathPatterns("/api/time")
                .excludePathPatterns("/api/interceptor");
    }
}