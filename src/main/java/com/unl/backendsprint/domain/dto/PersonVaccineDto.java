package com.unl.backendsprint.domain.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
public class PersonVaccineDto {
    private Long id;
    private Long vacineId;
    private Long personId;
    private Date date;
    private Integer dose;
}
