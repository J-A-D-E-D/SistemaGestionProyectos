package com.jaded.sistemagestionproyectos.controller;
import com.jaded.sistemagestionproyectos.service.implement.empresaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class empresaController {
    @Autowired
    private empresaImpl service;

    /*@Autowired
    @Qualifier("empresaControllerMapper")
    private ModelMapper mapper;
*/
    @GetMapping("/empresa")
    public String tablaEmpresas (Model model) {
       //model.addAttribute("listaEmpresas",service.mostrarEmpresas());
        return "0hola";
    }
}
