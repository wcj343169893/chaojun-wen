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
	 * getNotes�������� ��ҳ��ʾ
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
	 * getLastNote ��ȡ�˰���µ����һ������
	 * 
	 * 
	 * @param moduleCd
	 * @param childModuleCd
	 * @return
	 */
	public Note getLastNote(int moduleCd, int childModuleCd);

	/**
	 * getNoteCount�������� ��ѯ�˰���µ�������
	 * 
	 * @param moduleCd
	 * @param childModuleCd
	 * @return
	 */
	public int getNoteCount(int moduleCd, int childModuleCd);
	/**
	 * getNoteCountInToday�������� ���շ���
	 * 
	 *
	 * @param childModuleCd
	 * @return
	 */
	public int getNoteCountInToday(int childModuleCd);
}
