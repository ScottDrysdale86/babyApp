package com.codeclan.example.babyapp.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringGlobalConfig implements WebMvcConfigurer {

    public static final String CORS_BASE_PATTERN = "/**";
    public static final String ALLOWED_ORIGINS = "*";
    public static final String ALLOWED_HEADERS = "*";
    public static final String ALLOWED_METHODS = "*";


    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping(CORS_BASE_PATTERN)
                .allowedHeaders(ALLOWED_HEADERS)
                .allowedOrigins(ALLOWED_ORIGINS)
                .allowedMethods(ALLOWED_METHODS);
    }



}
