package dev.turbin.common.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class CaseDto {
    private Long caseId;
    private String info;
    private LocalDate createDt;
}
