/**
 *******************************************************************************
 * UserDetailInitAction.java
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
 * UserDetailInitAction概要说明
 * 
 * 
 * @author 文朝军
 */
public class UserDetailInitAction extends ActionSupport {
	private IUserService userService;
	private String userName;

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
	 * （重写方法） execute方法概述
	 * 
	 *初始化用户信息
	 * 
	 * @return
	 * @throws Exception
	 */
	@Override
	public String execute() throws Exception {
		ServletActionContext.getRequest().setAttribute("userdetail",
				userService.getUserByUserName(userName));
		return super.execute();
	}
}
