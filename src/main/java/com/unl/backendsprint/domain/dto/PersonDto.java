package com.unl.backendsprint.domain.dto;

import lombok.Data;

import javax.persistence.*;

@Data
public class PersonDto {
    private Long id;
    private String dni;
    private String name;
    private String lastname;
}
