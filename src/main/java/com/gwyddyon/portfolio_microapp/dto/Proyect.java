package com.gwyddyon.portfolio_microapp.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Proyect {
    private Integer proyect_id;
    private String title;
    private String description;
    private String repository;
    private String link_demo;
    private String language;

    public Proyect() {
    }

    public Proyect(Integer proyect_id, String title, String description, String repository, String link_demo,
            String language) {
        this.proyect_id = proyect_id;
        this.title = title;
        this.description = description;
        this.repository = repository;
        this.link_demo = link_demo;
        this.language = language;
    }

    public Integer getProyect_id() {
        return proyect_id;
    }

    public void setProyect_id(Integer proyect_id) {
        this.proyect_id = proyect_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public String getLink_demo() {
        return link_demo;
    }

    public void setLink_demo(String link_demo) {
        this.link_demo = link_demo;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    
        
}
