package com.alfatecsolutions.paylinker.web.rest.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthyController {

    @GetMapping("/health")
    public String healthCheck() {
        return "Healthy!";
    }
}
