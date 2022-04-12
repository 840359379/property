package com.example.property.controller;

import com.example.property.configure.CommonResult;
import com.example.property.model.*;
import com.example.property.service.CommunityService;
import com.example.property.service.ParkingService;
import com.example.property.service.ParkingUsageService;
import com.example.property.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "parkingUsage")
public class ParkingUsageController {
    @Autowired
    private CommunityService communityService;

    @Autowired
    private ParkingService parkingService;

    @Autowired
    private ParkingUsageService parkingUsageService;

    @RequestMapping(value = "parkingUsageList")
    public String parkingList(HttpServletRequest request, Model model){
        User user = (User) request.getSession().getAttribute("user");
        List<ParkingUsage> parkingUsageList = parkingUsageService.selectParkingUsage(new ParkingUsage()).getData();
        model.addAttribute("parkingUsageList", parkingUsageList);
        model.addAttribute("user",user);
        return "parkingUsageList";
    }

    @RequestMapping(value = "parkingUsageAdd")
    public String homeAdd(HttpServletRequest request, Model model, ParkingUsage parkingUsage){
        model.addAttribute("communityList",communityService.selectCommunity(new Community()).getData());
        model.addAttribute("parkingList",parkingService.selectParking(new Parking()).getData());
        List<ParkingUsage> parkingUsageList =  parkingUsageService.selectParkingUsage(parkingUsage).getData();
        if(parkingUsage.getId() != null){
            model.addAttribute("parkingUsage",parkingUsageList.get(0));
            model.addAttribute("status",2);
        }else {
            model.addAttribute("status",1);
        }
        return "parkingUsageAdd";
    }

    @RequestMapping(value = "add")
    @ResponseBody
    public CommonResult<Boolean> add(ParkingUsage parkingUsage){
        return parkingUsageService.addParkingUsage(parkingUsage);
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public CommonResult<Boolean> update(ParkingUsage parkingUsage){
        return parkingUsageService.updateParkingUsage(parkingUsage);
    }

    @RequestMapping(value = "delete")
    @ResponseBody
    public CommonResult<Boolean> delete(ParkingUsage parkingUsage){
        return parkingUsageService.deleteParkingUsage(parkingUsage);
    }
}
