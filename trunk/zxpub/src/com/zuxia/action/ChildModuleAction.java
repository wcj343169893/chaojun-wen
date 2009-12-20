package com.zuxia.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.entity.ChildModule;
import com.zuxia.entity.Module;
import com.zuxia.entity.User;
import com.zuxia.service.IChildModuleService;
import com.zuxia.service.IUserService;

public class ChildModuleAction extends ActionSupport {
	private IChildModuleService childModuleService;
	private IUserService userService;
	/**
	 * mCd属性概述 主版块Cd
	 */
	private int mCd;
	/**
	 * cmCd属性概述 子版块Cd
	 */
	private int cmCd;
	private String childModuleName;
	private String moduleComment;
	private int uCd;

	@Override
	public String execute() throws Exception {
		ServletActionContext.getRequest().setAttribute("childModules_db",
				childModuleService.getChildModulesByCmCd(this.cmCd));
		return "success";
	}

	/**
	 * add方法概述 新增子版块
	 * 
	 * 
	 * @return
	 * @throws Exception
	 */
	public String add() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		ChildModule childModule = new ChildModule();
		User user = (User) request.getSession().getAttribute("users");
		if (user.getRoleCd()!=1) {
			return "success";
		}
		childModule.setUser(user);
		childModule.setChildModuleName(childModuleName);
		childModule.setModuleComment(moduleComment);

		Module module = new Module();
		module.setModuleCd(mCd);
		childModule.setModule(module);

		childModuleService.addChildModule(childModule);
		return "success";
	}

	/**
	 * edit方法概述 编辑子版块
	 * 
	 * 
	 * @return
	 * @throws Exception
	 */
	public String edit() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		ChildModule childModule = childModuleService
				.getChildModulesByCmCd(cmCd);
		childModule.setUser((User) request.getSession().getAttribute("users"));
		childModule.setChildModuleName(childModuleName);
		childModule.setModuleComment(moduleComment);
		childModuleService.updateChildModule(childModule);
		return "success";
	}

	public String editInit() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		ChildModule childModule = childModuleService
				.getChildModulesByCmCd(cmCd);
		request.setAttribute("childModule", childModule);
		return "edit";
	}

	public String delete() throws Exception {
		ChildModule childModule = childModuleService
				.getChildModulesByCmCd(cmCd);
		if (childModule.getUser().getUserCd() == uCd) {
			childModuleService.deleteChildModule(cmCd);
		}
		return "success";
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
	 * childModuleName属性的get方法
	 * 
	 * @return the childModuleName
	 */
	public String getChildModuleName() {
		return childModuleName;
	}

	/**
	 * childModuleName属性的set方法
	 * 
	 * @param childModuleName
	 *            the childModuleName to set
	 */
	public void setChildModuleName(String childModuleName) {
		this.childModuleName = childModuleName;
	}

	/**
	 * moduleComment属性的get方法
	 * 
	 * @return the moduleComment
	 */
	public String getModuleComment() {
		return moduleComment;
	}

	/**
	 * moduleComment属性的set方法
	 * 
	 * @param moduleComment
	 *            the moduleComment to set
	 */
	public void setModuleComment(String moduleComment) {
		this.moduleComment = moduleComment;
	}

	/**
	 * uCd属性的get方法
	 * 
	 * @return the uCd
	 */
	public int getuCd() {
		return uCd;
	}

	/**
	 * uCd属性的set方法
	 * 
	 * @param uCd
	 *            the uCd to set
	 */
	public void setuCd(int uCd) {
		this.uCd = uCd;
	}

	/**
	 * userService属性的get方法
	 * 
	 * @return the userService
	 */
	public IUserService getUserService() {
		return userService;
	}

	/**
	 * userService属性的set方法
	 * 
	 * @param userService
	 *            the userService to set
	 */
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

}
