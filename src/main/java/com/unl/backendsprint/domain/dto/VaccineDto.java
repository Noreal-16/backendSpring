package com.unl.backendsprint.domain.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
public class VaccineDto {
    private Long id;
    @NotEmpty(message = "Este campo no puede ser nulo ni vacio")
    private String name;
    @NotEmpty(message = "Este campo no puede ser nulo ni vacio")
    private String lot;
}
