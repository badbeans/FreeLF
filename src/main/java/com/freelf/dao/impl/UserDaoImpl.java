package com.freelf.dao.impl;

import com.freelf.dao.IUserDao;
import com.freelf.model.FreelfUserEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by RENQI on 2016/11/13.
 */
@Repository("userDao")
public class UserDaoImpl implements IUserDao {
    @Resource
    protected SessionFactory sessionFactory;

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public boolean isExist(FreelfUserEntity user) {
        Session session = this.getSession();
        String hql = "from FreelfUserEntity where username =? and userpwd = ?";
        Query query = session.createQuery(hql);
        query.setString(0, user.getUsername());
        query.setString(1, user.getUserpwd());
        if (query.list().size() >= 1) {
            return true;
        }
        return false;
    }
}
