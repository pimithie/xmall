package com.xmall.service;

import com.xmall.bean.Message;
import com.xmall.entity.UserLoginInfo;

/**
 * @author xiaqi
 * @date 2019/7/22
 */
public interface UserInfoService {

    /**
     * 读取所有的用户信息
     * @return 响应实体
     */
    Message getAllUsers();

    /**
     * 注册用户
     * @param userLoginInfo 用户注册信息
     * @return 响应实体
     */
    Message register(UserLoginInfo userLoginInfo);

    /**
     * 更新用户信息
     * @param userLoginInfo 设置所需修改的信息，若某个属性不需要修改，则置为null
     * @return 响应实体
     */
    Message updateUserLoginInfo(UserLoginInfo userLoginInfo);

    /**
     * 根据电话(11位)查找用户信息
     * @param phone 用户电话
     * @return 响应实体
     */
    Message selectByPhone(String phone);

    /**
     * 根据邮箱查找用户信息
     * @param email 用户邮箱
     * @return 响应实体
     */
    Message selectByEmail(String email);

    /**
     * 根据token去redis中取"session"的中当前用户，判断是否进行了验证
     * @param token 用户登录token
     * @return 响应实体
     */
    Message checkUserIsVerified(String token);

}
