package com.example.property.service;

import com.example.property.configure.CommonResult;
import com.example.property.model.Community;

import java.util.List;

public interface CommunityService {

    CommonResult<Boolean> addCommunity(Community community);

    CommonResult<List<Community>> selectCommunity(Community community);

    CommonResult<Boolean> updateCommunity(Community community);

    CommonResult<Boolean> deleteCommunity(Community community);

    List<String> selectCommunityName();
}
