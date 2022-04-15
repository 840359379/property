package com.example.property.service.serviceImpl;

import com.example.property.configure.CommonResult;
import com.example.property.mapper.CommunityMapper;
import com.example.property.mapper.ParkingMapper;
import com.example.property.model.Community;
import com.example.property.model.Parking;
import com.example.property.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ParkingServiceImpl implements ParkingService {

    @Autowired
    private ParkingMapper parkingMapper;

    @Autowired
    private CommunityMapper communityMapper;

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

    @Override
    public List<Map<String, Object>> selectParkingCommunity() {
        List<Community> communityList = communityMapper.selectCommunity(new Community());
        List<Parking> parkingList = parkingMapper.selectParkingCommunity();
        Map<String,String> map = new HashMap<>();
        communityList.forEach(community -> {
            map.put(community.getCommunityId(),community.getCommunityName());
        });
        List<Map<String,Object>> mapList = new ArrayList<>();
        parkingList.forEach(parking -> {
            Map<String,Object> bornMap = new HashMap<>();
            bornMap.put("value",parking.getId());
            bornMap.put("name",map.get(parking.getCommunityId()));
            mapList.add(bornMap);
        });
        return mapList;
    }
}
