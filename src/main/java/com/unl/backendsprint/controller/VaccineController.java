package com.unl.backendsprint.controller;

import com.unl.backendsprint.domain.dto.VaccineDto;
import com.unl.backendsprint.service.VaccineService;
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
@RequestMapping(value = "/vaccine", produces = MediaType.APPLICATION_JSON_VALUE)
public class VaccineController {
    private final VaccineService vaccineService;

    @GetMapping
    public ResponseEntity<List<VaccineDto>> getAll(){
        log.info("Get all.");
        return ResponseEntity.ok(this.vaccineService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<VaccineDto> getById(@PathVariable long id){
        log.info("Get by Id. id ="+id);
        return ResponseEntity.ok(this.vaccineService.getById(id));
    }

    @PostMapping
    public ResponseEntity<VaccineDto> create(@RequestBody  @Valid VaccineDto data){
        log.info("Create Vaccine. Vaccine = " + data);
        return ResponseEntity.ok(this.vaccineService.create(data));
    }

    @PutMapping("/{id}")
    public  ResponseEntity<VaccineDto> update(@PathVariable long id, @RequestBody @Valid VaccineDto data){
        log.info("Update Vaccine. id= " + id +" Vaccine = " + data);
        return ResponseEntity.ok(this.vaccineService.update(id,data));
    }

    @DeleteMapping("/{id}")
    public  ResponseEntity<Long> delete(@PathVariable long id){
        log.info("Deleye by Id. id ="+id);
        return ResponseEntity.ok(this.vaccineService.deleteById(id));
    }
}
