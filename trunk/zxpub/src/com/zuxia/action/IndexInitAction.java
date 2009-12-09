package com.zuxia.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.service.IModuleService;

public class IndexInitAction extends ActionSupport {
	/**
	 * serialVersionUID���Ը���
	 * 
	 */
	private static final long serialVersionUID = 6097902945696632625L;
	private IModuleService moduleService;

	/**
	 * moduleService���Ե�get����
	 * 
	 * @return the moduleService
	 */
	public IModuleService getModuleService() {
		return moduleService;
	}

	/**
	 * moduleService���Ե�set����
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
