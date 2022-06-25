package com.unl.backendsprint.service.implement;

import com.unl.backendsprint.domain.Vaccine;
import com.unl.backendsprint.domain.dto.VaccineDto;
import com.unl.backendsprint.repository.VaccineRepository;
import com.unl.backendsprint.service.VaccineService;
import com.unl.backendsprint.util.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

/**
 * {@inheritDoc}
 */
@Service
@RequiredArgsConstructor
public class VaccineServiceImp implements VaccineService {
    private final VaccineRepository vaccineRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public VaccineDto getById(long id) {
        Vaccine vaccine = getEntityById(id);
        return convertEntityToDto(vaccine);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<VaccineDto> getAll() {
        return this.vaccineRepository.findAll().stream().map(this::convertEntityToDto).toList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VaccineDto create(VaccineDto data) {
        Vaccine vaccine = convertDtoToEntity(data);
        return convertEntityToDto(this.vaccineRepository.save(vaccine));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VaccineDto update(long id, VaccineDto data) {
        Vaccine vaccine = getEntityById(id);
        vaccine.setName(data.getName());
        vaccine.setLot(data.getLot());
        return convertEntityToDto(vaccine);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public long deleteById(long id) {
        getEntityById(id);
        this.vaccineRepository.deleteById(id);
        return id;
    }



    private Vaccine getEntityById(long id) {
        Optional<Vaccine> optional = this.vaccineRepository.findById(id);
        if (optional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontro un registro con el id " + id);
        }
        return optional.get();
    }

    private VaccineDto convertEntityToDto(Vaccine entity) {
        return Mapper.modelMapper().map(entity, VaccineDto.class);
    }

    private Vaccine convertDtoToEntity(VaccineDto data){
        return  Mapper.modelMapper().map(data, Vaccine.class);
    }
}
