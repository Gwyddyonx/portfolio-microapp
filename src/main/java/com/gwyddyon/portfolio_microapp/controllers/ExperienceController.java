package com.gwyddyon.portfolio_microapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gwyddyon.portfolio_microapp.dto.Experience;
import com.gwyddyon.portfolio_microapp.services.ExperienceService;

@RestController
@RequestMapping("/portfolios/{id}/experience")
public class ExperienceController {

    @Autowired
    ExperienceService experienceService;

    @GetMapping
    public List<Experience> getExperiences(@PathVariable int id, @RequestHeader(value = "Accept-Language", defaultValue = "en") String language){
        return experienceService.getExperiences(id, language);
    }
}
