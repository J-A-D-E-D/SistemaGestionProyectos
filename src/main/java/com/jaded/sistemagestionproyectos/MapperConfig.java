package com.jaded.sistemagestionproyectos;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
    @Bean("empresaMapper")
    public ModelMapper empresaMapper(){
        //ModelMapper mapper = new ModelMapper();
        return new ModelMapper();

    }

}
