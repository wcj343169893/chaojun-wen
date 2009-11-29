package com.zuxia.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * ChildModule概要说明
 * 
 * 
 * @author 文朝军
 */
public class ChildModule implements java.io.Serializable {

	/**
	 * serialVersionUID属性概述
	 * 
	 */
	private static final long serialVersionUID = 4918263731915786834L;
	private Integer childModuleCd;
	/**
	 * module属性概述 主版块
	 */
	private Module module;
	private String childModuleName;
	private String moduleComment;
	private User user;
	/**
	 * notes属性概述 主贴
	 */
	private List<Note> notes = new ArrayList<Note>();

	/**
	 * notes属性的get方法
	 * 
	 * @return the notes
	 */
	public List<Note> getNotes() {
		return notes;
	}

	/**
	 * notes属性的set方法
	 * 
	 * @param notes
	 *            the notes to set
	 */
	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

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
