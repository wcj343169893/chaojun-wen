package com.zuxia.service.impl;

import com.zuxia.dao.INoteDao;
import com.zuxia.service.INoteService;

/**
 * NoteServiceImpl��Ҫ˵��
 * 
 *
 * @author �ĳ���
 */
public class NoteServiceImpl implements INoteService {
	private INoteDao noteDao;

	/**
	 * noteDao���Ե�get����
	 * 
	 * @return the noteDao
	 */
	public INoteDao getNoteDao() {
		return noteDao;
	}

	/**
	 * noteDao���Ե�set����
	 * 
	 * @param noteDao
	 *            the noteDao to set
	 */
	public void setNoteDao(INoteDao noteDao) {
		this.noteDao = noteDao;
	}

}
