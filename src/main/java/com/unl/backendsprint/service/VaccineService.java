package com.unl.backendsprint.service;

import com.unl.backendsprint.domain.dto.VaccineDto;

import java.util.List;

/**
 * CRUD de Vacunnas
 */
public interface VaccineService {
    /**
     * Obtener un registro de Vacuna por id
     * @param id de registro que se va a buscar
     * @return persona encontrada
     */
    VaccineDto getById(long id);

    /**
     * Busca todas las vacunas
     * @return lista de vacunas
     */
    List<VaccineDto> getAll();

    /**
     * Crear nuevo registro de Vacuna
     * @param data objeto que contiene la informacion de vacuna
     * @return Vacuna Creada
     */
    VaccineDto create(VaccineDto data);

    /**
     * Actualiza registro de Vacuna
     * @param id de la vacuna
     * @param data objeto con la informacion de vacuna
     * @return vacuna actualizada
     */
    VaccineDto update(long id, VaccineDto data);

    /**
     * Elimina registro de vacuna
     *
     * @param id busca por ide para eliminar
     * @return Vacuna eliminada
     */
    long deleteById(long id);
}
