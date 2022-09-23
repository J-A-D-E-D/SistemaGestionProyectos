package com.jaded.sistemagestionproyectos.controller;

import com.jaded.sistemagestionproyectos.dto.empleadoDTO;
import com.jaded.sistemagestionproyectos.exception.modelNotFoundException;
import com.jaded.sistemagestionproyectos.model.empleado;
import com.jaded.sistemagestionproyectos.service.IempleadoService;
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
@RequestMapping("/employee")
public class empleadoRestController {
    @Autowired
    private IempleadoService service;

    @Autowired
    @Qualifier("empleadoMapper")
    private ModelMapper mapper;






    @GetMapping
    public ResponseEntity<List<empleadoDTO>> readAll() throws Exception{
        List<empleadoDTO> list = service.readAll().stream()
                .map(p -> mapper.map(p, empleadoDTO.class))
                .collect(Collectors.toList());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<empleadoDTO> create (@Valid @RequestBody empleadoDTO empleadodto) throws Exception{
        empleado e = service.create(mapper.map(empleadodto, empleado.class));
        empleadoDTO dto = mapper.map(e, empleadoDTO.class);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
  /*  @PatchMapping("/{id}")
    public ResponseEntity<empleadoDTO> updatePartially ( @PathVariable(value ="id") Integer id , @Valid @RequestBody empleadoDTO empleadodto) throws Exception {
        empleado e= service.readById(id);
        if (e == null){
            throw new modelNotFoundException("Id #"+empleadodto.getIdEmpleado() + " no encontrado");
        }
        empleado em =service.update(mapper.map(empleadodto, empleado.class));
        empleadoDTO dto = mapper.map(em, empleadoDTO.class);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }*/
  @PatchMapping("/{id}")
    public ResponseEntity<empleadoDTO> updatePartially ( @PathVariable(value ="id") Integer id , @Valid @RequestBody empleadoDTO empleadodto) throws Exception {
      empleado e = service.readById(id);
      if (e == null) {
          throw new modelNotFoundException("Id #" + empleadodto.getIdEmpleado() + " no encontrado");
      }
      empleado em =service.update(mapper.map(empleadodto, empleado.class));
      em.setEmpresaEmpleado(em.getEmpresaEmpleado());
      em.setPerfilEmpleado(em.getPerfilEmpleado());
      em.setCorreoEmpleado(em.getCorreoEmpleado());
      final empleado updateempleado = service.create(e);
      return new ResponseEntity<>(HttpStatus.OK);
  }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) throws Exception{
        empleado e = service.readById(id);
        if(e == null){
            throw new modelNotFoundException("Id no encontrado: " + id);
        }
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}")
    public ResponseEntity<empleadoDTO> readById(@PathVariable("id") Integer id) throws Exception {
        empleado e = service.readById(id);
        if (e == null) {
            throw new modelNotFoundException("Id no encontrado: " + id);
        }
        empleadoDTO dto = mapper.map(e, empleadoDTO.class);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
