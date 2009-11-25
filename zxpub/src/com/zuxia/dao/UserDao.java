package com.zuxia.dao;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.zuxia.entity.User;

public class UserDao extends HibernateDaoSupport implements IUserDao{
	public boolean insert(User user) {
		Session session = this.getSession();
		session.save(user);
		return false;
	}

	@Override
	public User getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}
}
