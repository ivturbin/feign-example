package dev.turbin.core.service;

import dev.turbin.common.dto.CaseDto;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CaseService {

    public CaseDto getCaseById(Long id) {
        return buildCase();
    }

    private CaseDto buildCase() {
        return CaseDto.builder().caseId(9876123L)
                .createDt(LocalDate.now())
                .info("Дело номер 25")
                .build();
    }
}
