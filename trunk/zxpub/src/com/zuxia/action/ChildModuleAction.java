package com.zuxia.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.service.IChildModuleService;

public class ChildModuleAction extends ActionSupport {
	private IChildModuleService childModuleService;
	/**
	 * mCd属性概述 主版块Cd
	 */
	private int mCd;
	/**
	 * cmCd属性概述 子版块Cd
	 */
	private int cmCd;

	/**
	 * cmCd属性的get方法
	 * 
	 * @return the cmCd
	 */
	public int getCmCd() {
		return cmCd;
	}

	/**
	 * cmCd属性的set方法
	 * 
	 * @param cmCd
	 *            the cmCd to set
	 */
	public void setCmCd(int cmCd) {
		this.cmCd = cmCd;
	}

	/**
	 * mCd属性的get方法
	 * 
	 * @return the mCd
	 */
	public int getmCd() {
		return mCd;
	}

	/**
	 * mCd属性的set方法
	 * 
	 * @param mCd
	 *            the mCd to set
	 */
	public void setmCd(int mCd) {
		this.mCd = mCd;
	}

	/**
	 * childModuleService属性的get方法
	 * 
	 * @return the childModuleService
	 */
	public IChildModuleService getChildModuleService() {
		return childModuleService;
	}

	/**
	 * childModuleService属性的set方法
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
