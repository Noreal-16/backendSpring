package com.unl.backendsprint.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportDto {
    public ReportDto(Object[] objects){
        this.personDni = (String) objects[0];
        this.personFullName = (String) objects[1];
        this.date = (Date) objects[2];
        this.dose = (Integer) objects[3];
        this.vaccinName = (String) objects[4];
        this.vaccinLot = (String) objects[5];
    }
    private String personDni;
    private String personFullName;
    private Date date;
    private Integer dose;
    private String vaccinName;
    private String vaccinLot;
}
