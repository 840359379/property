package com.example.property.service.serviceImpl;

import com.example.property.configure.CommonResult;
import com.example.property.mapper.ParkingUsageMapper;
import com.example.property.model.ParkingUsage;
import com.example.property.service.ParkingUsageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingUsageServiceImpl implements ParkingUsageService {

    @Autowired
    private ParkingUsageMapper parkingUsageMapper;

    @Override
    public CommonResult<Boolean> addParkingUsage(ParkingUsage parkingUsage) {
        if(parkingUsageMapper.addParkingUsage(parkingUsage)){
            return new CommonResult<>(200,"成功",true);
        }
        return new CommonResult<>(404,"失败",false);
    }

    @Override
    public CommonResult<List<ParkingUsage>> selectParkingUsage(ParkingUsage parkingUsage) {
        return new CommonResult<>(200,"成功",parkingUsageMapper.selectParkingUsage(parkingUsage));
    }

    @Override
    public CommonResult<Boolean> updateParkingUsage(ParkingUsage parkingUsage) {
        if(parkingUsageMapper.updateParkingUsage(parkingUsage)){
            return new CommonResult<>(200,"成功",true);
        }
        return new CommonResult<>(404,"失败",false);
    }

    @Override
    public CommonResult<Boolean> deleteParkingUsage(ParkingUsage parkingUsage) {
        if(parkingUsageMapper.deleteParkingUsage(parkingUsage)){
            return new CommonResult<>(200,"成功",true);
        }
        return new CommonResult<>(404,"失败",false);
    }
}
