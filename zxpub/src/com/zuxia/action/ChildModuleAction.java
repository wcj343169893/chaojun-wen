package com.zuxia.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.service.IChildModuleService;

public class ChildModuleAction extends ActionSupport {
	private IChildModuleService childModuleService;
	/**
	 * mCd���Ը��� �����Cd
	 */
	private int mCd;
	/**
	 * cmCd���Ը��� �Ӱ��Cd
	 */
	private int cmCd;

	/**
	 * cmCd���Ե�get����
	 * 
	 * @return the cmCd
	 */
	public int getCmCd() {
		return cmCd;
	}

	/**
	 * cmCd���Ե�set����
	 * 
	 * @param cmCd
	 *            the cmCd to set
	 */
	public void setCmCd(int cmCd) {
		this.cmCd = cmCd;
	}

	/**
	 * mCd���Ե�get����
	 * 
	 * @return the mCd
	 */
	public int getmCd() {
		return mCd;
	}

	/**
	 * mCd���Ե�set����
	 * 
	 * @param mCd
	 *            the mCd to set
	 */
	public void setmCd(int mCd) {
		this.mCd = mCd;
	}

	/**
	 * childModuleService���Ե�get����
	 * 
	 * @return the childModuleService
	 */
	public IChildModuleService getChildModuleService() {
		return childModuleService;
	}

	/**
	 * childModuleService���Ե�set����
	 * 
	 * @param childModuleService
	 *            the childModuleService to set
	 */
	public void setChildModuleService(IChildModuleService childModuleService) {
		this.childModuleService = childModuleService;
	}

	@Override
	public String execute() throws Exception {
		ServletActionContext.getRequest().setAttribute("childModules_db",
				childModuleService.getChildModulesByCmCd(this.cmCd));
		return "success";
	}
}
