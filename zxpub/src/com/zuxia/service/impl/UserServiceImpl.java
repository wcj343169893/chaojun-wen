package com.zuxia.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.zuxia.dao.IQuestionMasterDao;
import com.zuxia.dao.IUserDao;
import com.zuxia.entity.City;
import com.zuxia.entity.Password;
import com.zuxia.entity.Province;
import com.zuxia.entity.QuestionMaster;
import com.zuxia.entity.User;
import com.zuxia.form.EditPwdForm;
import com.zuxia.form.EditUserForm;
import com.zuxia.form.RegistForm;
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
	public boolean insert(RegistForm registForm) {
		User user_db = this.getUserByUserName(registForm.getUserName());
		if (user_db != null) {
			ServletActionContext.getRequest().getSession().setAttribute(
					"userexist", "用户已经存在");
			return false;
		}
		ServletActionContext.getRequest().getSession().removeAttribute(
				"userexist");
		User user = new User();
		user.setRegistDate(new Date());
		user.setScore(2);
		user.setUserName(registForm.getUserName());
		user.setBirthday(registForm.getBirthday());
		Password password = new Password();
		password.setPassword(registForm.getPassword());
		password.setUser(user);
		user.setPassword(password);
		City city = new City();
		city.setCityCd(registForm.getCityCd());
		user.setCity(city);
		Province province = new Province();
		province.setProvinceCd(registForm.getProvinceCd());
		user.setProvince(province);
		user.setSex(registForm.getSex());
		user.setEmail(registForm.getEmail());
		if (registForm.getPhotoFileName() != null) {
			String fileName = user.getUserName()
					+ registForm.getPhotoFileName().substring(
							registForm.getPhotoFileName().indexOf("."),
							registForm.getPhotoFileName().length());
			user.setPhotoPath(fileName);
		}
		if (registForm.getPhoto() != null) {
			String filePath = ServletActionContext.getServletContext()
					.getRealPath("/")
					+ "head\\" + user.getPhotoPath();
			SaveFile(registForm.getPhoto(), filePath);
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
		user.setComment(editUserForm.getComment());
		user.setEmail(editUserForm.getEmail());
		Province province = new Province();
		province.setProvinceCd(editUserForm.getProvinceCd());
		user.setProvince(province);
		City city = new City();
		city.setCityCd(editUserForm.getCityCd());
		user.setCity(city);
		if (editUserForm.getPhotoFileName() != null) {
			String fileName = user.getUserName()
					+ editUserForm.getPhotoFileName().substring(
							editUserForm.getPhotoFileName().indexOf("."),
							editUserForm.getPhotoFileName().length());
			user.setPhotoPath(fileName);
		}
		if (editUserForm.getPhoto() != null) {
			String filePath = ServletActionContext.getServletContext()
					.getRealPath("/")
					+ "head\\" + user.getPhotoPath();
			SaveFile(editUserForm.getPhoto(), filePath);
		}
		return userDao.updateUser(user);

	}

	@Override
	public boolean updateUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public boolean updateUser(EditPwdForm editPwdForm) {
		HttpServletRequest request = ServletActionContext.getRequest();
		if (!editPwdForm.getNewPwd().equals(editPwdForm.getNewPwd2())) {
			request.setAttribute("editPwdError", "两次密码输入不一致");
			return false;
		}
		User user = (User) request.getSession().getAttribute("users");
		if (!user.getPassword().getPassword().equals(editPwdForm.getOldPwd())) {
			request.setAttribute("editPwdError", "原密码不正确");
			return false;
		} else {
			Password password = user.getPassword();
			password.setPassword(editPwdForm.getNewPwd());
			// password.setUser(user);
			user.setPassword(password);
			return userDao.updateUser(user);
		}
	}

}
