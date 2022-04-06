package com.example.property.service;

import com.example.property.configure.CommonResult;
import com.example.property.model.Building;

import java.util.List;

public interface BuildingService {

    CommonResult<Boolean> addBuilding(Building community);

    CommonResult<List<Building>> selectBuilding(Building community);

    CommonResult<Boolean> updateBuilding(Building community);

    CommonResult<Boolean> deleteBuilding(Building community);
}
