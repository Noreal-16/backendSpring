package com.unl.backendsprint.controller;

import com.unl.backendsprint.domain.dto.PersonDto;
import com.unl.backendsprint.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(value = "/persons", produces = MediaType.APPLICATION_JSON_VALUE)
public class PersonController {
    private final PersonService personService;

    @GetMapping
    public ResponseEntity<List<PersonDto>> getAll(){
        log.info("Get all.");
        return ResponseEntity.ok(this.personService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonDto> getById(@PathVariable long id){
        log.info("Get by Id. id ="+id);
        return ResponseEntity.ok(this.personService.getById(id));
    }

    @PostMapping
    public  ResponseEntity<PersonDto> create(@RequestBody @Valid PersonDto data){
        log.info("Create. data="+data);
        return new ResponseEntity<>(this.personService.create(data), HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public  ResponseEntity<PersonDto> update(@PathVariable long id,@RequestBody @Valid PersonDto data){
        log.info("Update. i="+id + "data=" + data);
        return new ResponseEntity<>(this.personService.update(id,data), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable long id){
        log.info("Delete by id. id="+id);
        return ResponseEntity.ok(this.personService.deleteById(id));
    }
}
