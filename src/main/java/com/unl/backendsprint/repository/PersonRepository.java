package com.unl.backendsprint.repository;

import com.unl.backendsprint.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Se extiende de Person  y el tipo de dato para poder acceder a los datos de la persona (Tipo Interfase)
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
