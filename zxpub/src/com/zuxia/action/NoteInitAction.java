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
	 * childModuleService���Ե�get����
	 * 
	 * @return the childModuleService
	 */
	public IChildModuleService getChildModuleService() {
		return childModuleService;
	}

	/**
	 * childModuleService���Ե�set����
	 * 
	 * @param childModuleService
	 *            the childModuleService to set
	 */
	public void setChildModuleService(IChildModuleService childModuleService) {
		this.childModuleService = childModuleService;
	}

	/**
	 * mCd���Ե�get����
	 * 
	 * @return the mCd
	 */
	public int getmCd() {
		return mCd;
	}

	/**
	 * mCd���Ե�set����
	 * 
	 * @param mCd
	 *            the mCd to set
	 */
	public void setmCd(int mCd) {
		this.mCd = mCd;
	}

	/**
	 * cmCd���Ե�get����
	 * 
	 * @return the cmCd
	 */
	public int getCmCd() {
		return cmCd;
	}

	/**
	 * cmCd���Ե�set����
	 * 
	 * @param cmCd
	 *            the cmCd to set
	 */
	public void setCmCd(int cmCd) {
		this.cmCd = cmCd;
	}

	/**
	 * p���Ե�get����
	 * 
	 * @return the p
	 */
	public int getP() {
		return p;
	}

	/**
	 * p���Ե�set����
	 * 
	 * @param p
	 *            the p to set
	 */
	public void setP(int p) {
		this.p = p;
	}

	/**
	 * noteService���Ե�get����
	 * 
	 * @return the noteService
	 */
	public INoteService getNoteService() {
		return noteService;
	}

	/**
	 * noteService���Ե�set����
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
