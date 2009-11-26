package com.zuxia.entity;

/**
 * ChildModule概要说明
 * 
 * 
 * @author 文朝军
 */
public class ChildModule implements java.io.Serializable {

	private Integer childModuleCd;
	/**
	 * module属性概述 主版块
	 */
	private Module module;
	private String childModuleName;
	private String moduleComment;
	private User user;

	/**
	 * user属性的get方法
	 * 
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * user属性的set方法
	 * 
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * childModuleCd属性的get方法
	 * 
	 * @return the childModuleCd
	 */
	public Integer getChildModuleCd() {
		return childModuleCd;
	}

	/**
	 * childModuleCd属性的set方法
	 * 
	 * @param childModuleCd
	 *            the childModuleCd to set
	 */
	public void setChildModuleCd(Integer childModuleCd) {
		this.childModuleCd = childModuleCd;
	}

	/**
	 * module属性的get方法
	 * 
	 * @return the module
	 */
	public Module getModule() {
		return module;
	}

	/**
	 * module属性的set方法
	 * 
	 * @param module
	 *            the module to set
	 */
	public void setModule(Module module) {
		this.module = module;
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

}
