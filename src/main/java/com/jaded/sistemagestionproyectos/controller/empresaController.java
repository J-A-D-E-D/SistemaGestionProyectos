package com.jaded.sistemagestionproyectos.controller;
import com.jaded.sistemagestionproyectos.service.IempleadoService;
import com.jaded.sistemagestionproyectos.service.IempresaService;
import com.jaded.sistemagestionproyectos.service.implement.empresaImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class empresaController {
    @Autowired
    private IempresaService service;

    /*@Autowired
    @Qualifier("empresaControllerMapper")
    private ModelMapper mapper;*/

    @GetMapping("/empresa")
    public String tablaEmpresas (Model model) throws Exception {
       model.addAttribute("listaEmpresas",service.readAll());
        return "empresas";
    }
}
