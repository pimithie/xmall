package com.xmall.service.impl;

import com.xmall.bean.Message;
import com.xmall.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xmall.mapper.UserLoginInfoMapper;

/**
 * @author xmall
 * @date 2019/7/16
 */

@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private UserLoginInfoMapper userLoginInfoMapper;

    @Override
    public Message login(String username, String password, String checkCode) {
        return null;
    }
}
