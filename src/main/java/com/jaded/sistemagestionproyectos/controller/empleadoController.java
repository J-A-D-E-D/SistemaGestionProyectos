package com.jaded.sistemagestionproyectos.controller;

import com.jaded.sistemagestionproyectos.model.empleado;
import com.jaded.sistemagestionproyectos.model.empresa;
import com.jaded.sistemagestionproyectos.service.IempleadoService;
import com.jaded.sistemagestionproyectos.service.IempresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class empleadoController {
    @Autowired
    private IempleadoService service;

    @GetMapping("/empleado")
    public String tablaEmpleado (Model model) throws Exception {
        model.addAttribute("listaEmpleado",service.readAll());
        return "empleados";
    }

    @GetMapping("/formularioEmpleados")
    public String formularioEmpleados (Model model){
        empleado empleado = new empleado();
        model.addAttribute("empleado", empleado);
        return "nuevoEmpleado";
    }

    @PostMapping("/guardarEmpleado")
    public String guardarEmpleado (@ModelAttribute("empleado") empleado e) throws Exception {
        service.create(e);
        return "redirect:/empleado";

    }

    @GetMapping("/editarEmpleado/{id}")
    public String editarEmpleado(@PathVariable(value="id") Integer id, Model model) throws Exception {

        empleado emp = service.readById(id);

        model.addAttribute("empleado", emp);
        return "editarEmpleado";

    }

    @GetMapping("/borrarEmpleado/{id}")
    public String deleteEmployee(@PathVariable(value="id") Integer id) throws Exception {

        this.service.delete(id);
        return "redirect:/empleado";
    }
}
