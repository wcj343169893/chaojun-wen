package com.zuxia.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.entity.User;
import com.zuxia.form.AddNoteForm;
import com.zuxia.service.INoteService;

/**
 * NoteAction概要说明
 * 
 * 
 * @author 文朝军
 */
public class NoteAction extends ActionSupport {
	/**
	 * serialVersionUID属性概述
	 * 
	 */
	private static final long serialVersionUID = -188481902986946432L;
	private INoteService noteService;
	private AddNoteForm addNoteForm;
	/**
	 * noteCd属性概述 note标识列
	 */
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
	 * addNoteForm属性的get方法
	 * 
	 * @return the addNoteForm
	 */
	public AddNoteForm getAddNoteForm() {
		return addNoteForm;
	}

	/**
	 * addNoteForm属性的set方法
	 * 
	 * @param addNoteForm
	 *            the addNoteForm to set
	 */
	public void setAddNoteForm(AddNoteForm addNoteForm) {
		this.addNoteForm = addNoteForm;
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
	 * addNote方法概述
	 * 
	 *增加帖子
	 * 
	 * @return
	 * @throws Exception
	 */
	public String add() throws Exception {
		boolean flag = false;
		if (addNoteForm.getTitle() != "" && addNoteForm.getContent() != "") {
			HttpSession session = ServletActionContext.getRequest()
					.getSession();
			flag = noteService.addNote(this.addNoteForm, (User) session
					.getAttribute("users"));
		}
		if (!flag) {
			return "adderror";
		}
		return "success";
	}

	public String edit() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}

	public String delete() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}

	public String show() throws Exception {
		ServletActionContext.getRequest().setAttribute("note",
				noteService.getOneNote(noteCd));
		return "showNote";
	}
}
