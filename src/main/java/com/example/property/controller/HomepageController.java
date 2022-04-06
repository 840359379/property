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

    @RequestMapping(value = "parkingUsageList")
    public String parkingUsageList(HttpServletRequest request,Model model){
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user",user);
        return "parkingUsageList";
    }

    @RequestMapping(value = "activityList")
    public String activityList(HttpServletRequest request,Model model){
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user",user);
        return "activityList";
    }

    @RequestMapping(value = "repairList")
    public String repairList(HttpServletRequest request,Model model){
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user",user);
        return "repairList";
    }

    @RequestMapping(value = "complainList")
    public String complainList(HttpServletRequest request,Model model){
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user",user);
        return "complainList";
    }

    @RequestMapping(value = "mailboxList")
    public String mailboxList(HttpServletRequest request,Model model){
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user",user);
        return "mailboxList";
    }

    @RequestMapping(value = "proList")
    public String proList(HttpServletRequest request,Model model){
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user",user);
        return "proList";
    }

    @RequestMapping(value = "proMxList")
    public String proMxList(HttpServletRequest request,Model model){
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user",user);
        return "proMxList";
    }

    @RequestMapping(value = "deviceList")
    public String deviceList(HttpServletRequest request,Model model){
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user",user);
        return "deviceList";
    }

    @RequestMapping(value = "adminList")
    public String adminList(HttpServletRequest request,Model model){
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user",user);
        return "adminList";
    }

    @RequestMapping(value = "adminGroup")
    public String adminGroup(HttpServletRequest request,Model model){
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user",user);
        return "adminGroup";
    }

    @RequestMapping(value = "authRule")
    public String authRule(HttpServletRequest request,Model model){
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user",user);
        return "authRule";
    }

    @RequestMapping(value = "system")
    public String system(HttpServletRequest request,Model model){
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user",user);
        return "system";
    }

    @RequestMapping(value = "oneSet")
    public String oneSet(HttpServletRequest request,Model model){
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user",user);
        return "oneSet";
    }
}
