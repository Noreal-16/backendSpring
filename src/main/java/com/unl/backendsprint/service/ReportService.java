package com.unl.backendsprint.service;

import com.unl.backendsprint.domain.dto.ReportDto;

import java.util.Date;
import java.util.List;

public interface ReportService {
    List<ReportDto> getByDateRange(Date startDate, Date endDate);
}
