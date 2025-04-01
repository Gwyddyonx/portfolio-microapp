package com.gwyddyon.portfolio_microapp.repositories;

import java.util.List;

import javax.sound.sampled.Port;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gwyddyon.portfolio_microapp.dto.Portfolio;

@Repository
public class PortfolioRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Portfolio> getPortfolio(int id){
        //return jdbcTemplate.queryForList("SELECT * FROM PORTFOLIO WHERE PORTFOLIO_ID = '"+id+"'", String.class);

        String sql = "SELECT portfolio_id, name, birth_date, description FROM portfolios WHERE portfolio_id=?";
        List<Portfolio> results = jdbcTemplate.query(sql, new Object[]{id},(rs, rowNum) ->
            new Portfolio(
                rs.getInt("portfolio_id"),
                rs.getString("name"),
                rs.getDate("birth_date").toLocalDate(),
                rs.getString("description")

            )

        );

        return results;

    }
}
