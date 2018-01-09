package com.ramendu.service;

import com.ramendu.data.dao.DrinksDao;
import com.ramendu.data.model.Drinks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author rams0516
 *         Date: 1/9/2018
 *         Time: 11:17 AM
 */

@Service("drinksService")
public class DrinksService {

    private DrinksDao drinksDao;

    @Autowired
    public void setDrinksDao(DrinksDao drinksDao) {
        this.drinksDao = drinksDao;
    }

    public List<Drinks> getDrinks() {
        return drinksDao.getAllDrinks();
    }
}