package com.zuxia.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.entity.Password;
import com.zuxia.entity.User;
import com.zuxia.service.IUserService;

public class LoginAction extends ActionSupport {
	private IUserService userService;

	private User user;

	private Password password;

	private String validateCode;

	/**
	 * validateCode属性的get方法
	 * 
	 * @return the validateCode
	 */
	public String getValidateCode() {
		return validateCode;
	}

	/**
	 * validateCode属性的set方法
	 * 
	 * @param validateCode
	 *            the validateCode to set
	 */
	public void setValidateCode(String validateCode) {
		this.validateCode = validateCode;
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

	@Override
	public String execute() throws Exception {
		User u = userService.getUserByUserName(user.getUserName());
		HttpServletRequest request = ServletActionContext.getRequest();
		System.out.println(request.getRequestURI());
		System.out.println(request.getRequestURL());
		Object validate_session = request.getSession().getAttribute("validateCodeRecruit");
		System.out.println("validate_session:"+validate_session);
		if (!validate_session.equals(validateCode.toUpperCase())) {
			request.getSession().setAttribute("logerror", "验证码错误");
		} else if (u == null) {
			request.getSession().setAttribute("logerror", "用户名不存在");
		} else if (password.getPassword().equals(u.getPassword().getPassword())) {
			
			request.getSession().removeAttribute("logerror");
			request.getSession().setAttribute("users", u);
			System.out.println("验证登录通过");
			return "success";
		} else {
			request.getSession().setAttribute("logerror", "密码错误");
		}
		return "error";
	}
}
