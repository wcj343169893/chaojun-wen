package com.zuxia.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.entity.User;
import com.zuxia.service.IUserService;

public class LoginAction extends ActionSupport {
	/**
	 * serialVersionUID属性概述
	 * 
	 */
	private static final long serialVersionUID = -2850961552303905001L;

	private IUserService userService;

	private String userName;
	private String password;

	/**
	 * userName属性的get方法
	 * 
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * userName属性的set方法
	 * 
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * password属性的set方法
	 * 
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

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

	@Override
	public String execute() throws Exception {
		User u = userService.getUserByUserName(userName);
		HttpServletRequest request = ServletActionContext.getRequest();
		Object validate_session = request.getSession().getAttribute(
				"validateCodeRecruit");
		if (!validate_session.equals(validateCode.toUpperCase())) {
			request.getSession().setAttribute("logerror", "验证码错误");
		} else if (u == null) {
			request.getSession().setAttribute("logerror", "用户名不存在");
		} else if (password.equals(u.getPassword().getPassword())) {
			// 修改用户登录时间
			u.setLastLoginDate(new Date());
			request.getSession().removeAttribute("logerror");
			request.getSession().setAttribute("users", u);
			userService.updateUser(u);
			return "success";
		} else {
			request.getSession().setAttribute("logerror", "密码错误");
		}
		return "error";
	}

	public String out() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		request.getSession().removeAttribute("users");
		return "logout";
	}
}
