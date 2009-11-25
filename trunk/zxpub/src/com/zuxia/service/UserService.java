package com.zuxia.service;

import com.zuxia.dao.IUserDao;
import com.zuxia.entity.User;

public class UserService implements IUserService {
	private IUserDao userDao;

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean insert(User user) {
		return userDao.insert(user);
	}

	@Override
	public User getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

}
