package com.covid.controller;

import com.covid.domain.SampleEntity;
import com.covid.domain.SampleRepository;
import com.covid.dto.SampleDto;
import com.covid.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ApiController {

    private SampleRepository sampleRepository;

    @Autowired
    public ApiController(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    // Post로 JSON타입만 받겠다는 의미 -> consumes
    @PostMapping(value = "api/test", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveData(@RequestBody SampleDto sampleDto) {
        sampleRepository.save(sampleDto.toEntity());
    }
}
