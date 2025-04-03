package com.gwyddyon.portfolio_microapp.dto;

import java.time.LocalDate;

public class Experience {
    private Integer experience_id;
    private String role;
    private String company;
    private LocalDate start_date;
    private LocalDate end_date;
    private String language;

    public Experience() {
    }

    public Experience(Integer experience_id, String role, String company, LocalDate start_date, LocalDate end_date,
            String language) {
        this.experience_id = experience_id;
        this.role = role;
        this.company = company;
        this.start_date = start_date;
        this.end_date = end_date;
        this.language = language;
    }

    public Integer getExperience_id() {
        return experience_id;
    }

    public void setExperience_id(Integer experience_id) {
        this.experience_id = experience_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}
