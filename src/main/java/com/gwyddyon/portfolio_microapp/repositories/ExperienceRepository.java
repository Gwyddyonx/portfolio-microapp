package com.gwyddyon.portfolio_microapp.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;


import com.gwyddyon.portfolio_microapp.dto.Experience;

@Repository
public class ExperienceRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Experience> getExperiences(int id_portfolio, String language){
                
        String sql =    "SELECT\r\n" + //
                        "    ex.experience_id,\r\n" + //
                        "    ex.role,\r\n" + //
                        "    ex.company,\r\n" + //
                        "    ex.start_date,\r\n" + //
                        "    ex.end_date,\r\n" + //
                        "    exl.language\r\n" + //
                        "FROM\r\n" + //
                        "         experience ex\r\n" + //
                        "    JOIN experience_languages exl ON ex.experience_id = exl.experience_id\r\n" + //
                        "WHERE\r\n" + //
                        "        ex.portfolio_id = ?\r\n" + //
                        "    AND exl.language = ?";
        List<Experience> results = jdbcTemplate.query(sql, new Object[]{id_portfolio,language},(rs, rowNum) -> {

            Date end_date = rs.getDate("end_date");
            LocalDate local_end_date = null;

            if(end_date != null){
                local_end_date = rs.getDate("end_date").toLocalDate();
            }
            return new Experience(
                rs.getInt("experience_id"),
                rs.getString("role"),
                rs.getString("company"),
                rs.getDate("start_date").toLocalDate(),
                local_end_date,
                rs.getString("language")
            );
        });

        return results;

    }
    
}
