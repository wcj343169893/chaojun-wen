package com.zuxia.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.common.PageInfo;
import com.zuxia.service.IChildModuleService;
import com.zuxia.service.INoteService;

/**
 * NoteBrowseInitAction 帖子一览
 * 
 * 
 * @author 文朝军
 */
public class NoteBrowseInitAction extends ActionSupport {
	/**
	 * serialVersionUID属性概述
	 * 
	 */
	private static final long serialVersionUID = -3091169422319968791L;
	private INoteService noteService;
	private IChildModuleService childModuleService;
	private int mCd;
	private int cmCd;

	/**
	 * noteService属性的get方法
	 * 
	 * @return the noteService
	 */
	public INoteService getNoteService() {
		return noteService;
	}

	/**
	 * noteService属性的set方法
	 * 
	 * @param noteService
	 *            the noteService to set
	 */
	public void setNoteService(INoteService noteService) {
		this.noteService = noteService;
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

	@Override
	public String execute() throws Exception {
		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(1);
		pageInfo.setPageSize(10);
		ServletActionContext.getRequest().getSession().setAttribute("childModuleCd", this.cmCd);
		ServletActionContext.getRequest().getSession().setAttribute("mduleCd", this.mCd);
		ServletActionContext.getRequest().setAttribute("noteDTOs",
				noteService.getNoteDTOs(mCd, cmCd, pageInfo));
		ServletActionContext.getRequest().setAttribute("childModule",
				childModuleService.getChildModulesByCmCd(cmCd));
		ServletActionContext.getRequest().getSession().setAttribute("noteBrowsePageInfo", pageInfo);
		return "success";
	}
}
