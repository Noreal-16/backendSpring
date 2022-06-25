package com.unl.backendsprint.domain.dto;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
public class PersonDto {
    private Long id;

    @NotEmpty(message = "El campo DNI no puede ser nulo ni vacio")
    private String dni;
    @NotEmpty(message = "El campo Nombre no puede ser nulo ni vacio")
    private String name;
    @NotEmpty(message = "El Campo Apellido no puede ser nulo ni vacio")
    private String lastname;
}
