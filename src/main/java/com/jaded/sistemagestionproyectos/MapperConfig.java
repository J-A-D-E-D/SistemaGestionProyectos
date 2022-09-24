package com.jaded.sistemagestionproyectos;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
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
        ModelMapper model =new ModelMapper();
        model.getConfiguration().setAmbiguityIgnored(true);
        return model;

    }
    @Bean("perfilMapper")
    public ModelMapper perfilMapper(){
        return new ModelMapper();

    }

    @Bean ("movDineroMapper")
    public  ModelMapper empresaControllerMapper(){
        return new ModelMapper();
    }
}
