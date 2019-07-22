package com.xmall.service;

import com.xmall.bean.Message;
import com.xmall.entity.UserLoginInfo;

/**
 * @author xmall
 * @date 2019/7/16
 */
public interface UserLoginService {

    /**
     * 用户登录接口
     * @param username 登录用户名
     * @param password 登录密码
     * @param checkCode 验证码
     * @return 响应实体
     */
    Message login(String username,String password,String checkCode);

}
