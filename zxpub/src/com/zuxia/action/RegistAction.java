package com.zuxia.action;

import java.io.File;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.entity.Password;
import com.zuxia.entity.SafeQuestion;
import com.zuxia.entity.User;
import com.zuxia.service.IUserService;

/**
 * RegistAction概要说明 处理注册
 * 
 * @author 文朝军
 */
public class RegistAction extends ActionSupport {
	/**
	 * serialVersionUID属性概述
	 * 
	 */
	private static final long serialVersionUID = 1445290649313491318L;

	private IUserService userService;

	private User user;

	private Password password;

	private SafeQuestion safeQuestion;

	private String password2;
	/**
	 * uploadFileName属性概述 actionSuppet 隐含属性 ,专门获取上传文件的文件名
	 */
	private String photoFileName;

	/**
	 * photo属性概述 头像
	 */
	private File photo;

	/**
	 * photoFileName属性的get方法
	 * 
	 * @return the photoFileName
	 */
	public String getPhotoFileName() {
		return photoFileName;
	}

	/**
	 * photoFileName属性的set方法
	 * 
	 * @param photoFileName
	 *            the photoFileName to set
	 */
	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}

	/**
	 * photo属性的get方法
	 * 
	 * @return the photo
	 */
	public File getPhoto() {
		return photo;
	}

	/**
	 * photo属性的set方法
	 * 
	 * @param photo
	 *            the photo to set
	 */
	public void setPhoto(File photo) {
		this.photo = photo;
	}

	/**
	 * password2属性的get方法
	 * 
	 * @return the password2
	 */
	public String getPassword2() {
		return password2;
	}

	/**
	 * password2属性的set方法
	 * 
	 * @param password2
	 *            the password2 to set
	 */
	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	/**
	 * userService属性的get方法
	 * 
	 * @return the userService
	 */
	public IUserService getUserService() {
		return userService;
	}

	/**
	 * userService属性的set方法
	 * 
	 * @param userService
	 *            the userService to set
	 */
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	/**
	 * user属性的get方法
	 * 
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * user属性的set方法
	 * 
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * password属性的get方法
	 * 
	 * @return the password
	 */
	public Password getPassword() {
		return password;
	}

	/**
	 * password属性的set方法
	 * 
	 * @param password
	 *            the password to set
	 */
	public void setPassword(Password password) {
		this.password = password;
	}

	/**
	 * safeQuestion属性的get方法
	 * 
	 * @return the safeQuestion
	 */
	public SafeQuestion getSafeQuestion() {
		return safeQuestion;
	}

	/**
	 * safeQuestion属性的set方法
	 * 
	 * @param safeQuestion
	 *            the safeQuestion to set
	 */
	public void setSafeQuestion(SafeQuestion safeQuestion) {
		this.safeQuestion = safeQuestion;
	}

	@Override
	public String execute() throws Exception {
		password.setUser(user);
		user.setPassword(password);
		user.setRegistDate(new Date());
		user.setScore(0);
		user.setRoleCd(0);
		user.setSafeQuestion(safeQuestion);
		safeQuestion.setUser(user);
		if (photoFileName != null) {
			String fileName = user.getUserName()
					+ photoFileName.substring(photoFileName.indexOf("."),
							photoFileName.length());
			user.setPhotoPath(fileName);
		}
		boolean isRegist = userService.insert(user, photo);
		if (isRegist) {
			return "success";
		}
		return "error";
	}
}
