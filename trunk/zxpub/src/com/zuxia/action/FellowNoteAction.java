package com.zuxia.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.entity.User;
import com.zuxia.form.EditFellowNoteForm;
import com.zuxia.form.FellowNoteForm;
import com.zuxia.service.IFellowNoteService;

/**
 * NoteAction概要说明
 * 
 * 
 * @author 文朝军
 */
public class FellowNoteAction extends ActionSupport {
	/**
	 * serialVersionUID属性概述
	 * 
	 */
	private static final long serialVersionUID = -188481902986946432L;

	/**
	 * fellowNoteService属性概述
	 * 
	 */
	private IFellowNoteService fellowNoteService;
	private FellowNoteForm fellowNoteForm;
	private EditFellowNoteForm editFellowNoteForm;
	private int fellowNoteCd;

	/**
	 * editFellowNoteForm属性的get方法
	 * 
	 * @return the editFellowNoteForm
	 */
	public EditFellowNoteForm getEditFellowNoteForm() {
		return editFellowNoteForm;
	}

	/**
	 * editFellowNoteForm属性的set方法
	 * 
	 * @param editFellowNoteForm
	 *            the editFellowNoteForm to set
	 */
	public void setEditFellowNoteForm(EditFellowNoteForm editFellowNoteForm) {
		this.editFellowNoteForm = editFellowNoteForm;
	}

	/**
	 * fellowNoteCd属性的get方法
	 * 
	 * @return the fellowNoteCd
	 */
	public int getFellowNoteCd() {
		return fellowNoteCd;
	}

	/**
	 * fellowNoteCd属性的set方法
	 * 
	 * @param fellowNoteCd
	 *            the fellowNoteCd to set
	 */
	public void setFellowNoteCd(int fellowNoteCd) {
		this.fellowNoteCd = fellowNoteCd;
	}

	/**
	 * fellowNoteService属性的get方法
	 * 
	 * @return the fellowNoteService
	 */
	public IFellowNoteService getFellowNoteService() {
		return fellowNoteService;
	}

	/**
	 * fellowNoteService属性的set方法
	 * 
	 * @param fellowNoteService
	 *            the fellowNoteService to set
	 */
	public void setFellowNoteService(IFellowNoteService fellowNoteService) {
		this.fellowNoteService = fellowNoteService;
	}

	/**
	 * fellowNoteForm属性的get方法
	 * 
	 * @return the fellowNoteForm
	 */
	public FellowNoteForm getFellowNoteForm() {
		return fellowNoteForm;
	}

	/**
	 * fellowNoteForm属性的set方法
	 * 
	 * @param fellowNoteForm
	 *            the fellowNoteForm to set
	 */
	public void setFellowNoteForm(FellowNoteForm fellowNoteForm) {
		this.fellowNoteForm = fellowNoteForm;
	}

	/**
	 * addNote方法概述
	 * 
	 *增加帖子
	 * 
	 * @return
	 * @throws Exception
	 */
	public String add() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		fellowNoteService.addFellowNote(fellowNoteForm, (User) session
				.getAttribute("users"));
		return "success";
	}

	public String edit() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}

	public String editInit() throws Exception {
		HttpServletRequest requst = ServletActionContext.getRequest();
		requst.setAttribute("fellowNote", "");
		return super.execute();
	}

	public String delete() throws Exception {
		boolean flag = false;
		flag = fellowNoteService.deleteFellowNote(fellowNoteCd);
		return super.execute();
	}
}
