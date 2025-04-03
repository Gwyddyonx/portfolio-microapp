package com.gwyddyon.portfolio_microapp.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gwyddyon.portfolio_microapp.dto.Proyect;
import com.gwyddyon.portfolio_microapp.dto.Skill;

@Repository
public class SkillsRepository {
    
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Skill> getSkills(int portfolio_id){

        String sql = "SELECT\r\n" + //
                        "    sk.skill_id,\r\n" + //
                        "    sk.name,\r\n" + //
                        "    sk.image,\r\n" + //
                        "    sk.protifiency,\r\n" + //
                        "    sk.type\r\n" + //
                        "FROM\r\n" + //
                        "    skills sk\r\n" + //
                        "WHERE\r\n" + //
                        "        sk.portfolio_id = ?\r\n" + //
                        "    AND is_active = 1";
        List<Skill> results = jdbcTemplate.query(sql, new Object[]{portfolio_id},(rs, rowNum) ->
            new Skill(
                rs.getInt("skill_id"),
                rs.getString("name"),
                rs.getString("image"),
                rs.getInt("protifiency"),
                rs.getString("type")
            )

        );

        return results;
    }
}
