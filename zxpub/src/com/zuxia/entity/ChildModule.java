package com.zuxia.entity;

// Generated 2009-11-23 12:07:21 by Hibernate Tools 3.2.4.GA

/**
 * ChildModule generated by hbm2java
 */
public class ChildModule implements java.io.Serializable {

	private Integer childModuleCd;
	private Integer moduleCd;
	private String childModuleName;
	private Integer childModuleMasterCd;
	private String moduleComment;

	public ChildModule() {
	}

	public ChildModule(Integer moduleCd, String childModuleName,
			Integer childModuleMasterCd, String moduleComment) {
		this.moduleCd = moduleCd;
		this.childModuleName = childModuleName;
		this.childModuleMasterCd = childModuleMasterCd;
		this.moduleComment = moduleComment;
	}

	public Integer getChildModuleCd() {
		return this.childModuleCd;
	}

	public void setChildModuleCd(Integer childModuleCd) {
		this.childModuleCd = childModuleCd;
	}

	public Integer getModuleCd() {
		return this.moduleCd;
	}

	public void setModuleCd(Integer moduleCd) {
		this.moduleCd = moduleCd;
	}

	public String getChildModuleName() {
		return this.childModuleName;
	}

	public void setChildModuleName(String childModuleName) {
		this.childModuleName = childModuleName;
	}

	public Integer getChildModuleMasterCd() {
		return this.childModuleMasterCd;
	}

	public void setChildModuleMasterCd(Integer childModuleMasterCd) {
		this.childModuleMasterCd = childModuleMasterCd;
	}

	public String getModuleComment() {
		return this.moduleComment;
	}

	public void setModuleComment(String moduleComment) {
		this.moduleComment = moduleComment;
	}

}