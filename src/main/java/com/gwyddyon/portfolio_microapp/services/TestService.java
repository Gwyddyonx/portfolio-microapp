package com.gwyddyon.portfolio_microapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gwyddyon.portfolio_microapp.repositories.TestRepository;

@Service
public class TestService {
    
    @Autowired
    TestRepository testRepository;

    public List<String> getTest(){
        return testRepository.getTest();
    }
    
}
