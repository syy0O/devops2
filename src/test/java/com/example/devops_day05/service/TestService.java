package com.example.devops_day05.service;

import com.example.devops_day05.entity.Test;
import com.example.devops_day05.repository.TestRepository;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private final TestRepository testRepository;

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public void save(){
        testRepository.save(new Test("test", 1000));
    }
}
