package com.example.property.service;

import com.example.property.configure.CommonResult;
import com.example.property.model.Vehicle;

import java.util.List;

public interface VehicleService {

    CommonResult<Boolean> addVehicle(Vehicle vehicle);

    CommonResult<List<Vehicle>> selectVehicle(Vehicle vehicle);

    CommonResult<Boolean> updateVehicle(Vehicle vehicle);

    CommonResult<Boolean> deleteVehicle(Vehicle vehicle);
}
