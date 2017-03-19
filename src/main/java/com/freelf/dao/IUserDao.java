package com.freelf.dao;

import com.freelf.model.MuslfUserEntity;

/**
 * Created by RENQI on 2016/11/13.
 */
public interface IUserDao {
    public boolean isExist(MuslfUserEntity user);
}
