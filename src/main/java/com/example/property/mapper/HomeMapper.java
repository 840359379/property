package com.example.property.mapper;

import com.example.property.model.Home;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HomeMapper {

    public Boolean addHome(Home home);

    public List<Home> selectHome(Home home);

    public Boolean updateHome(Home home);

    public boolean deleteHome(Home home);
}
