package com.zuxia.service;

import java.util.List;

import com.zuxia.dto.NoteDTO;
import com.zuxia.entity.Note;
import com.zuxia.entity.User;
import com.zuxia.form.AddNoteForm;
import com.zuxia.form.EditNoteForm;

public interface INoteService {
	/**
	 * addNote 增加帖子
	 * 
	 * @param note
	 * @return
	 */
	public boolean addNote(Note note);

	public boolean addNote(AddNoteForm addNoteForm, User user);

	/**
	 * getNote 获取一个note
	 * 
	 * @param noteCd
	 * @return
	 */
	public Note getOneNote(int noteCd);

	/**
	 * delteNote 删除
	 * 
	 * @param noteCd
	 * @return
	 */
	public boolean delteNote(int noteCd);

	/**
	 * editNote 修改
	 * 
	 * @param editNoteForm
	 * @param user
	 * @return
	 */
	public boolean editNote(EditNoteForm editNoteForm, User user);

	/**
	 * getNoteDTOs 获取noteDTO
	 * 
	 * 
	 * @param moduleCd
	 *            主版块Cd
	 * @param childModuleCd
	 *            子版块Cd
	 * @return
	 */
	public List<NoteDTO> getNoteDTOs(int moduleCd, int childModuleCd,int page);
}
