package com.zuxia.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zuxia.dao.IUserDao;
import com.zuxia.entity.User;

public class UserDaoImpl extends HibernateDaoSupport implements IUserDao {
	@Override
	public boolean insert(User user) {
		boolean flag = false;
		Session session = this.getSession();
		try {
			session.save(user);
			flag = true;
		} catch (HibernateException e) {
			flag = false;
		}
		return flag;
	}

	@Override
	public User getUserByUserName(String userName) {
		Session session = this.getSession();
		User user = null;
		try {
			String hql = "from User where USER_NAME=:userName";
			Query query = session.createQuery(hql);
			query.setParameter("userName", userName);
			List<User> userList = query.list();
			if (userList != null && userList.size() > 0) {
				user = userList.get(0);
			}
		} catch (HibernateException e) {
		}
		return user;
	}

	@Override
	public boolean deleteUserByName(String name) {
		boolean flag = false;
		Session session = this.getSession();
		try {
			session.delete(getUserByUserName(name));
			flag = true;
		} catch (HibernateException e) {
			flag = false;
		}
		return flag;
	}

	@Override
	public boolean updateUser(User user) {
		boolean flag = false;
		Session session = this.getSession();
		try {
			session.update(user);
			flag = true;
		} catch (HibernateException e) {
			flag = false;
		}
		return flag;
	}
}
