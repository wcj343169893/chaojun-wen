package com.zuxia.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.common.PageInfo;
import com.zuxia.entity.Note;
import com.zuxia.service.INoteService;

public class NoteDetailInitAction extends ActionSupport {
	/**
	 * serialVersionUID属性概述
	 * 
	 */
	private static final long serialVersionUID = -1624408952103115716L;
	private INoteService noteService;
	private int noteCd;

	/**
	 * noteCd属性的get方法
	 * 
	 * @return the noteCd
	 */
	public int getNoteCd() {
		return noteCd;
	}

	/**
	 * noteCd属性的set方法
	 * 
	 * @param noteCd
	 *            the noteCd to set
	 */
	public void setNoteCd(int noteCd) {
		this.noteCd = noteCd;
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

	/**
	 * （重写方法） execute 初始化加载note详细信息表
	 * 
	 * @return
	 * @throws Exception
	 */
	@Override
	public String execute() throws Exception {
		PageInfo pageInfo = new PageInfo();
		pageInfo.setPageSize(10);
		pageInfo.setCurrentPage(1);
		ServletActionContext.getRequest().getSession().setAttribute("noteCd",
				noteCd);
		ServletActionContext.getRequest().setAttribute("noteDetailsDTO",
				noteService.getNoteDetailsDTO(noteCd, pageInfo));
		ServletActionContext.getRequest().getSession().setAttribute(
				"noteDetailsPageInfo", pageInfo);
		// 更新用户的点击point
		Note note = noteService.getOneNote(noteCd);
		return "success";
	}
}
