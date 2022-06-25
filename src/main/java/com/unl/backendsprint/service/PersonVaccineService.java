package com.unl.backendsprint.service;

import com.unl.backendsprint.domain.dto.PersonVaccineDto;

import java.util.List;

/**
 * CRUD Persona Vacuna
 */
public interface PersonVaccineService {
    /**
     * Obtener un registro de  Persona Vacuna por id
     * @param id de registro que se va a buscar
     * @return persona encontrada
     */
    PersonVaccineDto getById(long id);

    /**
     * Busca todas las Persona Vacunas
     * @return lista de Personas Vacunas
     */
    List<PersonVaccineDto> getAll();

    /**
     * Crear nuevo registro de Persona Vacuna
     * @param data objeto que contiene la informacion de Persona vacuna
     * @return Persona Vacuna Creada
     */
    PersonVaccineDto create(PersonVaccineDto data);
    /**
     * Actualiza registro de Vacuna
     * @param id de la Persona Vacuna
     * @param data objeto con la informacion de Persona Vacuna
     * @return vacuna actualizada
     */
    PersonVaccineDto update(long id, PersonVaccineDto data);
    /**
     * Elimina registro de Persona Vacuna
     *
     * @param id busca por ide para eliminar
     * @return Persona Vacuna eliminada
     */
    Long deleteById(long id);
}
