package com.weikai.service;

import com.weikai.pojo.User;

public interface UserService {
    /**
     * 完成登录验证的业务
     * @return
     */
    boolean verify(User formUser);
}
