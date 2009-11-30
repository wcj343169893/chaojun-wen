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
 * RegistAction��Ҫ˵�� ����ע��
 * 
 * @author �ĳ���
 */
public class RegistAction extends ActionSupport {
	/**
	 * serialVersionUID���Ը���
	 * 
	 */
	private static final long serialVersionUID = 1445290649313491318L;

	private IUserService userService;
	private RegistForm registForm;

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
	 * registForm���Ե�get����
	 * 
	 * @return the registForm
	 */
	public RegistForm getRegistForm() {
		return registForm;
	}

	/**
	 * registForm���Ե�set����
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
