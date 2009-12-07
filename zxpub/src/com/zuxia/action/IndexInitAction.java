package com.zuxia.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.service.IModuleService;

public class IndexInitAction extends ActionSupport {
	private IModuleService moduleService;

	/**
	 * moduleService属性的get方法
	 * 
	 * @return the moduleService
	 */
	public IModuleService getModuleService() {
		return moduleService;
	}

	/**
	 * moduleService属性的set方法
	 * 
	 * @param moduleService
	 *            the moduleService to set
	 */
	public void setModuleService(IModuleService moduleService) {
		this.moduleService = moduleService;
	}

	@Override
	public String execute() throws Exception {
		ServletActionContext.getRequest().setAttribute("moduleDTOList",
				moduleService.getModuleDTOList());
		return "success";
	}
}
