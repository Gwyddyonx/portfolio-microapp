package com.gwyddyon.portfolio_microapp.dto;

import java.time.LocalDate;

public class Portfolio {
    private Integer portfolio_id;
    private String name;
    private LocalDate birth_date;
    private String photo;
    private String description;
    private String language;

    public Portfolio(){
    }

    public Portfolio(Integer portfolio_id, String name, LocalDate birth_date, String photo, String description,
            String language) {
        this.portfolio_id = portfolio_id;
        this.name = name;
        this.birth_date = birth_date;
        this.photo = photo;
        this.description = description;
        this.language = language;
    }

    public Integer getPortfolio_id() {
        return portfolio_id;
    }

    public void setPortfolio_id(Integer portfolio_id) {
        this.portfolio_id = portfolio_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(LocalDate birth_date) {
        this.birth_date = birth_date;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    

}
