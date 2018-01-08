package com.ramendu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rams0516
 *         Date: 1/8/2018
 *         Time: 5:54 PM
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHome() {
        return "home";
    }

}