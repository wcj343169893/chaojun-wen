package com.zuxia.service;

import com.zuxia.entity.Note;
import com.zuxia.entity.User;
import com.zuxia.form.AddNoteForm;
import com.zuxia.form.EditNoteForm;

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

	/**
	 * delteNote�������� ɾ��
	 * 
	 * @param noteCd
	 * @return
	 */
	public boolean delteNote(int noteCd);

	/**
	 * editNote�������� �޸�
	 * 
	 * @param editNoteForm
	 * @param user
	 * @return
	 */
	public boolean editNote(EditNoteForm editNoteForm,User user);
}
