package com.zuxia.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zuxia.common.EPage;
import com.zuxia.common.PageInfo;
import com.zuxia.entity.User;
import com.zuxia.form.AddNoteForm;
import com.zuxia.form.EditNoteForm;
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
	private EditNoteForm editNoteForm;
	private int gotoPage;
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

	/**
	 * editNoteForm属性的get方法
	 * 
	 * @return the editNoteForm
	 */
	public EditNoteForm getEditNoteForm() {
		return editNoteForm;
	}

	/**
	 * editNoteForm属性的set方法
	 * 
	 * @param editNoteForm
	 *            the editNoteForm to set
	 */
	public void setEditNoteForm(EditNoteForm editNoteForm) {
		this.editNoteForm = editNoteForm;
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

	/**
	 * edit方法概述
	 * 
	 *修改帖子
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
		ServletActionContext.getRequest().setAttribute(
				"note",
				noteService.getOneNote(Integer.valueOf(ServletActionContext
						.getRequest().getSession().getAttribute("noteCd")
						.toString())));
		return "editInit";
	}

	/**
	 * delete方法概述
	 * 
	 *删除
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

	public String nextPage() throws Exception {
		anyOnePage(1, EPage.next);
		return "showNote";
	}

	public String backPage() throws Exception {
		anyOnePage(-1, EPage.back);
		return "showNote";
	}

	public String firstPage() throws Exception {
		anyOnePage(1, EPage.first);
		return "showNote";
	}

	public String lastPage() throws Exception {
		anyOnePage(1, EPage.last);
		return "showNote";
	}

	public String goPage() throws Exception {
		anyOnePage(gotoPage, EPage.go);
		return "showNote";
	}

	public void anyOnePage(int pages, EPage epage) {
		PageInfo pageInfo = (PageInfo) ServletActionContext.getRequest()
				.getSession().getAttribute("noteDetailsPageInfo");
		if (epage.equals(EPage.back) || epage.equals(EPage.next)) {
			pageInfo.setCurrentPage(pageInfo.getCurrentPage() + pages);
		} else if (epage.equals(EPage.first)) {
			pageInfo.setCurrentPage(1);
		} else if (epage.equals(EPage.last)) {
			pageInfo.setCurrentPage(pageInfo.getPageCount());
		} else {
			pageInfo.setCurrentPage(pages);
		}
		int noteCd = Integer.valueOf(ServletActionContext.getRequest()
				.getSession().getAttribute("noteCd").toString());
		ServletActionContext.getRequest().setAttribute("noteDetailsDTO",
				noteService.getNoteDetailsDTO(noteCd, pageInfo));
		ServletActionContext.getRequest().getSession().setAttribute(
				"noteDetailsPageInfo", pageInfo);
	}
}
