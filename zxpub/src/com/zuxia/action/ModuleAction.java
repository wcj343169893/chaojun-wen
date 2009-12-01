package com.zuxia.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.service.IModuleService;

public class ModuleAction extends ActionSupport {
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
		// TODO Auto-generated method stub
		return super.execute();
	}

	public String getModules() throws Exception {
		ServletActionContext.getRequest().setAttribute("modules_db",
				moduleService.getModules());
		return "success";
	}
}
