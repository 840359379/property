package com.example.property.service.serviceImpl;

import com.example.property.configure.CommonResult;
import com.example.property.mapper.BuildingMapper;
import com.example.property.model.Building;
import com.example.property.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BuildingServiceImpl implements BuildingService {

    @Autowired
    private BuildingMapper buildingMapper;

    @Override
    public CommonResult<Boolean> addBuilding(Building building) {
        Date date = new Date();
        Long dateString = date.getTime();
        building.setBuildingsId("CJ" + dateString);
        if(buildingMapper.addBuilding(building)){
            return new CommonResult<>(200,"成功",true);
        }
        return new CommonResult<>(404,"失败",false);
    }

    @Override
    public CommonResult<List<Building>> selectBuilding(Building building) {
        return new CommonResult<>(200,"成功",buildingMapper.selectBuilding(building));
    }

    @Override
    public CommonResult<Boolean> updateBuilding(Building building) {
        if(buildingMapper.updateBuilding(building)){
            return new CommonResult<>(200,"成功",true);
        }
        return new CommonResult<>(404,"失败",false);
    }

    @Override
    public CommonResult<Boolean> deleteBuilding(Building building) {
        if(buildingMapper.deleteBuilding(building)){
            return new CommonResult<>(200,"成功",true);
        }
        return new CommonResult<>(404,"失败",false);
    }
}
