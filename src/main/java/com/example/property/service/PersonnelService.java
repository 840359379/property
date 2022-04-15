package com.example.property.service;

import com.example.property.configure.CommonResult;
import com.example.property.model.Personnel;

import java.util.List;
import java.util.Map;

public interface PersonnelService {

    CommonResult<Boolean> addPersonnel(Personnel community);

    CommonResult<List<Personnel>> selectPersonnel(Personnel community);

    CommonResult<Boolean> updatePersonnel(Personnel community);

    CommonResult<Boolean> deletePersonnel(Personnel community);

    List<Map<String,Object>> selectPersonnelCommunity();
}
