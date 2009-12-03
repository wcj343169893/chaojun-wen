package com.zuxia.service.impl;

import java.util.Date;

import com.zuxia.dao.IFellowNoteDao;
import com.zuxia.entity.FellowNote;
import com.zuxia.entity.Note;
import com.zuxia.entity.User;
import com.zuxia.form.FellowNoteForm;
import com.zuxia.service.IFellowNoteService;

/**
 * FellowNoteService��Ҫ˵��
 * 
 * 
 * @author �ĳ���
 */
public class FellowNoteServiceImpl implements IFellowNoteService {
	private IFellowNoteDao fellowNotedao;

	/**
	 * fellowNotedao���Ե�get����
	 * 
	 * @return the fellowNotedao
	 */
	public IFellowNoteDao getFellowNotedao() {
		return fellowNotedao;
	}

	/**
	 * fellowNotedao���Ե�set����
	 * 
	 * @param fellowNotedao
	 *            the fellowNotedao to set
	 */
	public void setFellowNotedao(IFellowNoteDao fellowNotedao) {
		this.fellowNotedao = fellowNotedao;
	}

	@Override
	public boolean addFellowNote(FellowNoteForm fellowNoteForm, User user) {
		FellowNote fellowNote = new FellowNote();
		fellowNote.setUser(user);
		fellowNote.setPublishDate(new Date());
		fellowNote.setFlwContent(fellowNoteForm.getContent());
		Note note = new Note();
		note.setNoteCd(fellowNoteForm.getNoteCd());
		fellowNote.setNote(note);
		return fellowNotedao.insertFellowNote(fellowNote);

	}
}
