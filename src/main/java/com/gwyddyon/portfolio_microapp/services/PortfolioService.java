package com.gwyddyon.portfolio_microapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gwyddyon.portfolio_microapp.dto.Portfolio;
import com.gwyddyon.portfolio_microapp.repositories.PortfolioRepository;

@Service
public class PortfolioService {
    
    @Autowired
    private PortfolioRepository portfolioRepository;

    public List<Portfolio> getPortfolio(int id){
        return portfolioRepository.getPortfolio(id);
    }
}
