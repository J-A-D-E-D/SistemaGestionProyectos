package com.jaded.sistemagestionproyectos.service.implement;

import com.jaded.sistemagestionproyectos.model.perfil;
import com.jaded.sistemagestionproyectos.repository.Igeneric;
import com.jaded.sistemagestionproyectos.repository.IperfilRepo;
import com.jaded.sistemagestionproyectos.service.IperfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilServiceImpl extends crudImp<perfil, Integer> implements IperfilService {
    @Autowired
    private IperfilRepo repo;
    @Override
    protected Igeneric<perfil, Integer> getRepo() {
        return repo;
    }
}
