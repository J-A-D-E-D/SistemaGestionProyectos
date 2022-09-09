package com.jaded.sistemagestionproyectos.service.implement;

import com.jaded.sistemagestionproyectos.model.empleado;
import com.jaded.sistemagestionproyectos.repository.Iempleado;
import com.jaded.sistemagestionproyectos.repository.Igeneric;
import com.jaded.sistemagestionproyectos.service.IempleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class empleadoServiceImpl extends crudImp<empleado, Integer> implements IempleadoService {

    @Autowired
    private Iempleado repo;

    @Override
    protected Igeneric<empleado, Integer> getRepo(){ return repo;}

}





