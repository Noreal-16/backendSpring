package com.unl.backendsprint.repository;

import com.unl.backendsprint.domain.PersonVaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonVaccineRepository extends JpaRepository<PersonVaccine, Long> {
}
