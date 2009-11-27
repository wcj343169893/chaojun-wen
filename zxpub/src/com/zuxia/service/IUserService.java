package com.zuxia.service;

import java.io.File;

import com.zuxia.entity.User;

public interface IUserService {
	public boolean insert(User user,File upload);

	public User getUserByUserName(String userName);

	public boolean deleteUserByName(String name);

	public boolean updateUser(User user);
}
