package com.zuxia.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.service.IChildModuleService;

public class ChildModuleAction extends ActionSupport {
	private IChildModuleService childModuleService;

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
		// TODO Auto-generated method stub
		return super.execute();
	}
}
