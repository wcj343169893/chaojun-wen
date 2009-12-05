package com.zuxia.service.impl;

import com.zuxia.dao.INoteDao;
import com.zuxia.entity.ChildModule;
import com.zuxia.entity.Module;
import com.zuxia.entity.Note;
import com.zuxia.entity.User;
import com.zuxia.form.AddNoteForm;
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

	@Override
	public boolean addNote(Note note) {
		return noteDao.insertNote(note);
	}

	@Override
	public Note getOneNote(int noteCd) {
		return noteDao.getNoteByCd(noteCd);

	}

	@Override
	public boolean addNote(AddNoteForm addNoteForm, User user) {
		Note note = new Note();
		note.setUser(user);
		note.setTitle(addNoteForm.getTitle());
		note.setContent(addNoteForm.getContent());
		Module module = new Module();
		module.setModuleCd(addNoteForm.getModuleCd());
		note.setModule(module);
		ChildModule childModule=new ChildModule();
		childModule.setChildModuleCd(addNoteForm.getChildModuleCd());
		note.setChildModule(childModule);
		return noteDao.insertNote(note);
	}

}
