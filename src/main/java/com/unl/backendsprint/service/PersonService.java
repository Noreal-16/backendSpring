package com.unl.backendsprint.service;

import com.unl.backendsprint.domain.Person;
import com.unl.backendsprint.domain.dto.PersonDto;

import java.util.List;

public interface PersonService {
    PersonDto getById(long id);
    /**
     * Obtener todas las personas existentes
     * @return lista personas
     */
    List<PersonDto> getAll();
    PersonDto create(PersonDto data);

    PersonDto update(long id, PersonDto data);
    long deleteById(long id);
}
