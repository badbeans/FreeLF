package com.muslf.dao.impl;

import com.muslf.dao.IUserDao;
import com.muslf.model.MuslfUserEntity;
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
    public boolean isExist(MuslfUserEntity user) {
        Session session = this.getSession();
        String hql = "from MuslfUserEntity where username =? and userpwd = ?";
        Query query = session.createQuery(hql);
        query.setString(0, user.getUsername());
        query.setString(1, user.getUserpwd());
        if (query.list().size() >= 1) {
            return true;
        }
        return false;
    }
}
