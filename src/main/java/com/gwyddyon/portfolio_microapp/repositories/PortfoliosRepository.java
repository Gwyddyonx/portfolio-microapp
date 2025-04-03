package com.gwyddyon.portfolio_microapp.repositories;

import java.util.List;

import javax.sound.sampled.Port;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gwyddyon.portfolio_microapp.dto.Portfolio;

@Repository
public class PortfoliosRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Portfolio getPortfolio(int id, String language) {

        String sql = "SELECT \r\n" + //
                "    pf.portfolio_id,\r\n" + //
                "    pf.name,\r\n" + //
                "    pf.birth_date,\r\n" + //
                "    pf.photo,\r\n" + //
                "    pfl.description,\r\n" + //
                "    pfl.language\r\n" + //
                "FROM portfolios pf\r\n" + //
                "JOIN portfolio_translation pfl\r\n" + //
                "ON pf.portfolio_id = pfl.portfolio_id\r\n" + //
                "WHERE pf.portfolio_id = ?\r\n" + //
                "AND pfl.language = ?";
        return jdbcTemplate.queryForObject(sql, new Object[] { id, language }, (rs, rowNum) -> new Portfolio(
                rs.getInt("portfolio_id"),
                rs.getString("name"),
                rs.getDate("birth_date").toLocalDate(),
                rs.getString("photo"),
                rs.getString("description"),
                rs.getString("language"))

        );

    }
}
