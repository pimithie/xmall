package com.xmall.service;

import com.xmall.bean.Message;
import com.xmall.entity.UserLoginInfo;

/**
 * @author xiaqi
 * @date 2019/7/16
 */
public interface UserService {

    /**
     * 读取所有的用户信息
     * @return 响应实体
     */
    Message getAllUsers();

    /**
     * SSO?
     * @return
     */
    Message login();

    /**
     * 注册用户
     * @param userLoginInfo 用户注册信息
     * @return 响应实体
     */
    Message register(UserLoginInfo userLoginInfo);
}
