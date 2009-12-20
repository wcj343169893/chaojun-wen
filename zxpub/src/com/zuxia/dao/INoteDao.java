package com.zuxia.dao;

import java.util.List;

import com.zuxia.common.PageInfo;
import com.zuxia.entity.Note;

public interface INoteDao {
	public boolean insertNote(Note note);

	public boolean updateNote(Note note);

	public boolean deleteNote(int noteCd);

	public List<Note> getNotes();

	/**
	 * getNotes方法概述 分页显示
	 * 
	 * @param moduleCd
	 * @param childModuleCd
	 * @param page
	 * @return
	 */
	public List<Note> getNotes(int moduleCd, int childModuleCd, int page);
	public List<Note> getNotes(int moduleCd, int childModuleCd, PageInfo pageInfo);

	public Note getNoteByCd(Integer noteCd);

	/**
	 * getLastNote 获取此版块下的最后一条帖子
	 * 
	 * 
	 * @param moduleCd
	 * @param childModuleCd
	 * @return
	 */
	public Note getLastNote(int moduleCd, int childModuleCd);

	/**
	 * getNoteCount方法概述 查询此版块下的帖子数
	 * 
	 * @param moduleCd
	 * @param childModuleCd
	 * @return
	 */
	public int getNoteCount(int moduleCd, int childModuleCd);
	/**
	 * getNoteCountInToday方法概述 今日发帖
	 * 
	 *
	 * @param childModuleCd
	 * @return
	 */
	public int getNoteCountInToday(int childModuleCd);
}
