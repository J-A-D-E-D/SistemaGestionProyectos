package com.jaded.sistemagestionproyectos.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

public class globalErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<errorDTO> handleExceptions(Exception ex, WebRequest request){
        errorDTO dto = new errorDTO(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(dto , HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(modelNotFoundException.class)
    public ResponseEntity<errorDTO> handleModelNotFound(modelNotFoundException ex,  WebRequest request ){
        errorDTO dto = new errorDTO(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
    }

}
