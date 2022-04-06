package com.example.property.service;

import com.example.property.configure.CommonResult;
import com.example.property.model.Parking;

import java.util.List;

public interface ParkingService {

    CommonResult<Boolean> addParking(Parking parking);

    CommonResult<List<Parking>> selectParking(Parking parking);

    CommonResult<Boolean> updateParking(Parking parking);

    CommonResult<Boolean> deleteParking(Parking parking);
}
