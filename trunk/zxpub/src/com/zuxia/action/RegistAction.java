package com.zuxia.action;

import java.io.File;
import java.util.Date;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.entity.Password;
import com.zuxia.entity.SafeQuestion;
import com.zuxia.entity.User;
import com.zuxia.form.RegistForm;
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
	private RegistForm registForm;

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
	 * registForm属性的get方法
	 * 
	 * @return the registForm
	 */
	public RegistForm getRegistForm() {
		return registForm;
	}

	/**
	 * registForm属性的set方法
	 * 
	 * @param registForm
	 *            the registForm to set
	 */
	public void setRegistForm(RegistForm registForm) {
		this.registForm = registForm;
	}

	@Override
	public String execute() throws Exception {
		boolean isRegist = userService.insert(registForm);
		if (isRegist) {
			return "success";
		}
		return "error";
	}
}
