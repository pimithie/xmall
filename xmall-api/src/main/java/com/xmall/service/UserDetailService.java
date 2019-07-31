package com.xmall.service;

import com.xmall.bean.Message;
import com.xmall.entity.UserDetail;

/**
 * @author xiaqi
 * @date 2019/7/29
 */
public interface UserDetailService {

    /**
     * 根据userId获取用户详细信息
     * @param userId 指定的userId
     * @return 响应实体
     */
    UserDetail getUserDetailInfoById(Long userId);

    /**
     * 新增用户详细信息
     * @param userDetail 新增的用户详细信息userDetail
     * @return 响应实体
     */
    boolean insert(UserDetail userDetail);

    /**
     * 更新用户详细信息
     * @param userDetail 更新的用户详细信息userDetail
     * @return 响应实体
     */
    boolean update(UserDetail userDetail);

}
