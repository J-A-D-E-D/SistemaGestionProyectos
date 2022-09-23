package com.jaded.sistemagestionproyectos.service.implement;

import com.jaded.sistemagestionproyectos.model.empresa;
import com.jaded.sistemagestionproyectos.repository.IempresaRepo;
import com.jaded.sistemagestionproyectos.repository.IempresaRepoC;
import com.jaded.sistemagestionproyectos.service.IEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class empresaImpl implements IEmpresa {
    @Autowired
    private IempresaRepoC empresaRepo;

    @Override
    public List<empresa> mostrarEmpresas() {
        return empresaRepo.findAll();
    }

    @Override
    public void guardarEmpresa(empresa emp) {
        this.empresaRepo.save(emp);
    }

    @Override
    public empresa mostrarEmpresaPorID(Integer id) {
        Optional<empresa> optional = empresaRepo.findById(id);
        empresa em=null;
        if (optional.isPresent()){
            em = optional.get();
        }else {
            throw  new RuntimeException("La empresa con ID "+ id +"no existe.");
        }

        return em;
    }

    @Override
    public void borrarEmpresa(Integer id) {
        this.empresaRepo.deleteById(id);
    }
}
