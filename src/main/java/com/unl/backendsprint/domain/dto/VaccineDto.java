package com.unl.backendsprint.domain.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
public class VaccineDto {
    private Long id;
    private String name;
    private String lot;
}
