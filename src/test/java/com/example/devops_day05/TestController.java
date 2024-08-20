package com.example.devops_day05;

import com.example.devops_day05.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/test")
    public String test(){
        return "v2";
    }

    @GetMapping("/test/create")
    public void create(){
        testService.save();
    }

}
