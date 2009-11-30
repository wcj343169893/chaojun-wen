/**
 *******************************************************************************
 * EditUserAction.java
 *
 * (c) Copyright 2009 WenChaojun
 *
 *��������������
 *  zxpub(������̳)
 *�����ܸ�Ҫ��
 *  XXX
 *�����ߣ�
 *  �ĳ���
 *******************************************************************************
 */
package com.zuxia.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.form.EditUserForm;
import com.zuxia.service.IUserService;

/**
 * EditUserAction��Ҫ˵��
 * 
 * 
 * @author �ĳ���
 */
public class EditUserAction extends ActionSupport {
	private EditUserForm editUserForm;
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
	 * editUserForm���Ե�get����
	 * 
	 * @return the editUserForm
	 */
	public EditUserForm getEditUserForm() {
		return editUserForm;
	}

	/**
	 * editUserForm���Ե�set����
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
