package com.jaded.sistemagestionproyectos.controller;

import com.jaded.sistemagestionproyectos.dto.empresaDTO;
import com.jaded.sistemagestionproyectos.dto.perfilDTO;
import com.jaded.sistemagestionproyectos.exception.modelNotFoundException;
import com.jaded.sistemagestionproyectos.model.empresa;
import com.jaded.sistemagestionproyectos.model.perfil;
import com.jaded.sistemagestionproyectos.service.IperfilService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class perfilController {
    @Autowired
    public IperfilService service;

    @Autowired
    @Qualifier("perfilMapper")
    private ModelMapper mapper;

    @GetMapping
    public ResponseEntity<List<perfilDTO>> readAll()throws Exception{
        List<perfilDTO> list = service.readAll().stream().
                map(p -> mapper.map(p, perfilDTO.class)).collect(Collectors.toList());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<perfilDTO> create (@Valid @RequestBody perfilDTO perfildto) throws Exception{
        perfil p = service.create(mapper.map(perfildto, perfil.class));
        perfilDTO dto = mapper.map(p, perfilDTO.class);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
    @PatchMapping("/{id}")
    public ResponseEntity<perfilDTO> updatePartially ( @PathVariable(value ="id") Integer id , @Valid @RequestBody perfilDTO perfildto) throws Exception {
        perfil p = service.readById(id);
        if (p == null){
            throw new modelNotFoundException("Id #"+perfildto.getIdPerfil() + " no encontrado");
        }
        perfil pe =service.update(mapper.map(perfildto, perfil.class));
        perfilDTO dto = mapper.map(pe, perfilDTO.class);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) throws Exception{
        perfil p = service.readById(id);
        if(p == null){
            throw new modelNotFoundException("Id no encontrado: " + id);
        }
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping("/{id}")
    public ResponseEntity<perfilDTO> readById(@PathVariable("id") Integer id) throws Exception {
        perfil p = service.readById(id);
        if (p == null) {
            throw new modelNotFoundException("Id no encontrado: " + id);
        }
        perfilDTO dto = mapper.map(p, perfilDTO.class);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
