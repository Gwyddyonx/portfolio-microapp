package com.gwyddyon.portfolio_microapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gwyddyon.portfolio_microapp.dto.Experience;
import com.gwyddyon.portfolio_microapp.repositories.ExperienceRepository;

@Service
public class ExperienceService {

    @Autowired
    ExperienceRepository experienceRepository;

    public List<Experience> getExperiences(int id, String language){
        return experienceRepository.getExperiences(id, language);
    }
    
}
