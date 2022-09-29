package com.jaded.sistemagestionproyectos.controller;

import com.jaded.sistemagestionproyectos.dto.empleadoDTO;
import com.jaded.sistemagestionproyectos.dto.movimientoDineroDTO;
import com.jaded.sistemagestionproyectos.exception.modelNotFoundException;
import com.jaded.sistemagestionproyectos.model.empleado;
import com.jaded.sistemagestionproyectos.model.movimientoDinero;
import com.jaded.sistemagestionproyectos.service.ImovimientoDineroService;
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
@RequestMapping("/transaction")

public class movimientoDineroRestController {
    @Autowired
    private ImovimientoDineroService service;

    @Autowired
    @Qualifier("movDineroMapper")
    private ModelMapper mapper;


    @GetMapping
    public ResponseEntity<List<movimientoDineroDTO>> readAll() throws Exception{
        List<movimientoDineroDTO> list = service.readAll().stream()
                .map(p -> mapper.map(p, movimientoDineroDTO.class))
                .collect(Collectors.toList());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<movimientoDineroDTO> create (@Valid @RequestBody movimientoDineroDTO movdinerodto) throws Exception{
        movimientoDinero m = service.create(mapper.map(movdinerodto, movimientoDinero.class));
        movimientoDineroDTO dto = mapper.map(m, movimientoDineroDTO.class);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }


    @PatchMapping("/{id}")
    public ResponseEntity<movimientoDineroDTO> updatePartially ( @PathVariable(value ="id") Integer id , @Valid @RequestBody movimientoDineroDTO movdinerodto) throws Exception {
        movimientoDinero m = service.readById(id);
        if (m == null) {
            throw new modelNotFoundException("Id #" + movdinerodto.getIdMovimientoDinero() + " no encontrado");
        }
        movimientoDinero md =service.update(mapper.map(movdinerodto, movimientoDinero.class));
        movimientoDineroDTO dto =mapper.map(md, movimientoDineroDTO.class);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) throws Exception{
        movimientoDinero m = service.readById(id);
        if(m == null){
            throw new modelNotFoundException("Id no encontrado: " + id);
        }
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
