package com.unl.backendsprint.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_idPerson", nullable = false, unique = true)
    private Long id;

    private String dni;
    private String name;
    private String lastname;
}
