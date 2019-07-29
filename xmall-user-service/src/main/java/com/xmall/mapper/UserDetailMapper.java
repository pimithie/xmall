package com.xmall.mapper;

import com.xmall.entity.UserDetail;

public interface UserDetailMapper {
    /**
     * 根据userId删除用户信息
     * @param userId 指定的userId
     * @return 返回影响行数
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * 新增用户详细信息
     * @param record 指定的UserDetail
     * @return 返回影响行数
     */
    int insert(UserDetail record);

    /**
     * 通过主键查询用户详细信息
     * @param userId 指定的userId
     * @return 返回用户详细信息UserDetail
     */
    UserDetail selectByPrimaryKey(Long userId);

    /**
     * 更新用户详细信息，无需修改保持为null
     * @param record 指定的更新用户详细信息
     * @return 返回影响行数
     */
    int updateByPrimaryKeySelective(UserDetail record);

    /**
     * 更新用户详细信息，需全部指定
     * @param record 指定的更新用户详细信息
     * @return 返回影响行数
     */
    int updateByPrimaryKey(UserDetail record);
}