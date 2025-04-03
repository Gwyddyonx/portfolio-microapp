package com.gwyddyon.portfolio_microapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gwyddyon.portfolio_microapp.dto.Portfolio;
import com.gwyddyon.portfolio_microapp.repositories.PortfoliosRepository;

@Service
public class PortfoliosService {
    
    @Autowired
    private PortfoliosRepository portfolioRepository;

    public Portfolio getPortfolio(int id, String language){
        return portfolioRepository.getPortfolio(id, language);
    }
}
