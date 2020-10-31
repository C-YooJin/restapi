package com.covid.service;

import com.covid.domain.SampleRepository;
import com.covid.dto.SampleDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class TestService {

    private SampleRepository sampleRepository;

    public TestService(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }



}
