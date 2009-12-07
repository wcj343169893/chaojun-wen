package com.zuxia.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.service.IChildModuleService;
import com.zuxia.service.INoteService;

public class NoteInitAction extends ActionSupport {
	private INoteService noteService;
	private IChildModuleService childModuleService;
	private int mCd;
	private int cmCd;
	private int p;

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
	 * p属性的get方法
	 * 
	 * @return the p
	 */
	public int getP() {
		return p;
	}

	/**
	 * p属性的set方法
	 * 
	 * @param p
	 *            the p to set
	 */
	public void setP(int p) {
		this.p = p;
	}

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

	@Override
	public String execute() throws Exception {
		ServletActionContext.getRequest().setAttribute("noteDTOs",
				noteService.getNoteDTOs(mCd, cmCd, p));
		ServletActionContext.getRequest().setAttribute("childModule",
				childModuleService.getChildModulesByCmCd(cmCd));
		return "success";
	}
}
