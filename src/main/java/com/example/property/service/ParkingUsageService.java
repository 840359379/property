package com.example.property.service;

import com.example.property.configure.CommonResult;
import com.example.property.model.ParkingUsage;

import java.util.List;

public interface ParkingUsageService {

    CommonResult<Boolean> addParkingUsage(ParkingUsage parkingUsage);

    CommonResult<List<ParkingUsage>> selectParkingUsage(ParkingUsage parkingUsage);

    CommonResult<Boolean> updateParkingUsage(ParkingUsage parkingUsage);

    CommonResult<Boolean> deleteParkingUsage(ParkingUsage parkingUsage);
}
