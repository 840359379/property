package com.example.property.controller;

import com.example.property.configure.CommonResult;
import com.example.property.model.*;
import com.example.property.service.BuildingService;
import com.example.property.service.CommunityService;
import com.example.property.service.HomeService;
import com.example.property.service.PersonnelService;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "welcome")
public class WelcomeController {

    @Autowired
    private PersonnelService personnelService;

    @Autowired
    private CommunityService communityService;

    @Autowired
    private BuildingService buildingService;

    @Autowired
    private HomeService homeService;

    @RequestMapping(value = "index")
    public String welcome(HttpServletRequest request, Model model){
        Personnel personnel = new Personnel();
        personnel.setPersonnelType("租户");
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("building",buildingService.selectBuilding(new Building()).getData().size());
        model.addAttribute("tenant",personnelService.selectPersonnel(new Personnel()).getData().size());
        personnel.setPersonnelType("");
        model.addAttribute("personnel",personnelService.selectPersonnel(new Personnel()).getData().size());
        model.addAttribute("home",homeService.selectHome(new Home()).getData().size());

        model.addAttribute("user",user);
        return "welcome";
    }

    @RequestMapping("personnelDate")
    @ResponseBody
    private CommonResult<List> personnelDate() {
        List<String> stringList = communityService.selectCommunityName();
        List mapList = personnelService.selectPersonnelCommunity();
        List<Object> objectList = new ArrayList<>();
        objectList.add(stringList);
        objectList.add(mapList);
        return new CommonResult<>(200,"成功",objectList);
    }

    @RequestMapping(value = "parkingDate")
    @ResponseBody
    private CommonResult<List> parkingDate() {
        List objectMap = personnelService.selectPersonnelCommunity();
        List<String> stringList = communityService.selectCommunityName();
        List<Object> objectList = new ArrayList<>();
        objectList.add(stringList);
        objectList.add(objectMap);
        return new CommonResult<>(200,"成功",objectList);
    }
}
