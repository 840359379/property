package com.example.property.controller;

import com.example.property.configure.CommonResult;
import com.example.property.model.Community;
import com.example.property.model.Home;
import com.example.property.model.Personnel;
import com.example.property.model.User;
import com.example.property.service.CommunityService;
import com.example.property.service.HomeService;
import com.example.property.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping(value = "personnel")
@Controller
public class PersonnelController {

    @Autowired
    private PersonnelService personnelService;

    @Autowired
    private CommunityService communityService;

    @Autowired
    private HomeService homeService;

    @RequestMapping(value = "personnelList")
    public String personnelList(HttpServletRequest request, Model model, Personnel personnel){
        User user = (User) request.getSession().getAttribute("user");
        List<Personnel> personnelList = personnelService.selectPersonnel(personnel).getData();
        model.addAttribute("personnelList", personnelList);
        model.addAttribute("user",user);
        return "personnelList";
    }

    @RequestMapping(value = "personnelAdd")
    public String homeAdd(HttpServletRequest request, Model model, Personnel personnel){
        model.addAttribute("communityList",communityService.selectCommunity(new Community()).getData());
        model.addAttribute("homeList",homeService.selectHome(new Home()).getData());
        List<Personnel> personnelList =  personnelService.selectPersonnel(personnel).getData();
        if(personnelList.size() > 0){
            model.addAttribute("personnel",personnelList.get(0));
            model.addAttribute("status",2);
        }else {
            model.addAttribute("status",1);
        }
        return "personnelAdd";
    }

    @RequestMapping(value = "add")
    @ResponseBody
    public CommonResult<Boolean> add(Personnel personnel){
        return personnelService.addPersonnel(personnel);
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public CommonResult<Boolean> update(Personnel personnel){
        return personnelService.updatePersonnel(personnel);
    }

    @RequestMapping(value = "delete")
    @ResponseBody
    public CommonResult<Boolean> delete(Personnel personnel){
        return personnelService.deletePersonnel(personnel);
    }

}
