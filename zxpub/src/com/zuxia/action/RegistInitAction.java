/**
 *******************************************************************************
 * RegistInitAction.java
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

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.service.IUserService;

/**
 * RegistInitAction��Ҫ˵��
 * 
 * 
 * @author �ĳ���
 */
public class RegistInitAction extends ActionSupport {
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

	@Override
	public String execute() throws Exception {
		ServletActionContext.getRequest().setAttribute("questionMasters",
				userService.getQuestionMaster());
		return "scucess";
	}
}
