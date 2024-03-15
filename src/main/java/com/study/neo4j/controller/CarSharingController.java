package com.study.neo4j.controller;

import com.study.neo4j.service.CarSharingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carSharing")
@RequiredArgsConstructor
public class CarSharingController {

    private final CarSharingService service;

    @PostMapping("/generate")
    public void generateCarSharing() {
        this.service.generate();
    }
}
