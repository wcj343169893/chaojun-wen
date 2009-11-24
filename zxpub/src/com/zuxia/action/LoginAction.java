package com.zuxia.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.entity.Password;
import com.zuxia.entity.SafeQuestion;
import com.zuxia.entity.User;
import com.zuxia.service.IUserService;

/**
 * RegistAction��Ҫ˵�� ����ע��
 * 
 * @author �ĳ���
 */
public class LoginAction extends ActionSupport {
	private User user;
	private Password password;
	private IUserService userService;

	/**
	 * userService���Ե�get����
	 * 
	 * @return the userService
	 */
	public IUserService getUserService() {
		return userService;
	}

	/**
	 * userService���Ե�set����
	 * 
	 * @param userService
	 *            the userService to set
	 */
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	/**
	 * user���Ե�get����
	 * 
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * user���Ե�set����
	 * 
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * password���Ե�get����
	 * 
	 * @return the password
	 */
	public Password getPassword() {
		return password;
	}

	/**
	 * password���Ե�set����
	 * 
	 * @param password
	 *            the password to set
	 */
	public void setPassword(Password password) {
		this.password = password;
	}

	@Override
	public String execute() throws Exception {
		User user_login = userService.getUserByUserName(user.getUserName());
		if (user_login == null) {
			return "error";
		}
		if (!password.getPassword().equals(
				user_login.getPassword().getPassword())) {
			return "error";
		}
		return "success";
	}

}
