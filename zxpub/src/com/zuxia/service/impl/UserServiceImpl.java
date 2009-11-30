package com.zuxia.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.zuxia.dao.IQuestionMasterDao;
import com.zuxia.dao.IUserDao;
import com.zuxia.entity.QuestionMaster;
import com.zuxia.entity.User;
import com.zuxia.form.EditUserForm;
import com.zuxia.service.IUserService;

/**
 * UserServiceImpl概要说明
 * 
 * 
 * @author 文朝军
 */
public class UserServiceImpl implements IUserService {
	private IQuestionMasterDao questionMasterDao;
	private IUserDao userDao;

	/**
	 * questionMasterDao属性的get方法
	 * 
	 * @return the questionMasterDao
	 */
	public IQuestionMasterDao getQuestionMasterDao() {
		return questionMasterDao;
	}

	/**
	 * questionMasterDao属性的set方法
	 * 
	 * @param questionMasterDao
	 *            the questionMasterDao to set
	 */
	public void setQuestionMasterDao(IQuestionMasterDao questionMasterDao) {
		this.questionMasterDao = questionMasterDao;
	}

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
			SaveFile(upload, filePath);
		}
		return userDao.insert(user);
	}

	/**
	 * SaveFile方法概述
	 * 
	 *保存文件
	 * 
	 * @param upload
	 * @param filePath
	 */
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
	public List<QuestionMaster> getQuestionMaster() {
		return questionMasterDao.getQuestionMaster();
	}

	@Override
	public boolean updateUser(EditUserForm editUserForm) {
		User user = (User) ServletActionContext.getRequest().getSession()
				.getAttribute("users");
		user.setBirthday(editUserForm.getBirthday());
		return false;
	}

}
