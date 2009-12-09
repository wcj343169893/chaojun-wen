package com.zuxia.service;

import java.util.List;

import com.zuxia.common.PageInfo;
import com.zuxia.dto.NoteDTO;
import com.zuxia.dto.NoteDetailsDTO;
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
	 * getNote 获取一个note 并修改点击
	 * 
	 * @param noteCd
	 * @return
	 */
	public Note getOneNote(int noteCd);

	public Note getOneNote(int noteCd, int page);

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

	public boolean editNote(Note note);

	/**
	 * getNoteDTOs 初始化note一览表
	 * 
	 * 
	 * @param moduleCd
	 * @param childModuleCd
	 * @param pageInfo
	 * @return
	 */
	public List<NoteDTO> getNoteDTOs(int moduleCd, int childModuleCd,
			PageInfo pageInfo);

	/**
	 * getNoteDetailsDTO 获取note的详细信息和跟帖
	 * 
	 * 
	 * @param noteCd
	 * @param pageInfo
	 * @return
	 */
	public NoteDetailsDTO getNoteDetailsDTO(int noteCd, PageInfo pageInfo);
}
