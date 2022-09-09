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
    @Bean("empleadoMapper")
    public ModelMapper empleadoMapper(){
        return new ModelMapper();
    }
    @Bean("perfilMapper")
    public ModelMapper perfilMapper(){
        return new ModelMapper();
    }
}
