package com.example.property.service;

import com.example.property.model.User;

public interface LonginService {

    /**
     * 登录
     * @param id
     * @param pw
     * @return
     */
    public User record(String id, String pw);
}
