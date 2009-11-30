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

import org.apache.jasper.tagplugins.jstl.core.If;
import org.aspectj.weaver.patterns.IfPointcut.IfFalsePointcut;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.form.EditPwdForm;
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
	private EditPwdForm editPwdForm;

	/**
	 * editPwdForm���Ե�get����
	 * 
	 * @return the editPwdForm
	 */
	public EditPwdForm getEditPwdForm() {
		return editPwdForm;
	}

	/**
	 * editPwdForm���Ե�set����
	 * 
	 * @param editPwdForm
	 *            the editPwdForm to set
	 */
	public void setEditPwdForm(EditPwdForm editPwdForm) {
		this.editPwdForm = editPwdForm;
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
		boolean flag=userService.updateUser(editUserForm);
		if (!flag) {
			return "editUser";
		}
		return "success";
	}

	public String pwd() throws Exception {
		boolean flag = userService.updateUser(editPwdForm);
		if (!flag) {
			return "editPwd";
		}
		return "success";
	}
}
