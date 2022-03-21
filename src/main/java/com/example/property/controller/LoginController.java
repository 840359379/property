package com.example.property.controller;

import com.example.property.configure.CommonResult;
import com.example.property.model.User;
import com.example.property.service.LonginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * denglu
 * @author jianqiao.liu
 * @date 2022/3/21
 */
@Controller
@RequestMapping(value = "login")
public class LoginController {

    @Autowired
    private LonginService longinService;

    @RequestMapping(value = "index")
    public String index() {
        return "login";
    }

    @RequestMapping(value = "verification")
    @ResponseBody
    public CommonResult verification(User user, HttpServletRequest request) {
        User bronUser = longinService.record(user.getAccount(), user.getPassword());
        if(bronUser == null){
            return new CommonResult(404,"登录失败", null);
        }else {
            request.getSession().setAttribute("user", bronUser);
        }
        user.setPassword("******");
        return new CommonResult(200,"操作成功",bronUser);
    }

}
