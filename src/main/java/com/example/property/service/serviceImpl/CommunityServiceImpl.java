package com.example.property.service.serviceImpl;

import com.example.property.configure.CommonResult;
import com.example.property.mapper.CommunityMapper;
import com.example.property.model.Community;
import com.example.property.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CommunityServiceImpl implements CommunityService {

    @Autowired
    private CommunityMapper communityMapper;

    @Override
    public CommonResult<Boolean> addCommunity(Community community) {
        Date date = new Date();
        Long dateString = date.getTime();
        community.setCommunityId("KT" + dateString);
        if(communityMapper.addCommunity(community)){
            return new CommonResult<>(200,"成功",true);
        }
        return new CommonResult<>(404,"失败",false);
    }

    @Override
    public CommonResult<List<Community>> selectCommunity(Community community) {
        return new CommonResult<>(200,"成功",communityMapper.selectCommunity(community));
    }

    @Override
    public CommonResult<Boolean> updateCommunity(Community community) {
        if(communityMapper.updateCommunity(community)){
            return new CommonResult<>(200,"成功",true);
        }
        return new CommonResult<>(404,"失败",false);
    }

    @Override
    public CommonResult<Boolean> deleteCommunity(Community community) {
        if(communityMapper.deleteCommunity(community)){
            return new CommonResult<>(200,"成功",true);
        }
        return new CommonResult<>(404,"失败",false);
    }

    @Override
    public List<String> selectCommunityName() {
        List<Community> communityList = communityMapper.selectCommunity(new Community());
        List<String> list = new ArrayList<>();
        communityList.forEach(community -> {
            list.add(community.getCommunityName());
        });
        return list;
    }
}
