package com.zuxia.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.entity.User;
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

	public String delete() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
}
