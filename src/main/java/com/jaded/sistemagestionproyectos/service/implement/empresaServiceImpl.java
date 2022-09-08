package com.jaded.sistemagestionproyectos.service.implement;

import com.jaded.sistemagestionproyectos.model.empresa;
import com.jaded.sistemagestionproyectos.repository.Iempresa;
import com.jaded.sistemagestionproyectos.repository.Igeneric;
import com.jaded.sistemagestionproyectos.service.IempresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class empresaServiceImpl extends crudImp<empresa, Integer> implements IempresaService {

    @Autowired
    private Iempresa repo;
    @Override
    protected Igeneric<empresa, Integer> getRepo() {
        return repo;
    }
}
