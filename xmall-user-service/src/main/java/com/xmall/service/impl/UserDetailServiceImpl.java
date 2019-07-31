package com.xmall.service.impl;

import com.xmall.entity.UserDetail;
import com.xmall.mapper.UserDetailMapper;
import com.xmall.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiaqi
 * @date 2019/7/30
 */
@Service // 需改为dubbo暴露服务接口
public class UserDetailServiceImpl implements UserDetailService {

    @Autowired
    private UserDetailMapper userDetailMapper;

    @Override
    public UserDetail getUserDetailInfoById(Long userId) {
        return userDetailMapper.selectByPrimaryKey(userId);
    }

    @Override
    public boolean insert(UserDetail userDetail) {
        return userDetailMapper.insert(userDetail) > 0;
    }

    @Override
    public boolean update(UserDetail userDetail) {
        return userDetailMapper.updateByPrimaryKeySelective(userDetail) > 0;
    }
}
