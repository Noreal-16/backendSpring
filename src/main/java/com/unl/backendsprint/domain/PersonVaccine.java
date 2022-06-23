package com.unl.backendsprint.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@Entity(name = "personvaccine")
public class PersonVaccine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_idPersonVaccine", nullable = false, unique = true)
    private Long id;

    private Long vacineId;
    private Long personId;
    private Date date;
    private Integer dose;
}
