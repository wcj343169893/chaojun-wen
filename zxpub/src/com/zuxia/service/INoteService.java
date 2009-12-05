package com.zuxia.service;

import com.zuxia.entity.Note;
import com.zuxia.entity.User;
import com.zuxia.form.AddNoteForm;

public interface INoteService {
	/**
	 * addNote��������
	 * 
	 *��������
	 * 
	 * @param note
	 * @return
	 */
	public boolean addNote(Note note);

	public boolean addNote(AddNoteForm addNoteForm, User user);

	/**
	 * getNote��������
	 * 
	 *��ȡһ��note
	 * 
	 * @param noteCd
	 * @return
	 */
	public Note getOneNote(int noteCd);
}
