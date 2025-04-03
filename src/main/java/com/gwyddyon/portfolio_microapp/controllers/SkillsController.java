package com.gwyddyon.portfolio_microapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gwyddyon.portfolio_microapp.dto.Skill;
import com.gwyddyon.portfolio_microapp.services.SkillsService;

@RestController
@RequestMapping("/portfolios/{id}/skills")
public class SkillsController {

    @Autowired
    SkillsService skillsService;

    @GetMapping
    public List<Skill> getSkillsById(@PathVariable int id) {
        return skillsService.getSkillsById(id);
    }
}
