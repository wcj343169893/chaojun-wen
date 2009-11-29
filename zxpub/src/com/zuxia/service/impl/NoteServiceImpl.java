package com.zuxia.service.impl;

import com.zuxia.dao.INoteDao;
import com.zuxia.service.INoteService;

/**
 * NoteServiceImpl概要说明
 * 
 *
 * @author 文朝军
 */
public class NoteServiceImpl implements INoteService {
	private INoteDao noteDao;

	/**
	 * noteDao属性的get方法
	 * 
	 * @return the noteDao
	 */
	public INoteDao getNoteDao() {
		return noteDao;
	}

	/**
	 * noteDao属性的set方法
	 * 
	 * @param noteDao
	 *            the noteDao to set
	 */
	public void setNoteDao(INoteDao noteDao) {
		this.noteDao = noteDao;
	}

}
