package com.ramendu.data.dao;

import com.ramendu.data.model.Drinks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author rams0516
 *         Date: 1/9/2018
 *         Time: 11:01 AM
 */

@Component("drinksDao")
public class DrinksDao {

    private NamedParameterJdbcTemplate jdbc;

    @Autowired
    public void setDataSource(DataSource jdbc) {
        this.jdbc = new NamedParameterJdbcTemplate(jdbc);
    }

    public List<Drinks> getAllDrinks() {
        return jdbc.query("select * from drinks", (resultSet, rowNum) -> {
            Drinks drinks = new Drinks();

            drinks.setId(resultSet.getInt("id"));
            drinks.setName(resultSet.getString("name"));
            drinks.setDetails(resultSet.getString("details"));
            drinks.setPrice(resultSet.getInt("price"));
            drinks.setStock(resultSet.getInt("stock"));

            return drinks;
        });
    }
}