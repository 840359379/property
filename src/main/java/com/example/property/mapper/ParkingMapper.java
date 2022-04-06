package com.example.property.mapper;

import com.example.property.model.Parking;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ParkingMapper {

    public Boolean addParking(Parking parking);

    public List<Parking> selectParking(Parking parking);

    public Boolean updateParking(Parking parking);

    public boolean deleteParking(Parking parking);
}
