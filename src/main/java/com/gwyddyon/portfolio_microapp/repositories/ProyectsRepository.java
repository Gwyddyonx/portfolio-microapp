package com.gwyddyon.portfolio_microapp.repositories;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gwyddyon.portfolio_microapp.dto.Proyect;

@Repository
public class ProyectsRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Proyect> getProyects(int portfolio_id, String language){

        String sql = "SELECT\r\n" + //
                        "    py.proyect_id,\r\n" + //
                        "    pyl.title,\r\n" + //
                        "    pyl.description,\r\n" + //
                        "    py.repository,\r\n" + //
                        "    py.link_demo,\r\n" + //
                        "    pyl.language\r\n" + //
                        "FROM\r\n" + //
                        "         proyects py\r\n" + //
                        "    JOIN proyects_translations pyl ON py.proyect_id = pyl.proyect_id\r\n" + //
                        "WHERE\r\n" + //
                        "        is_active = 1\r\n" + //
                        "    AND py.portfolio_id = ?" +
                        "    AND pyl.language = ?";
        List<Proyect> results = jdbcTemplate.query(sql, new Object[]{portfolio_id,language},(rs, rowNum) ->
            new Proyect(
                rs.getInt("proyect_id"),
                rs.getString("title"),
                rs.getString("description"),
                rs.getString("repository"),
                rs.getString("link_demo"),
                rs.getString("language")
            )

        );

        return results;

    }
}
