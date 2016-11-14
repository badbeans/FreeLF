package com.muslf.service.impl;

import com.muslf.dao.IUserDao;
import com.muslf.model.MuslfUserEntity;
import com.muslf.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by RENQI on 2016/11/13.
 */
@Transactional
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    @Override
    public boolean isExist(MuslfUserEntity user) {
        return userDao.isExist(user);
    }
}
