package com.gwyddyon.portfolio_microapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gwyddyon.portfolio_microapp.services.TestService;

@RestController
@RequestMapping("/test")
public class TestController {
    
    @Autowired
    TestService testService;

    @GetMapping
    public List<String> getTest(){
        return testService.getTest();
    }
    
}
