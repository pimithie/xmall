package com.xmall.service.impl;

import com.xmall.bean.Message;
import com.xmall.entity.UserLoginInfo;
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
        Message message = new Message();
        try {
            UserLoginInfo userLoginInfo = userLoginInfoMapper.selectByUsernameAndPassword(username, password);
            message.setCode(200);
            if (null == userLoginInfo) {
                message.setMessage("用户名或密码错误！");
                return message;
            }
            message.setMessage("登录成功");
            return message;
        } catch (Exception e) {
            message.setCode(500);
            message.setMessage("服务器出现问题");
            return message;
        }
    }
}
