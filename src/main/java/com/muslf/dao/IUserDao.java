package com.muslf.dao;

import com.muslf.model.MuslfUserEntity;

/**
 * Created by RENQI on 2016/11/13.
 */
public interface IUserDao {
    public boolean isExist(MuslfUserEntity user);
}
