package com.zuxia.dao;

import com.zuxia.entity.Password;
import com.zuxia.entity.SafeQuestion;
import com.zuxia.entity.User;

public interface IUserDao {
	/**
	 * regist方法概述
	 * 
	 *
	 * @param user
	 * @param password
	 * @param safeQuestion
	 * @return
	 */
	public boolean regist(User user, Password password,
			SafeQuestion safeQuestion);

	/**
	 * getUserByUserName方法概述
	 * 
	 *
	 * @param userName
	 * @return
	 */
	public User getUserByUserName(String userName);
}
