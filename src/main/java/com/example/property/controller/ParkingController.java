package com.example.property.controller;

import com.example.property.configure.CommonResult;
import com.example.property.model.*;
import com.example.property.service.CommunityService;
import com.example.property.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "parking")
public class ParkingController {

    @Autowired
    private CommunityService communityService;

    @Autowired
    private ParkingService parkingService;

    @RequestMapping(value = "parkingList")
    public String parkingList(HttpServletRequest request, Model model){
        User user = (User) request.getSession().getAttribute("user");
        List<Parking> parkingList = parkingService.selectParking(new Parking()).getData();
        model.addAttribute("parkingList", parkingList);
        model.addAttribute("user",user);
        return "parkingList";
    }

    @RequestMapping(value = "parkAdd")
    public String homeAdd(HttpServletRequest request, Model model, Parking parking){
        model.addAttribute("communityList",communityService.selectCommunity(new Community()).getData());
//        model.addAttribute("personnelList",personnelService.selectPersonnel(new Personnel()).getData());
        List<Parking> parkingList =  parkingService.selectParking(parking).getData();
        if(parking.getId() != null){
            model.addAttribute("parking",parkingList.get(0));
            model.addAttribute("status",2);
        }else {
            model.addAttribute("status",1);
        }
        return "parkAdd";
    }

    @RequestMapping(value = "add")
    @ResponseBody
    public CommonResult<Boolean> add(Parking parking){
        return parkingService.addParking(parking);
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public CommonResult<Boolean> update(Parking parking){
        return parkingService.updateParking(parking);
    }

    @RequestMapping(value = "delete")
    @ResponseBody
    public CommonResult<Boolean> delete(Parking parking){
        return parkingService.deleteParking(parking);
    }


}
