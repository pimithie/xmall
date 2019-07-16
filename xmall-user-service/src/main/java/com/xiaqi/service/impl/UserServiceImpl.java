package com.xiaqi.service.impl;

import com.xiaqi.bean.Message;
import com.xiaqi.mapper.UserLoginInfoMapper;
import com.xiaqi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiaqi
 * @date 2019/7/16
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserLoginInfoMapper userLoginInfoMapper;

    @Override
    public Message getAllUsers() {
        return null;
    }
}
