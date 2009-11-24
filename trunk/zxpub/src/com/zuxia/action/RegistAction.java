package com.zuxia.action;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.xml.internal.security.Init;
import com.zuxia.entity.Password;
import com.zuxia.entity.SafeQuestion;
import com.zuxia.entity.User;
import com.zuxia.service.IUserService;

/**
 * RegistAction��Ҫ˵�� ����ע��
 * 
 * @author �ĳ���
 */
public class RegistAction extends ActionSupport {
	private IUserService userService;

	private User user = new User();

	private Password password = new Password();

	private SafeQuestion safeQuestion = new SafeQuestion();
	private ServletConfig config;

	/**
	 * config���Ե�get����
	 * 
	 * @return the config
	 */
	public ServletConfig getConfig() {
		return config;
	}

	/**
	 * config���Ե�set����
	 * 
	 * @param config
	 *            the config to set
	 */
	public void setConfig(ServletConfig config) {
		this.config = config;
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

	/**
	 * safeQuestion���Ե�get����
	 * 
	 * @return the safeQuestion
	 */
	public SafeQuestion getSafeQuestion() {
		return safeQuestion;
	}

	/**
	 * safeQuestion���Ե�set����
	 * 
	 * @param safeQuestion
	 *            the safeQuestion to set
	 */
	public void setSafeQuestion(SafeQuestion safeQuestion) {
		this.safeQuestion = safeQuestion;
	}

	@Override
	public String execute() throws Exception {
		boolean isRegist = userService.regist(user, password, safeQuestion);
		if (isRegist) {
			return "success";
		}
		return "error";
	}
}
