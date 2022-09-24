package com.jaded.sistemagestionproyectos.controller;
import com.jaded.sistemagestionproyectos.model.empresa;
import com.jaded.sistemagestionproyectos.service.IempleadoService;
import com.jaded.sistemagestionproyectos.service.IempresaService;
import com.jaded.sistemagestionproyectos.service.implement.empresaImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/formularioEmpresas")
    public String formularioEmpresas (Model model){
        empresa empresa = new empresa();
        model.addAttribute("empresa", empresa);
        return "nuevaEmpresa";
    }

    @PostMapping("/guardarEmpresa")
    public String guardarEmpresa (@ModelAttribute ("empresa") empresa e) throws Exception {
        service.create(e);
        return "redirect:/empresa";

    }

    @GetMapping("/editarEmpresa/{id}")
    public String editarEmpresa(@PathVariable(value="id") Integer id, Model model) throws Exception {

        empresa emp = service.readById(id);

        model.addAttribute("empresa", emp);
        return "editarEmpresa";

    }

    @GetMapping("/borrarEmpresa/{id}")
    public String deleteEmployee(@PathVariable(value="id") Integer id) throws Exception {

        this.service.delete(id);
        return "redirect:/empresa";
    }
}
