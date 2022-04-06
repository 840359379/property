package com.example.property.controller;

import com.example.property.configure.CommonResult;
import com.example.property.model.Building;
import com.example.property.model.Community;
import com.example.property.model.User;
import com.example.property.service.BuildingService;
import com.example.property.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "building")
public class BuildingController {

    @Autowired
    private CommunityService communityService;

    @Autowired
    private BuildingService buildingService;

    @RequestMapping(value = "buildingList")
    public String buildingList(HttpServletRequest request, Model model, Building building){
        User user = (User) request.getSession().getAttribute("user");
        List<Building> buildingList = buildingService.selectBuilding(building).getData();
        model.addAttribute("buildingList",buildingList);
        model.addAttribute("user",user);
        return "buildingList";
    }

    @RequestMapping(value = "buildingAdd")
    public String buildingAdd(Building building,Model model) {
        model.addAttribute("communityList",communityService.selectCommunity(new Community()).getData());
        List<Building> homeList =  buildingService.selectBuilding(building).getData();
        if(homeList.size() > 0){
            model.addAttribute("building",homeList.get(0));
            model.addAttribute("status",2);
        }else {
            model.addAttribute("status",1);
        }
        return "buildingAdd";
    }

    @RequestMapping(value = "add")
    @ResponseBody
    public CommonResult<Boolean> add(Building building) {
        return buildingService.addBuilding(building);
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public CommonResult<Boolean> update(Building building) {
        return buildingService.updateBuilding(building);
    }

    @RequestMapping(value = "delete")
    @ResponseBody
    public CommonResult<Boolean> delete(Building building) {
        return buildingService.deleteBuilding(building);
    }
}
