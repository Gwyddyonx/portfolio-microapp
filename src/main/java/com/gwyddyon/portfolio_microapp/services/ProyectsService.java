package com.gwyddyon.portfolio_microapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gwyddyon.portfolio_microapp.repositories.ProyectsRepository;
import com.gwyddyon.portfolio_microapp.dto.Proyect;

@Service
public class ProyectsService {
    
    @Autowired
    ProyectsRepository proyectsRepository;

    public List<Proyect> getProyectsById(int portfolio_id, String language){
        return proyectsRepository.getProyects(portfolio_id, language);
    }
}
