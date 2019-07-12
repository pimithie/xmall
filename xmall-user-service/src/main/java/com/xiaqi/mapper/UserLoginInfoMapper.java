package com.xiaqi.mapper;

import com.xiaqi.entity.UserLoginInfo;

public interface UserLoginInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserLoginInfo record);

    int insertSelective(UserLoginInfo record);

    UserLoginInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserLoginInfo record);

    int updateByPrimaryKey(UserLoginInfo record);
}