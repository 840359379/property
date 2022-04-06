package com.example.property.mapper;

import com.example.property.model.Vehicle;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VehicleMapper {

    public Boolean addVehicle(Vehicle home);

    public List<Vehicle> selectVehicle(Vehicle home);

    public Boolean updateVehicle(Vehicle home);

    public boolean deleteVehicle(Vehicle home);
}
