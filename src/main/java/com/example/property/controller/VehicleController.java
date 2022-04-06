package com.example.property.controller;

import com.example.property.configure.CommonResult;
import com.example.property.model.*;
import com.example.property.service.CommunityService;
import com.example.property.service.PersonnelService;
import com.example.property.service.VehicleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "vehicle")
public class VehicleController {

    @Autowired
    private CommunityService communityService;

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private PersonnelService personnelService;

    @RequestMapping(value = "vehicleList")
    public String vehicleList(HttpServletRequest request, Model model, Vehicle vehicle){
        User user = (User) request.getSession().getAttribute("user");
        List<Vehicle> vehicleList = vehicleService.selectVehicle(vehicle).getData();
        model.addAttribute("vehicleList", vehicleList);
        model.addAttribute("user",user);
        return "vehicleList";
    }

    @RequestMapping(value = "vehicleAdd")
    public String homeAdd(HttpServletRequest request, Model model, Vehicle vehicle){
        model.addAttribute("communityList",communityService.selectCommunity(new Community()).getData());
        model.addAttribute("personnelList",personnelService.selectPersonnel(new Personnel()).getData());
        List<Vehicle> vehicleList =  vehicleService.selectVehicle(vehicle).getData();
        if(vehicle.getId() != null){
            model.addAttribute("vehicle",vehicleList.get(0));
            model.addAttribute("status",2);
        }else {
            model.addAttribute("status",1);
        }
        return "vehicleAdd";
    }

    @RequestMapping(value = "add")
    @ResponseBody
    public CommonResult<Boolean> add(Vehicle vehicle){
        return vehicleService.addVehicle(vehicle);
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public CommonResult<Boolean> update(Vehicle vehicle){
        return vehicleService.updateVehicle(vehicle);
    }

    @RequestMapping(value = "delete")
    @ResponseBody
    public CommonResult<Boolean> delete(Vehicle vehicle){
        return vehicleService.deleteVehicle(vehicle);
    }

}
