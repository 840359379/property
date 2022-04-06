package com.example.property.controller;

import com.example.property.configure.CommonResult;
import com.example.property.model.Community;
import com.example.property.model.User;
import com.example.property.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping(value = "community")
@Controller
public class CommunityController {

    @Autowired
    private CommunityService communityService;

    @RequestMapping(value = "communityList")
    public String communityList(HttpServletRequest request, Model model,Community community){
        User user = (User) request.getSession().getAttribute("user");
        List<Community> communityList = communityService.selectCommunity(community).getData();
        model.addAttribute("communityList",communityList);
        model.addAttribute("user",user);
        return "communityList";
    }

    @RequestMapping(value = "communityAdd")
    public String communityAdd(Community community,Model model) {
        List<Community> communityList = communityService.selectCommunity(community).getData();
        if(communityList.size() != 0) {
            model.addAttribute("community", communityList.get(0));
        }
        if(communityList.size() > 0){
            model.addAttribute("status",1);
        }else {
            model.addAttribute("status",2);
        }
        return "communityAdd";
    }

    @RequestMapping(value = "add")
    @ResponseBody
    public CommonResult<Boolean> add(Community community) {
        return communityService.addCommunity(community);
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public CommonResult<Boolean> update(Community community) {
        return communityService.updateCommunity(community);
    }

    @RequestMapping(value = "delete")
    @ResponseBody
    public CommonResult<Boolean> delete(Community community) {
        return communityService.deleteCommunity(community);
    }
}
