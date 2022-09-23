package com.jaded.sistemagestionproyectos.service;

import com.jaded.sistemagestionproyectos.model.empresa;

import java.util.List;

public interface IEmpresa {

    List<empresa> mostrarEmpresas();
    void guardarEmpresa(empresa emp);
    empresa mostrarEmpresaPorID(Integer id);
    void borrarEmpresa(Integer id);
}
