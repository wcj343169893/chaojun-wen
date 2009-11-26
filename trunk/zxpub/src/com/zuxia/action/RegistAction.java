package com.zuxia.action;

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
		boolean isRegist = userService.insert(user);
		if (isRegist) {
			return "success";
		}
		return "error";
	}
}
