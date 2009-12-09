package com.zuxia.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.entity.User;
import com.zuxia.form.AddNoteForm;
import com.zuxia.form.EditNoteForm;
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
	private AddNoteForm addNoteForm;
	private EditNoteForm editNoteForm;
	private int noteCd;
	private int page;

	/**
	 * editNoteForm���Ե�get����
	 * 
	 * @return the editNoteForm
	 */
	public EditNoteForm getEditNoteForm() {
		return editNoteForm;
	}

	/**
	 * editNoteForm���Ե�set����
	 * 
	 * @param editNoteForm
	 *            the editNoteForm to set
	 */
	public void setEditNoteForm(EditNoteForm editNoteForm) {
		this.editNoteForm = editNoteForm;
	}

	/**
	 * noteCd���Ը��� note��ʶ��
	 */

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
	 * addNoteForm���Ե�get����
	 * 
	 * @return the addNoteForm
	 */
	public AddNoteForm getAddNoteForm() {
		return addNoteForm;
	}

	/**
	 * addNoteForm���Ե�set����
	 * 
	 * @param addNoteForm
	 *            the addNoteForm to set
	 */
	public void setAddNoteForm(AddNoteForm addNoteForm) {
		this.addNoteForm = addNoteForm;
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
	 * page���Ե�get����
	 * 
	 * @return the page
	 */
	public int getPage() {
		return page;
	}

	/**
	 * page���Ե�set����
	 * 
	 * @param page
	 *            the page to set
	 */
	public void setPage(int page) {
		this.page = page;
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

	/**
	 * edit��������
	 * 
	 *�޸�����
	 * 
	 * @return
	 * @throws Exception
	 */
	public String edit() throws Exception {
		boolean flag = false;
		if (addNoteForm.getTitle() != "" && addNoteForm.getContent() != "") {
			HttpSession session = ServletActionContext.getRequest()
					.getSession();
			flag = noteService.editNote(editNoteForm, (User) session
					.getAttribute("users"));
		}
		if (!flag) {
			return "editerror";
		}
		return "success";
	}

	public String editInit() throws Exception {
		ServletActionContext.getRequest().setAttribute("note",
				noteService.getOneNote(noteCd));
		return "editInit";
	}

	/**
	 * delete��������
	 * 
	 *ɾ��
	 * 
	 * @return
	 * @throws Exception
	 */
	public String delete() throws Exception {
		boolean flag = false;
		flag = noteService.delteNote(noteCd);
		if (!flag) {
			return "deleteerror";
		}
		return "success";
	}

	/**
	 * show��������
	 * 
	 * ��ʾ
	 * 
	 * @return
	 * @throws Exception
	 */
	public String show() throws Exception {
		ServletActionContext.getRequest().setAttribute("note",
				noteService.getOneNote(noteCd, page));
		return "showNote";
	}
}
