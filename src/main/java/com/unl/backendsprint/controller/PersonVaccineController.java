package com.unl.backendsprint.controller;

import com.unl.backendsprint.domain.PersonVaccine;
import com.unl.backendsprint.domain.dto.PersonVaccineDto;
import com.unl.backendsprint.service.PersonVaccineService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping(value = "/PersonVaccine" , produces = MediaType.APPLICATION_JSON_VALUE)
public class PersonVaccineController {
    private final PersonVaccineService personVaccineService;

    @GetMapping
    public ResponseEntity<List<PersonVaccineDto>> getAll(){
        log.info("Get all PersonVaccine.");
        return ResponseEntity.ok(this.personVaccineService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonVaccineDto> getById(@PathVariable long id){
        log.info("Get By Id. id= " + id);
        return ResponseEntity.ok(this.personVaccineService.getById(id));
    }

    @PostMapping
    public ResponseEntity<PersonVaccineDto> create(@RequestBody @Valid PersonVaccineDto data){
        log.info("Create PersonVaccine. PersonaVaccine = " + data);
        return  ResponseEntity.ok(this.personVaccineService.create(data));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PersonVaccineDto> update(@PathVariable long id, @RequestBody @Valid PersonVaccineDto data){
        log.info("Update PersonVaccine. Id= "+id+" PersonaVaccine = " + data);
        return ResponseEntity.ok(this.personVaccineService.update(id, data));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> delete(@PathVariable long id){
        log.info("Delete PersonVaccine. Id= "+id);
        return ResponseEntity.ok(this.personVaccineService.deleteById(id));
    }
}
