package com.zuxia.dao;

import com.zuxia.entity.Password;
import com.zuxia.entity.SafeQuestion;
import com.zuxia.entity.User;

public interface IUserDao {

	/**
	 * insert��������
	 * 
	 * 
	 * @param user
	 * @return
	 */
	public boolean insert(User user);

	/**
	 * getUserByUserName��������
	 * 
	 * 
	 * @param userName
	 * @return
	 */
	public User getUserByUserName(String userName);

	public boolean deleteUserByName(String name);

	public boolean updateUser(User user);
}
