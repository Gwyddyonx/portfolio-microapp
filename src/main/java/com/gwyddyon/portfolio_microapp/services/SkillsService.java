package com.gwyddyon.portfolio_microapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gwyddyon.portfolio_microapp.dto.Skill;
import com.gwyddyon.portfolio_microapp.repositories.SkillsRepository;

@Service
public class SkillsService {
    
    @Autowired
    SkillsRepository skillsRepository;

    public List<Skill> getSkillsById(int portfolio_id){
        return skillsRepository.getSkills(portfolio_id);
    }
}
