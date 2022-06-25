package com.unl.backendsprint.repository;

import com.unl.backendsprint.domain.Person;
import com.unl.backendsprint.domain.dto.PersonDto;

import java.util.Date;
import java.util.List;

public interface DaoRepository {

    List<Person> findAll();

    List<Person> findAllCriteria();

    List<PersonDto> findAllCriteriaDto();

    List<Object[]> getReport(Date startDate, Date endDate);
}
