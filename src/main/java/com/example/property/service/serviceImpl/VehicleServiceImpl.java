package com.example.property.service.serviceImpl;

import com.example.property.configure.CommonResult;
import com.example.property.mapper.PersonnelMapper;
import com.example.property.mapper.VehicleMapper;
import com.example.property.model.Vehicle;
import com.example.property.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleMapper vehicleMapper;

    @Override
    public CommonResult<Boolean> addVehicle(Vehicle vehicle) {
        if(vehicleMapper.addVehicle(vehicle)){
            return new CommonResult<>(200,"成功",true);
        }
        return new CommonResult<>(404,"失败",false);
    }

    @Override
    public CommonResult<List<Vehicle>> selectVehicle(Vehicle vehicle) {
        return new CommonResult<>(200,"成功",vehicleMapper.selectVehicle(vehicle));
    }

    @Override
    public CommonResult<Boolean> updateVehicle(Vehicle vehicle) {
        if(vehicleMapper.updateVehicle(vehicle)){
            return new CommonResult<>(200,"成功",true);
        }
        return new CommonResult<>(404,"失败",false);
    }

    @Override
    public CommonResult<Boolean> deleteVehicle(Vehicle vehicle) {
        if(vehicleMapper.deleteVehicle(vehicle)){
            return new CommonResult<>(200,"成功",true);
        }
        return new CommonResult<>(404,"失败",false);
    }
}
