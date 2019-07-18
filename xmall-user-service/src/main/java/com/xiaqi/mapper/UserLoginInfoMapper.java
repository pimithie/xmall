package com.xiaqi.mapper;


import com.xmall.entity.UserLoginInfo;

import java.util.List;

/**
 * 用户登录信息实体Mapper接口
 */
public interface UserLoginInfoMapper {
    /**
     * 根据id删除指定用户
     * @param id 被删除用户的id
     * @return 影响行数
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 新增用户登录信息
     * @param userLoginInfo 被新增的用户登录信息
     * @return 影响行数
     */
    int insert(UserLoginInfo userLoginInfo);

    /**
     * 根据id查询用户登录信息
     * @param id 用户id
     * @return 用户登录信息
     */
    UserLoginInfo selectByPrimaryKey(Long id);

    /**
     * 根据id选择性的更新用户登录信息
     * @param userLoginInfo 需要进行更新的用户登录信息，需指定id，以及需要更新的字段，不更新置为null
     * @return 影响行数
     */
    int updateByPrimaryKeySelective(UserLoginInfo userLoginInfo);

    /**
     * 根据id更新用户登录信息
     * @param userLoginInfo 需要进行更新的用户登录信息，需指定id，以及需要所有字段的值
     * @return 影响行数
     */
    int updateByPrimaryKey(UserLoginInfo userLoginInfo);

    /**
     * 获取所有用户的登录信息
     * @return 所有的用户登录信息
     */
    List<UserLoginInfo> getAllUsersLoginInfo();

    /**
     * 根据用户名查询用户登录信息
     * @param username 指定的用户名
     * @return 用户登录信息
     */
    UserLoginInfo selectByUsername(String username);
}