package dev.turbin.core.rest;

import dev.turbin.common.dto.CaseDto;
import dev.turbin.core.service.CaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/case")
@RequiredArgsConstructor
public class CommonController {

    private final CaseService caseService;

    @GetMapping("/{caseId}")
    public CaseDto getById(@PathVariable Long caseId) {
        return caseService.getCaseById(caseId);
    }
}
