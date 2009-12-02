package com.zuxia.service;

import com.zuxia.entity.Note;

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
	/**
	 * getNote方法概述
	 * 
	 *获取一个note
	 * @param noteCd
	 * @return
	 */
	public Note getOneNote(int noteCd);
}
