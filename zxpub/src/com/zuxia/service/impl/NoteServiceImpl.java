package com.zuxia.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.zuxia.dao.IFellowNoteDao;
import com.zuxia.dao.INoteDao;
import com.zuxia.dto.NoteDTO;
import com.zuxia.entity.ChildModule;
import com.zuxia.entity.Module;
import com.zuxia.entity.Note;
import com.zuxia.entity.User;
import com.zuxia.form.AddNoteForm;
import com.zuxia.form.EditNoteForm;
import com.zuxia.service.INoteService;

/**
 * NoteServiceImpl概要说明
 * 
 * 
 * @author 文朝军
 */
public class NoteServiceImpl implements INoteService {
	private INoteDao noteDao;
	private IFellowNoteDao fellowNoteDao;

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

	/**
	 * fellowNoteDao属性的get方法
	 * 
	 * @return the fellowNoteDao
	 */
	public IFellowNoteDao getFellowNoteDao() {
		return fellowNoteDao;
	}

	/**
	 * fellowNoteDao属性的set方法
	 * 
	 * @param fellowNoteDao
	 *            the fellowNoteDao to set
	 */
	public void setFellowNoteDao(IFellowNoteDao fellowNoteDao) {
		this.fellowNoteDao = fellowNoteDao;
	}

	@Override
	public boolean addNote(Note note) {
		return noteDao.insertNote(note);
	}

	@Override
	public Note getOneNote(int noteCd) {
		Note note = noteDao.getNoteByCd(noteCd);
		note.setPoint(note.getPoint() + 1);
		noteDao.updateNote(note);
		return note;

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
		ChildModule childModule = new ChildModule();
		childModule.setChildModuleCd(addNoteForm.getChildModuleCd());
		note.setChildModule(childModule);
		note.setPoint(0);
		return noteDao.insertNote(note);
	}

	@Override
	public boolean delteNote(int noteCd) {
		return noteDao.deleteNote(noteCd);

	}

	@Override
	public boolean editNote(EditNoteForm editNoteForm, User user) {
		Note note = this.getOneNote(editNoteForm.getNoteCd());
		note.setUser(user);
		note.setTitle(editNoteForm.getTitle());
		note.setContent(editNoteForm.getContent());
		Module module = new Module();
		module.setModuleCd(editNoteForm.getModuleCd());
		note.setModule(module);
		ChildModule childModule = new ChildModule();
		childModule.setChildModuleCd(editNoteForm.getChildModuleCd());
		note.setChildModule(childModule);
		return noteDao.updateNote(note);
	}

	@Override
	public List<NoteDTO> getNoteDTOs(int moduleCd, int childModuleCd, int page) {
		List<NoteDTO> noteDTOs = new ArrayList<NoteDTO>();
		List<Note> notes = noteDao.getNotes(moduleCd, childModuleCd, page);
		for (Note note : notes) {
			NoteDTO noteDTO = new NoteDTO();
			noteDTO.setNote(note);
			noteDTO.setLastFellowNote(fellowNoteDao.getLastFellowNote(note
					.getNoteCd()));
			noteDTO.setReplayCount(fellowNoteDao.getFellowNoteCount(note
					.getNoteCd()));
			noteDTOs.add(noteDTO);
		}
		return noteDTOs;
	}
}
