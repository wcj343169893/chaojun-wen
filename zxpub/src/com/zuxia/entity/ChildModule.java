package com.zuxia.entity;

/**
 * ChildModule��Ҫ˵��
 * 
 * 
 * @author �ĳ���
 */
public class ChildModule implements java.io.Serializable {

	private Integer childModuleCd;
	/**
	 * module���Ը��� �����
	 */
	private Module module;
	private String childModuleName;
	private String moduleComment;
	private User user;

	/**
	 * user���Ե�get����
	 * 
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * user���Ե�set����
	 * 
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * childModuleCd���Ե�get����
	 * 
	 * @return the childModuleCd
	 */
	public Integer getChildModuleCd() {
		return childModuleCd;
	}

	/**
	 * childModuleCd���Ե�set����
	 * 
	 * @param childModuleCd
	 *            the childModuleCd to set
	 */
	public void setChildModuleCd(Integer childModuleCd) {
		this.childModuleCd = childModuleCd;
	}

	/**
	 * module���Ե�get����
	 * 
	 * @return the module
	 */
	public Module getModule() {
		return module;
	}

	/**
	 * module���Ե�set����
	 * 
	 * @param module
	 *            the module to set
	 */
	public void setModule(Module module) {
		this.module = module;
	}

	/**
	 * childModuleName���Ե�get����
	 * 
	 * @return the childModuleName
	 */
	public String getChildModuleName() {
		return childModuleName;
	}

	/**
	 * childModuleName���Ե�set����
	 * 
	 * @param childModuleName
	 *            the childModuleName to set
	 */
	public void setChildModuleName(String childModuleName) {
		this.childModuleName = childModuleName;
	}

	/**
	 * moduleComment���Ե�get����
	 * 
	 * @return the moduleComment
	 */
	public String getModuleComment() {
		return moduleComment;
	}

	/**
	 * moduleComment���Ե�set����
	 * 
	 * @param moduleComment
	 *            the moduleComment to set
	 */
	public void setModuleComment(String moduleComment) {
		this.moduleComment = moduleComment;
	}

}
