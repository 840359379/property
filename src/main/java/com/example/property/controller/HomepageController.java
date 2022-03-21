package com.example.property.controller;

import com.example.property.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "homepage")
public class HomepageController {

    @RequestMapping(value = "index")
    public String index(HttpServletRequest request, Model model){
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user",user);
        return "index";
    }

    @RequestMapping(value = "welcome")
    public String welcome(HttpServletRequest request,Model model){
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user",user);
        return "welcome";
    }
}
