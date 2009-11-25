package com.zuxia.service;

import com.zuxia.entity.Password;
import com.zuxia.entity.SafeQuestion;
import com.zuxia.entity.User;

public interface IUserService {
	public boolean insert(User user);
	public User getUserByUserName(String userName);
}
