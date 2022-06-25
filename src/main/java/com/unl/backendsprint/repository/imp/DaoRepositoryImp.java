package com.unl.backendsprint.repository.imp;

import com.unl.backendsprint.domain.Person;
import com.unl.backendsprint.domain.dto.PersonDto;
import com.unl.backendsprint.repository.DaoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.text.html.parser.Entity;
import java.util.Date;
import java.util.List;

@Repository
@AllArgsConstructor
public class DaoRepositoryImp implements DaoRepository {
    private final EntityManager entityManager;

    @Override
    public List<Person> findAll() {
        return null;
    }

    @Override
    public List<Person> findAllCriteria() {
        return null;
    }

    @Override
    public List<PersonDto> findAllCriteriaDto() {
        return null;
    }

    @Override
    public List<Object[]> getReport(Date startDate, Date endDate) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT PER.DNI, CONCAT(PER.NAME, ' _ ', PER.LASTNAME)AS FULL_NAMES, PVA.DATE, PVA.DOSE,VAC.NAME, VAC.LOT")
                .append("FROM PERSON PER")
                .append("INNER JOIN PERSON_VACCINE PVA ON PVA.PERSON_ID = PER.ID")
                .append("INNER JOIN VACCINE VAC ON VAC.ID=PVA.VACCINE_ID")
                .append("WHERE")
                .append("PVA.DATE BETWEEN :startDate AND :endDate")
                .append("ORDER BY DATE");
        Query query = entityManager.createNativeQuery(sql.toString());
        query.setParameter("startDate", startDate);
        query.setParameter("endDate", endDate);
        return query.getResultList();
    }
}
