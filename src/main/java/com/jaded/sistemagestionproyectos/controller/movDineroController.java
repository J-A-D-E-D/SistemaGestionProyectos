package com.jaded.sistemagestionproyectos.controller;

import com.jaded.sistemagestionproyectos.model.movimientoDinero;
import com.jaded.sistemagestionproyectos.service.ImovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class movDineroController {
    @Autowired
    private ImovimientoDineroService service;

    @GetMapping("/Transaccion")
    public String tablaMovDinero (Model model) throws Exception {
        model.addAttribute("listaMovDinero",service.readAll());
        return "movimientoDinero";
    }

    @GetMapping("/formularioMovDinero")
    public String formularioMovDinero (Model model){
        movimientoDinero movimientoDinero = new movimientoDinero();
        model.addAttribute("movimientoDinero", movimientoDinero);
        return "movimientoDinero";
    }

    @PostMapping("/guardarMovDinero")
    public String guardarMovDinero (@ModelAttribute("movimientoDinero") movimientoDinero mov) throws Exception {
        service.create(mov);
        return "redirect:/movimientoDinero";

    }

    @GetMapping("/editarMovDinero/{id}")
    public String editarMovDinero(@PathVariable(value="id") Integer id, Model model) throws Exception {

        movimientoDinero mov= service.readById(id);

        model.addAttribute("movimientoDinero",mov);
        return "editarMovDinero";

    }

    @GetMapping("/borrarMovDinero/{id}")
    public String deleteTransaction(@PathVariable(value="id") Integer id) throws Exception {

        this.service.delete(id);
        return "redirect:/movimientoDinero";
    }
}
