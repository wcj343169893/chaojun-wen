package com.zuxia.dao;

import com.zuxia.entity.Password;
import com.zuxia.entity.SafeQuestion;
import com.zuxia.entity.User;

public interface IUserDao {
	/**
	 * regist��������
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
	 * getUserByUserName��������
	 * 
	 *
	 * @param userName
	 * @return
	 */
	public User getUserByUserName(String userName);
}
