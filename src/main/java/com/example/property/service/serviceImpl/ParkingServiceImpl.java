package com.example.property.service.serviceImpl;

import com.example.property.configure.CommonResult;
import com.example.property.mapper.ParkingMapper;
import com.example.property.model.Parking;
import com.example.property.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingServiceImpl implements ParkingService {

    @Autowired
    private ParkingMapper parkingMapper;

    @Override
    public CommonResult<Boolean> addParking(Parking parking) {
        return null;
    }

    @Override
    public CommonResult<List<Parking>> selectParking(Parking parking) {
        return null;
    }

    @Override
    public CommonResult<Boolean> updateParking(Parking parking) {
        return null;
    }

    @Override
    public CommonResult<Boolean> deleteParking(Parking parking) {
        return null;
    }
}
