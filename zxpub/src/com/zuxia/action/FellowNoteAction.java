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
 * NoteAction��Ҫ˵��
 * 
 * 
 * @author �ĳ���
 */
public class FellowNoteAction extends ActionSupport {
	/**
	 * serialVersionUID���Ը���
	 * 
	 */
	private static final long serialVersionUID = -188481902986946432L;

	/**
	 * fellowNoteService���Ը���
	 * 
	 */
	private IFellowNoteService fellowNoteService;
	private FellowNoteForm fellowNoteForm;
	private EditFellowNoteForm editFellowNoteForm;
	private int fellowNoteCd;

	/**
	 * editFellowNoteForm���Ե�get����
	 * 
	 * @return the editFellowNoteForm
	 */
	public EditFellowNoteForm getEditFellowNoteForm() {
		return editFellowNoteForm;
	}

	/**
	 * editFellowNoteForm���Ե�set����
	 * 
	 * @param editFellowNoteForm
	 *            the editFellowNoteForm to set
	 */
	public void setEditFellowNoteForm(EditFellowNoteForm editFellowNoteForm) {
		this.editFellowNoteForm = editFellowNoteForm;
	}

	/**
	 * fellowNoteCd���Ե�get����
	 * 
	 * @return the fellowNoteCd
	 */
	public int getFellowNoteCd() {
		return fellowNoteCd;
	}

	/**
	 * fellowNoteCd���Ե�set����
	 * 
	 * @param fellowNoteCd
	 *            the fellowNoteCd to set
	 */
	public void setFellowNoteCd(int fellowNoteCd) {
		this.fellowNoteCd = fellowNoteCd;
	}

	/**
	 * fellowNoteService���Ե�get����
	 * 
	 * @return the fellowNoteService
	 */
	public IFellowNoteService getFellowNoteService() {
		return fellowNoteService;
	}

	/**
	 * fellowNoteService���Ե�set����
	 * 
	 * @param fellowNoteService
	 *            the fellowNoteService to set
	 */
	public void setFellowNoteService(IFellowNoteService fellowNoteService) {
		this.fellowNoteService = fellowNoteService;
	}

	/**
	 * fellowNoteForm���Ե�get����
	 * 
	 * @return the fellowNoteForm
	 */
	public FellowNoteForm getFellowNoteForm() {
		return fellowNoteForm;
	}

	/**
	 * fellowNoteForm���Ե�set����
	 * 
	 * @param fellowNoteForm
	 *            the fellowNoteForm to set
	 */
	public void setFellowNoteForm(FellowNoteForm fellowNoteForm) {
		this.fellowNoteForm = fellowNoteForm;
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
