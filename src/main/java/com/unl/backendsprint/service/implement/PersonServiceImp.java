package com.unl.backendsprint.service.implement;

import com.unl.backendsprint.domain.Person;
import com.unl.backendsprint.repository.PersonRepository;
import com.unl.backendsprint.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class PersonServiceImp implements PersonService {
    //inyeccion de dependencias sin utilizar el new se utiliza @AllArgsConstructor
    private final PersonRepository personRepository;

    @Override
    public Person getById(long id) {
        Optional <Person> person = this.personRepository.findById(id);
        return null;
    }
}
