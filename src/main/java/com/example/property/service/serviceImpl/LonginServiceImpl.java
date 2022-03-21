package com.example.property.service.serviceImpl;

import com.example.property.mapper.UserMapper;
import com.example.property.model.User;
import com.example.property.service.LonginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LonginServiceImpl implements LonginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User record(String id, String pw) {
        return userMapper.record(id,pw);
    }
}
