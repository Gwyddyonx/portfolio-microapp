package com.gwyddyon.portfolio_microapp.dto;

public class Skill {

    private Integer portfolio_id;
    private String name;
    private String image;
    private int protifiency;
    private String type;
    
    public Skill() {
    }

    public Skill(Integer portfolio_id, String name, String image, int protifiency, String type) {
        this.portfolio_id = portfolio_id;
        this.name = name;
        this.image = image;
        this.protifiency = protifiency;
        this.type = type;
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


    public String getImage() {
        return image;
    }


    public void setImage(String image) {
        this.image = image;
    }


    public int getProtifiency() {
        return protifiency;
    }


    public void setProtifiency(int protifiency) {
        this.protifiency = protifiency;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }
    
}
