package com.jaded.sistemagestionproyectos.service.implement;

import com.jaded.sistemagestionproyectos.model.movimientoDinero;
import com.jaded.sistemagestionproyectos.repository.Igeneric;
import com.jaded.sistemagestionproyectos.repository.ImovimientoDinero;
import com.jaded.sistemagestionproyectos.service.ImovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;

public class MovimientoDineroImpl extends crudImp<movimientoDinero, Integer> implements ImovimientoDineroService {
    @Autowired
    private ImovimientoDinero repo;

    @Override
    protected Igeneric<movimientoDinero, Integer> getRepo() {
        return repo;
    }
}
