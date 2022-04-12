package com.example.property.service.serviceImpl;

import com.example.property.configure.CommonResult;
import com.example.property.mapper.ParkingMapper;
import com.example.property.model.Parking;
import com.example.property.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ParkingServiceImpl implements ParkingService {

    @Autowired
    private ParkingMapper parkingMapper;

    @Override
    public CommonResult<Boolean> addParking(Parking parking) {
        Date date = new Date();
        Long dateString = date.getTime();
        parking.setParkId("XY" + dateString);
        if(parkingMapper.addParking(parking)){
            return new CommonResult<>(200,"成功",true);
        }
        return new CommonResult<>(404,"失败",false);
    }

    @Override
    public CommonResult<List<Parking>> selectParking(Parking parking) {
        return new CommonResult<>(200,"成功",parkingMapper.selectParking(parking));
    }

    @Override
    public CommonResult<Boolean> updateParking(Parking parking) {
        if(parkingMapper.updateParking(parking)){
            return new CommonResult<>(200,"成功",true);
        }
        return new CommonResult<>(404,"失败",false);
    }

    @Override
    public CommonResult<Boolean> deleteParking(Parking parking) {
        if(parkingMapper.deleteParking(parking)){
            return new CommonResult<>(200,"成功",true);
        }
        return new CommonResult<>(404,"失败",false);
    }
}
