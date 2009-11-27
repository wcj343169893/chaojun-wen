package com.zuxia.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.struts2.ServletActionContext;

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
	public boolean insert(User user, File upload) {
		if (upload != null) {
			String filePath = ServletActionContext.getServletContext()
					.getRealPath("/")
					+ "head\\" + user.getPhotoPath();
			System.out.println(filePath);
			SaveFile(upload, filePath);
		}
		return userDao.insert(user);
	}

	public void SaveFile(File upload, String filePath) {
		try {
			FileOutputStream fos = new FileOutputStream(new File(filePath));
			FileInputStream fis = new FileInputStream(upload);
			byte[] buffer = new byte[1024];
			while (fis.read(buffer) > 0) {
				fos.write(buffer);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public User getUserByUserName(String userName) {
		return userDao.getUserByUserName(userName);
	}

	@Override
	public boolean deleteUserByName(String name) {
		return userDao.deleteUserByName(name);
	}

	@Override
	public boolean updateUser(User user) {
		return userDao.updateUser(user);
	}

}
