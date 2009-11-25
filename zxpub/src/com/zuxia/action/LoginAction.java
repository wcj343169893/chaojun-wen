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
	 * validateCode���Ե�get����
	 * 
	 * @return the validateCode
	 */
	public String getValidateCode() {
		return validateCode;
	}

	/**
	 * validateCode���Ե�set����
	 * 
	 * @param validateCode
	 *            the validateCode to set
	 */
	public void setValidateCode(String validateCode) {
		this.validateCode = validateCode;
	}

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
		User u = userService.getUserByUserName(user.getUserName());
		HttpServletRequest request = ServletActionContext.getRequest();
		System.out.println(request.getRequestURI());
		System.out.println(request.getRequestURL());
		Object validate_session = request.getSession().getAttribute("validateCodeRecruit");
		System.out.println("validate_session:"+validate_session);
		if (!validate_session.equals(validateCode.toUpperCase())) {
			request.getSession().setAttribute("logerror", "��֤�����");
		} else if (u == null) {
			request.getSession().setAttribute("logerror", "�û���������");
		} else if (password.getPassword().equals(u.getPassword().getPassword())) {
			
			request.getSession().removeAttribute("logerror");
			request.getSession().setAttribute("users", u);
			System.out.println("��֤��¼ͨ��");
			return "success";
		} else {
			request.getSession().setAttribute("logerror", "�������");
		}
		return "error";
	}
}
