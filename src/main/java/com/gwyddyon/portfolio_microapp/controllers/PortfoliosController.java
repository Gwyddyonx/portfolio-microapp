package com.gwyddyon.portfolio_microapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gwyddyon.portfolio_microapp.dto.Portfolio;
import com.gwyddyon.portfolio_microapp.repositories.PortfoliosRepository;

@RestController
@RequestMapping("/portfolios")
public class PortfoliosController {

    @Autowired
    private PortfoliosRepository portfolioRepository;

    @GetMapping("/{id}")
    public Portfolio getPortfolio(@PathVariable int id,
            @RequestHeader(value = "Accept-Language", defaultValue = "en") String language) {
        return portfolioRepository.getPortfolio(id, language);
    }
}