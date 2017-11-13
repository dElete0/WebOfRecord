package com.delete.demo.tools;

import com.delete.demo.domain.Achievement;
import com.delete.demo.domain.Group;
import com.delete.demo.domain.Planning;
import com.delete.demo.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class IndexPage {
    private User user;
    private List<Group> groups;
    private List<Planning> plannings;
    private List<Achievement> achievements;
    private List<Map<String,Object>> resultList;

    public IndexPage(String sql, User user, JdbcTemplate jdbcTemplate){
        if(jdbcTemplate == null){
            try {
                throw new IllegalAccessException("Page.jdbcTemplate is null");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }else if(sql == null || sql.equals("")){
            try {
                throw new IllegalAccessException("Page.sql is empty");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }else {
            setUser(user);

            StringBuffer totalSQL = new StringBuffer("SELECT count(*) FROM (");
            totalSQL.append(sql);

        }
    }

    public void setUser(User user) {
        this.user = user;
    }
}
