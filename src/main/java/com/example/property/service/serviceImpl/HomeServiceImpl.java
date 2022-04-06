package com.example.property.service.serviceImpl;

import com.example.property.configure.CommonResult;
import com.example.property.mapper.HomeMapper;
import com.example.property.model.Home;
import com.example.property.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private HomeMapper homeMapper;

    @Override
    public CommonResult<Boolean> addHome(Home home) {
        Date date = new Date();
        Long dateString = date.getTime();
        home.setHomeId("Hm" + dateString);
        if(homeMapper.addHome(home)){
            return new CommonResult<>(200,"成功",true);
        }
        return new CommonResult<>(404,"失败",false);
    }

    @Override
    public CommonResult<List<Home>> selectHome(Home home) {
        return new CommonResult<>(200,"成功",homeMapper.selectHome(home));
    }

    @Override
    public CommonResult<Boolean> updateHome(Home home) {
        if(homeMapper.updateHome(home)){
            return new CommonResult<>(200,"成功",true);
        }
        return new CommonResult<>(404,"失败",false);
    }

    @Override
    public CommonResult<Boolean> deleteHome(Home home) {
        if(homeMapper.deleteHome(home)){
            return new CommonResult<>(200,"成功",true);
        }
        return new CommonResult<>(404,"失败",false);
    }
}
