package com.jaded.sistemagestionproyectos.controller;
import com.jaded.sistemagestionproyectos.dto.empresaDTO;
import com.jaded.sistemagestionproyectos.exception.modelNotFoundException;
import com.jaded.sistemagestionproyectos.model.empresa;
import com.jaded.sistemagestionproyectos.service.IempresaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/enterprise")
public class empresaRestController {

    @Autowired
    private IempresaService service;

    @Autowired
    @Qualifier("empresaMapper")
    private ModelMapper mapper;

   @GetMapping("/verempresas")
    public String verempresas (Model model) throws Exception {
        model.addAttribute("listaEmpresas",service.readAll());
        return "empresas.html";
    }

    @GetMapping("{id}")
    public ResponseEntity<empresaDTO> readByID(@PathVariable(name = "id") Integer id) throws Exception{
        empresa e = service.readById(id);
        if (e == null){
            throw new modelNotFoundException("Id no encontrado");
        }
        empresaDTO dto = mapper.map(e, empresaDTO.class);
        return new ResponseEntity<>(dto ,HttpStatus.OK);

    }

    @GetMapping
    public ResponseEntity<List<empresaDTO>> readAll() throws Exception{
        List<empresaDTO> list = service.readAll().stream()
                .map(p -> mapper.map(p, empresaDTO.class))
                .collect(Collectors.toList());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<empresaDTO> create (@Valid @RequestBody empresaDTO empresadto) throws Exception{
        empresa e = service.create(mapper.map(empresadto, empresa.class));
        empresaDTO dto = mapper.map(e, empresaDTO.class);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<empresaDTO> updatePartially ( @PathVariable(value ="id") Integer id , @Valid @RequestBody empresaDTO empresadto) throws Exception {
        empresa e = service.readById(id);
        if (e == null){
            throw new modelNotFoundException("Id #"+empresadto.getIdEmpresa() + " no encontrado");
        }
        empresa em =service.update(mapper.map(empresadto, empresa.class));
        em.setNitEmpresa(em.getNitEmpresa());
        em.setDireccionEmpresa(em.getDireccionEmpresa());
        em.setNombreEmpresa(em.getNombreEmpresa());
        em.setTelefonoEmpresa(em.getTelefonoEmpresa());
        final empresa updateempresa = service.create(e);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) throws Exception{
        empresa e = service.readById(id);
        if(e == null){
            throw new modelNotFoundException("Id no encontrado: " + id);
        }
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
