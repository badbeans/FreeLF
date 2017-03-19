package com.freelf.service;

import com.freelf.model.FreelfUserEntity;

/**
 * Created by RENQI on 2016/11/13.
 */
public interface IUserService {
    public boolean isExist(FreelfUserEntity user);
}
