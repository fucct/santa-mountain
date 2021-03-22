package com.fucct.santamountain.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
public class WebFluxConfig implements WebFluxConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedMethods(HttpMethod.GET.name(), HttpMethod.OPTIONS.name(), HttpMethod.POST.name())
            .allowedOrigins("http://localhost:3000");
    }
}
