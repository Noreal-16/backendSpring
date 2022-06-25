package com.unl.backendsprint.service.implement;

import com.unl.backendsprint.domain.dto.ReportDto;
import com.unl.backendsprint.repository.DaoRepository;
import com.unl.backendsprint.service.ReportService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ReportServiceImp implements ReportService {
    private final DaoRepository daoRepository;
    @Override
    public List<ReportDto> getByDateRange(Date startDate, Date endDate) {
        List<Object []> objecs = this.daoRepository.getReport(startDate, endDate);
        List<ReportDto> reportDtos = new ArrayList<>(0);
        for (Object[] object: objecs){
            reportDtos.add(new ReportDto(object));
        }
        return reportDtos;
    }
}
