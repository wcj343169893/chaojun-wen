package com.zuxia.service;

import com.zuxia.entity.Note;
import com.zuxia.entity.User;
import com.zuxia.form.AddNoteForm;

public interface INoteService {
	/**
	 * addNote方法概述
	 * 
	 *增加帖子
	 * 
	 * @param note
	 * @return
	 */
	public boolean addNote(Note note);

	public boolean addNote(AddNoteForm addNoteForm, User user);

	/**
	 * getNote方法概述
	 * 
	 *获取一个note
	 * 
	 * @param noteCd
	 * @return
	 */
	public Note getOneNote(int noteCd);
}
