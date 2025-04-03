package com.gwyddyon.portfolio_microapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gwyddyon.portfolio_microapp.dto.Proyect;
import com.gwyddyon.portfolio_microapp.services.ProyectsService;

@RestController
@RequestMapping("/portfolios/{id}/proyects")
public class ProyectsController {

    @Autowired
    ProyectsService proyectsService;

    @GetMapping()
    public List<Proyect> getProyectsById(@PathVariable int id,
            @RequestHeader(value = "Accept-Language", defaultValue = "en") String language) {
        return proyectsService.getProyectsById(id, language);
    }

}
