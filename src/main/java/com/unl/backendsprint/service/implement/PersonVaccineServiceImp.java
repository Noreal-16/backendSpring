package com.unl.backendsprint.service.implement;

import com.unl.backendsprint.domain.PersonVaccine;
import com.unl.backendsprint.domain.dto.PersonVaccineDto;
import com.unl.backendsprint.repository.PersonVaccineRepository;
import com.unl.backendsprint.service.PersonVaccineService;
import com.unl.backendsprint.util.Mapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

/**
 * {@inheritDoc}
 */
@Service
@AllArgsConstructor
public class PersonVaccineServiceImp implements PersonVaccineService {
    private final PersonVaccineRepository personVaccineRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonVaccineDto getById(long id) {
        return convertEntitytoDto(getEntityById(id));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<PersonVaccineDto> getAll() {
        return this.personVaccineRepository.findAll().stream().map(this::convertEntitytoDto).toList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonVaccineDto create(PersonVaccineDto data) {
        PersonVaccine personVaccine = converDtoToEntity(data);
        return convertEntitytoDto(this.personVaccineRepository.save(personVaccine));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonVaccineDto update(long id, PersonVaccineDto data) {
        PersonVaccine personVaccine = getEntityById(id);
        personVaccine.setPersonId(data.getPersonId());
        personVaccine.setVacineId(data.getVacineId());
        personVaccine.setDose(data.getDose());
        personVaccine.setDate(data.getDate());
        return convertEntitytoDto(this.personVaccineRepository.save(personVaccine));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long deleteById(long id) {
        getEntityById(id);
        this.personVaccineRepository.deleteById(id);
        return id;
    }
    private  PersonVaccine getEntityById(long id){
        Optional<PersonVaccine> optional = this.personVaccineRepository.findById(id);
        if (optional.isEmpty()){
            throw new  ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontro un registro con el id " + id);
        }
        return optional.get();
    }
    private PersonVaccineDto convertEntitytoDto(PersonVaccine entity){
        return Mapper.modelMapper().map(entity, PersonVaccineDto.class);
    }

    private PersonVaccine converDtoToEntity(PersonVaccineDto entity){
        return Mapper.modelMapper().map(entity, PersonVaccine.class);
    }
}
