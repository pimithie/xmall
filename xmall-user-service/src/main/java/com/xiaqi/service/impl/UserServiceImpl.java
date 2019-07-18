package com.xiaqi.service.impl;

import com.xiaqi.mapper.UserLoginInfoMapper;
import com.xmall.bean.Message;
import com.xmall.entity.UserLoginInfo;
import com.xmall.service.UserService;
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
        Message message = new Message();
        message.setCode(200);
        message.setMessage("获取所有用户登录信息成功!");
        message.setData(userLoginInfoMapper.getAllUsersLoginInfo());
        return message;
    }

    @Override
    public Message login() {
        return null;
    }

    @Override
    public Message register(UserLoginInfo userLoginInfo) {
        Message message = new Message();
        // 查询用户是否已经存在
        UserLoginInfo info = userLoginInfoMapper.selectByUsername(userLoginInfo.getUsername());
        if (null != info) {
            message.setCode(400);
            message.setMessage("用户名已经存在!");
            return message;
        }
        userLoginInfoMapper.insert(userLoginInfo);
        message.setCode(200);
        message.setMessage("注册成功!");
        return message;
    }
}
