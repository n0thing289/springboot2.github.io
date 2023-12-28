package com.weikai.mapper;

import com.weikai.pojo.User;

public interface UserMapper {
    /**
     * 根据username查询用户
     * @return
     */
    User selectByUsername(String username);
}
