package com.zuxia.action;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.entity.Note;
import com.zuxia.entity.User;
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
	private Note note;
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
	 * note属性的get方法
	 * 
	 * @return the note
	 */
	public Note getNote() {
		return note;
	}

	/**
	 * note属性的set方法
	 * 
	 * @param note
	 *            the note to set
	 */
	public void setNote(Note note) {
		this.note = note;
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
		HttpSession session = ServletActionContext.getRequest().getSession();
		note.setUser((User) session.getAttribute("users"));
		note.setPublishDate(new Date());
		boolean flag = noteService.addNote(note);
		System.out.println(flag);
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
		ServletActionContext.getRequest().setAttribute("note", noteService.getOneNote(noteCd));
		return "showNote";
	}
}
