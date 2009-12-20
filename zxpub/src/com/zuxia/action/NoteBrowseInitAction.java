package com.zuxia.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.common.PageInfo;
import com.zuxia.service.IChildModuleService;
import com.zuxia.service.INoteService;

/**
 * NoteBrowseInitAction ����һ��
 * 
 * 
 * @author �ĳ���
 */
public class NoteBrowseInitAction extends ActionSupport {
	/**
	 * serialVersionUID���Ը���
	 * 
	 */
	private static final long serialVersionUID = -3091169422319968791L;
	private INoteService noteService;
	private IChildModuleService childModuleService;
	private int mCd;
	private int cmCd;

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
