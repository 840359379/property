package com.example.property.service;

import com.example.property.configure.CommonResult;
import com.example.property.model.Home;

import java.util.List;

public interface HomeService {

    CommonResult<Boolean> addHome(Home home);

    CommonResult<List<Home>> selectHome(Home home);

    CommonResult<Boolean> updateHome(Home home);

    CommonResult<Boolean> deleteHome(Home home);
}
