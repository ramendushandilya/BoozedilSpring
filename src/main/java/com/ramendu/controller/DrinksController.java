package com.ramendu.controller;

import com.ramendu.data.model.Drinks;
import com.ramendu.service.DrinksService;
import com.ramendu.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author rams0516
 *         Date: 1/9/2018
 *         Time: 11:21 AM
 */

@Controller
public class DrinksController {

    private DrinksService drinksService;

    @Autowired
    public void setDrinksService(DrinksService drinksService) {
        this.drinksService = drinksService;
    }

    @RequestMapping("/drinks")
    public String showDrinks(Model model) {
        List<Drinks> drinksList = drinksService.getDrinks();
        model.addAttribute("drinks", drinksList);
        return null;
    }
}