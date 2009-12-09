package com.zuxia.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.entity.User;
import com.zuxia.service.IUserService;

public class LoginAction extends ActionSupport {
	/**
	 * serialVersionUID���Ը���
	 * 
	 */
	private static final long serialVersionUID = -2850961552303905001L;

	private IUserService userService;

	private String userName;
	private String password;

	/**
	 * userName���Ե�get����
	 * 
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * userName���Ե�set����
	 * 
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * password���Ե�set����
	 * 
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

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

	@Override
	public String execute() throws Exception {
		User u = userService.getUserByUserName(userName);
		HttpServletRequest request = ServletActionContext.getRequest();
		Object validate_session = request.getSession().getAttribute(
				"validateCodeRecruit");
		if (!validate_session.equals(validateCode.toUpperCase())) {
			request.getSession().setAttribute("logerror", "��֤�����");
		} else if (u == null) {
			request.getSession().setAttribute("logerror", "�û���������");
		} else if (password.equals(u.getPassword().getPassword())) {
			// �޸��û���¼ʱ��
			u.setLastLoginDate(new Date());
			request.getSession().removeAttribute("logerror");
			request.getSession().setAttribute("users", u);
			userService.updateUser(u);
			return "success";
		} else {
			request.getSession().setAttribute("logerror", "�������");
		}
		return "error";
	}

	public String out() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		request.getSession().removeAttribute("users");
		return "logout";
	}
}
