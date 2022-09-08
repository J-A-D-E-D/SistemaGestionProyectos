package com.jaded.sistemagestionproyectos.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class errorDTO {
    private LocalDateTime datetime;
    private String message;
    private String path;
}
