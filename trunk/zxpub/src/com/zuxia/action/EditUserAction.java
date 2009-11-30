/**
 *******************************************************************************
 * EditUserAction.java
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

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.form.EditUserForm;
import com.zuxia.service.IUserService;

/**
 * EditUserAction概要说明
 * 
 * 
 * @author 文朝军
 */
public class EditUserAction extends ActionSupport {
	private EditUserForm editUserForm;
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

	/**
	 * editUserForm属性的get方法
	 * 
	 * @return the editUserForm
	 */
	public EditUserForm getEditUserForm() {
		return editUserForm;
	}

	/**
	 * editUserForm属性的set方法
	 * 
	 * @param editUserForm
	 *            the editUserForm to set
	 */
	public void setEditUserForm(EditUserForm editUserForm) {
		this.editUserForm = editUserForm;
	}

	@Override
	public String execute() throws Exception {
		userService.updateUser(editUserForm);
		return super.execute();
	}
}
