package com.jaded.sistemagestionproyectos.controller;
import com.jaded.sistemagestionproyectos.dto.empresaDTO;
import com.jaded.sistemagestionproyectos.model.empresa;
import com.jaded.sistemagestionproyectos.service.IempresaService;
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
@RequestMapping("/empresa")
public class empresaController {

    @Autowired
    private IempresaService service;

    @Autowired
    @Qualifier("empresaMapper")
    private ModelMapper mapper;

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

}
