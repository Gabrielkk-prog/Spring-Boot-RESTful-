package com.Joao_Dev.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public String appMessage() {
        return "Hello, World!";
    }
}
