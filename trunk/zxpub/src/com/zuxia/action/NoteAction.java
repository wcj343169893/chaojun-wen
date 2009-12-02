package com.zuxia.action;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.entity.Note;
import com.zuxia.entity.User;
import com.zuxia.service.INoteService;

/**
 * NoteAction��Ҫ˵��
 * 
 * 
 * @author �ĳ���
 */
public class NoteAction extends ActionSupport {
	/**
	 * serialVersionUID���Ը���
	 * 
	 */
	private static final long serialVersionUID = -188481902986946432L;
	private INoteService noteService;
	private Note note;
	private int noteCd;

	/**
	 * noteCd���Ե�get����
	 * 
	 * @return the noteCd
	 */
	public int getNoteCd() {
		return noteCd;
	}

	/**
	 * noteCd���Ե�set����
	 * 
	 * @param noteCd
	 *            the noteCd to set
	 */
	public void setNoteCd(int noteCd) {
		this.noteCd = noteCd;
	}

	/**
	 * note���Ե�get����
	 * 
	 * @return the note
	 */
	public Note getNote() {
		return note;
	}

	/**
	 * note���Ե�set����
	 * 
	 * @param note
	 *            the note to set
	 */
	public void setNote(Note note) {
		this.note = note;
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

	/**
	 * addNote��������
	 * 
	 *��������
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
