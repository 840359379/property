package com.example.property.mapper;

import com.example.property.model.Building;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BuildingMapper {

    public Boolean addBuilding(Building community);

    public List<Building> selectBuilding(Building community);

    public Boolean updateBuilding(Building community);

    public boolean deleteBuilding(Building community);

}
