package dev.turbin.feign.rest;

import dev.turbin.common.dto.CaseDto;
import dev.turbin.feign.clients.CoreFeign;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final CoreFeign coreFeign;

    @GetMapping("/feign")
    public CaseDto test() {
        return coreFeign.getData(123L);
    }
}
