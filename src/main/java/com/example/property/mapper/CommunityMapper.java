package com.example.property.mapper;

import com.example.property.model.Community;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommunityMapper {

    public Boolean addCommunity(Community community);

    public List<Community> selectCommunity(Community community);

    public Boolean updateCommunity(Community community);

    public boolean deleteCommunity(Community community);
}
