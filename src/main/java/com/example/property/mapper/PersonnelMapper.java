package com.example.property.mapper;

import com.example.property.model.Home;
import com.example.property.model.Personnel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonnelMapper {

    public Boolean addPersonnel(Personnel home);

    public List<Personnel> selectPersonnel(Personnel home);

    public Boolean updatePersonnel(Personnel home);

    public boolean deletePersonnel(Personnel home);

}
