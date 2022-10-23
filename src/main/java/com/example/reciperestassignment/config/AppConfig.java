package com.example.reciperestassignment.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class AppConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();

    }

}
