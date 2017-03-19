package com.freelf.service.impl;

import com.freelf.dao.IUserDao;
import com.freelf.model.FreelfUserEntity;
import com.freelf.service.IUserService;
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
    public boolean isExist(FreelfUserEntity user) {
        return userDao.isExist(user);
    }
}
