package com.gwyddyon.portfolio_microapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gwyddyon.portfolio_microapp.dto.Portfolio;
import com.gwyddyon.portfolio_microapp.repositories.PortfolioRepository;

@RestController
@RequestMapping("/portfolio")
public class PortfolioController {
    
    @Autowired
    private PortfolioRepository portfolioRepository;

    @GetMapping
    public List<Portfolio> getPortfolio(@RequestParam int id){
        return portfolioRepository.getPortfolio(id);
    }
}
