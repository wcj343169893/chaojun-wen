package com.zuxia.service;

import com.zuxia.entity.Note;

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
	/**
	 * getNote��������
	 * 
	 *��ȡһ��note
	 * @param noteCd
	 * @return
	 */
	public Note getOneNote(int noteCd);
}
