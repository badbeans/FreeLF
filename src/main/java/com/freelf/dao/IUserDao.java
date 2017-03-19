package com.freelf.dao;

import com.freelf.model.FreelfUserEntity;

/**
 * Created by RENQI on 2016/11/13.
 */
public interface IUserDao {
    public boolean isExist(FreelfUserEntity user);
}
