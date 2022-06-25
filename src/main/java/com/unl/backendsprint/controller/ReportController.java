package com.unl.backendsprint.controller;

import com.unl.backendsprint.domain.dto.ReportDto;
import com.unl.backendsprint.service.ReportService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@Slf4j
@RequestMapping(value = "/report", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ReportController {
    private final ReportService reportService;

    @GetMapping("/by-date-range")
    public ResponseEntity<List<ReportDto>> getByDateRange(
            @RequestParam(name = "start") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date startDate,
            @RequestParam(name = "start") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")Date endtDate ){
        log.info("Get By Date Range. startDate = " + startDate + " endDate = "+ endtDate);
        return ResponseEntity.ok(this.reportService.getByDateRange(startDate, endtDate));
    }
}
