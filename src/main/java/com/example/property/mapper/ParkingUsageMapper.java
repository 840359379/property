package com.example.property.mapper;

import com.example.property.model.ParkingUsage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ParkingUsageMapper {

    public Boolean addParkingUsage(ParkingUsage parkingUsage);

    public List<ParkingUsage> selectParkingUsage(ParkingUsage parkingUsage);

    public Boolean updateParkingUsage(ParkingUsage parkingUsage);

    public boolean deleteParkingUsage(ParkingUsage parkingUsage);
}
