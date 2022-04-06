package com.example.property.controller;

import com.example.property.configure.CommonResult;
import com.example.property.model.Community;
import com.example.property.model.Home;
import com.example.property.model.User;
import com.example.property.service.CommunityService;
import com.example.property.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping(value = "home")
@Controller
public class HomeController {

    @Autowired
    private CommunityService communityService;

    @Autowired
    private HomeService homeService;

    @RequestMapping(value = "homeList")
    public String homeList(HttpServletRequest request, Model model, Home home){
        User user = (User) request.getSession().getAttribute("user");
        List<Home> homeList = homeService.selectHome(home).getData();
        model.addAttribute("homeList",homeList);
        model.addAttribute("user",user);
        return "homeList";
    }

    @RequestMapping(value = "homeAdd")
    public String homeAdd(Model model, Home home){
        model.addAttribute("communityList",communityService.selectCommunity(new Community()).getData());
        List<Home> homeList =  homeService.selectHome(home).getData();
        if(homeList.size() > 0){
            model.addAttribute("home",homeService.selectHome(home).getData().get(0));
            model.addAttribute("status",2);
        }else {
            model.addAttribute("status",1);
        }
        return "homeAdd";
    }

    @RequestMapping(value = "add")
    @ResponseBody
    public CommonResult<Boolean> add(Home home){
        return homeService.addHome(home);
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public CommonResult<Boolean> update(Home home){
        return homeService.updateHome(home);
    }

    @RequestMapping(value = "delete")
    @ResponseBody
    public CommonResult<Boolean> delete(Home home){
        return homeService.deleteHome(home);
    }
}
