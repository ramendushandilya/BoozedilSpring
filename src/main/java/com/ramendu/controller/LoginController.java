package com.ramendu.controller;

import com.ramendu.data.model.Users;
import com.ramendu.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rams0516
 *         Date: 1/9/2018
 *         Time: 1:32 PM
 */

@Controller
public class LoginController {

    private UsersService usersService;

    @Autowired
    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }

    @RequestMapping("/login")
    public String showLoginPage(Model model) {
        model.addAttribute("user", new Users());
        return "login";
    }

    @RequestMapping("/validate")
    public String validate(Model model,Users users) {
        if(usersService.validate(users.getUsername(), users)) {
            model.addAttribute("userna", users.getUsername());
            return "profile";
        } else {
            return "login";
        }
    }

}