package com.ramendu.controller;

import com.ramendu.data.model.Users;
import com.ramendu.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * @author rams0516
 *         Date: 1/9/2018
 *         Time: 1:33 PM
 */

@Controller
public class RegisterController {

    private UsersService usersService;

    @Autowired
    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }

    @RequestMapping("/register")
    public String showRegisterPage(Model model) {
        model.addAttribute("user", new Users());
        return "register";
    }

    //TODO Hook db interaction
    //TODO fix form validation messages
    @RequestMapping(value ="/registerUser", method = RequestMethod.POST)
    public String registerUser(Model model, @Valid Users users, BindingResult result) {
        /*if(result.hasErrors()) {
            return "register";
        }*/
        Users user = new Users();
        if(usersService.registerUser(users)) {
            model.addAttribute("success","Registered successfully, login now!");
            return "login";
        } else {
            model.addAttribute("fail", "User not registered, try again!");
            return "register";
        }

    }

}