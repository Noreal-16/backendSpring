package com.unl.backendsprint.domain.dto;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
public class PersonVaccineDto {
    private Long id;
    private Long vacineId;
    private Long personId;
    @NotEmpty(message = "Este campo no puede ser nulo ni vacio")
    private Date date;
    @NotEmpty(message = "Este campo no puede ser nulo ni vacio")
    private Integer dose;
}
