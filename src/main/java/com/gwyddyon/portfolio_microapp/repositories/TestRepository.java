package com.gwyddyon.portfolio_microapp.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<String> getTest(){
        return jdbcTemplate.queryForList("SELECT sysdate FROM dual", String.class);
    }
    
    
}
