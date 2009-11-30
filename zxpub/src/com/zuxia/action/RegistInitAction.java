/**
 *******************************************************************************
 * RegistInitAction.java
 *
 * (c) Copyright 2009 WenChaojun
 *
 *＜所属工程名＞
 *  zxpub(足下论坛)
 *＜功能概要＞
 *  XXX
 *＜作者＞
 *  文朝军
 *******************************************************************************
 */
package com.zuxia.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.service.IUserService;

/**
 * RegistInitAction概要说明
 * 
 * 
 * @author 文朝军
 */
public class RegistInitAction extends ActionSupport {
	private IUserService userService;

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
		ServletActionContext.getRequest().setAttribute("questionMasters",
				userService.getQuestionMaster());
		return "scucess";
	}
}
