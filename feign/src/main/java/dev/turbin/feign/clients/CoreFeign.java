package dev.turbin.feign.clients;

import dev.turbin.common.dto.CaseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "core-service", url = "http://localhost:9000")
public interface CoreFeign {

    @GetMapping("/case/{caseId}")
    CaseDto getData(@PathVariable Long caseId);
}

