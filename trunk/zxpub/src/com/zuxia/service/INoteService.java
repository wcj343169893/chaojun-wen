package com.zuxia.service;

import com.zuxia.entity.Note;
import com.zuxia.entity.User;
import com.zuxia.form.AddNoteForm;
import com.zuxia.form.EditNoteForm;

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

	/**
	 * delteNote方法概述 删除
	 * 
	 * @param noteCd
	 * @return
	 */
	public boolean delteNote(int noteCd);

	/**
	 * editNote方法概述 修改
	 * 
	 * @param editNoteForm
	 * @param user
	 * @return
	 */
	public boolean editNote(EditNoteForm editNoteForm,User user);
}
