package com.ramendu.data.dao;

import com.ramendu.data.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author rams0516
 *         Date: 1/9/2018
 *         Time: 1:43 PM
 */

@Component("usersDao")
public class UsersDao {

    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource jdbc) {
        this.jdbcTemplate = new NamedParameterJdbcTemplate(jdbc);
    }

    public boolean registerUser(Users users) {
        BeanPropertySqlParameterSource parameterSource = new BeanPropertySqlParameterSource(users);
        return jdbcTemplate.update("insert into users (name, username, email, password) values (:name, :username, :email, :password)", parameterSource) == 1;
    }

    public Users getUserByName(String username) {
        MapSqlParameterSource map = new MapSqlParameterSource();
        map.addValue("username", username);
        return jdbcTemplate.queryForObject("select * from users where username = :username", map, (resultSet, i) -> {
            Users users = new Users();
            users.setId(resultSet.getInt(("id")));
            users.setName(resultSet.getString("name"));
            users.setEmail(resultSet.getString("email"));
            users.setUsername(resultSet.getString("username"));
            users.setPassword(resultSet.getString("password"));
            return users;
        });
    }

    public boolean validate(String username, Users users) {
        Users usr = getUserByName(username);
        if(usr.getPassword().equals(users.getPassword())) {
            return true;
        } else {
            return false;
        }
    }
}