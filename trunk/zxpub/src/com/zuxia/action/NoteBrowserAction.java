package com.zuxia.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.common.EPage;
import com.zuxia.common.PageInfo;
import com.zuxia.service.IChildModuleService;
import com.zuxia.service.INoteService;

public class NoteBrowserAction extends ActionSupport {
	/**
	 * serialVersionUID属性概述
	 * 
	 */
	private static final long serialVersionUID = -1629587697600611413L;
	private INoteService noteService;
	private IChildModuleService childModuleService;
	private int gotoPage;

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
	 * gotoPage属性的get方法
	 * 
	 * @return the gotoPage
	 */
	public int getGotoPage() {
		return gotoPage;
	}

	/**
	 * gotoPage属性的set方法
	 * 
	 * @param gotoPage
	 *            the gotoPage to set
	 */
	public void setGotoPage(int gotoPage) {
		this.gotoPage = gotoPage;
	}

	public String nextPage() throws Exception {
		anyOnePage(1, EPage.next);
		return "success";
	}

	public String backPage() throws Exception {
		anyOnePage(-1, EPage.back);
		return "success";
	}

	public String firstPage() throws Exception {
		anyOnePage(1, EPage.first);
		return "success";
	}

	public String lastPage() throws Exception {
		anyOnePage(1, EPage.last);
		return "success";
	}

	public String goPage() throws Exception {
		anyOnePage(gotoPage, EPage.go);
		return "success";
	}

	public void anyOnePage(int pages, EPage epage) {
		PageInfo pageInfo = (PageInfo) ServletActionContext.getRequest()
				.getSession().getAttribute("noteBrowsePageInfo");
		if (epage.equals(EPage.back) || epage.equals(EPage.next)) {
			pageInfo.setCurrentPage(pageInfo.getCurrentPage() + pages);
		} else if (epage.equals(EPage.first)) {
			pageInfo.setCurrentPage(1);
		} else if (epage.equals(EPage.last)) {
			pageInfo.setCurrentPage(pageInfo.getPageCount());
		} else {
			pageInfo.setCurrentPage(pages);
		}
		int childModuleCd = Integer.valueOf(ServletActionContext.getRequest()
				.getSession().getAttribute("childModuleCd").toString());
		int moduleCd = Integer.valueOf(ServletActionContext.getRequest()
				.getSession().getAttribute("mduleCd").toString());
		ServletActionContext.getRequest().setAttribute("noteDTOs",
				noteService.getNoteDTOs(moduleCd, childModuleCd, pageInfo));
		ServletActionContext.getRequest().setAttribute("childModule",
				childModuleService.getChildModulesByCmCd(childModuleCd));
		ServletActionContext.getRequest().getSession().setAttribute(
				"noteBrowsePageInfo", pageInfo);
	}
}
