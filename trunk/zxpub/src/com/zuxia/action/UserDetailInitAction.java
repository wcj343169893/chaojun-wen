/**
 *******************************************************************************
 * UserDetailInitAction.java
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
 * UserDetailInitAction��Ҫ˵��
 * 
 * 
 * @author �ĳ���
 */
public class UserDetailInitAction extends ActionSupport {
	private IUserService userService;
	private String userName;

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
	 * ����д������ execute��������
	 * 
	 *��ʼ���û���Ϣ
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
