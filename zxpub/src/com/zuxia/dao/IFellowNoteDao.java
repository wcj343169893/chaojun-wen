package com.zuxia.dao;

import java.util.List;

import com.zuxia.common.PageInfo;
import com.zuxia.entity.FellowNote;

public interface IFellowNoteDao {
	public boolean insertFellowNote(FellowNote fellowNote);

	public boolean updateFellowNote(FellowNote fellowNote);

	public boolean deleteFellowNote(int fellowNoteCd);

	public List<FellowNote> getFellowNotes();

	public FellowNote getFellowNoteByCd(Integer fellowNoteCd);

	public FellowNote getLastFellowNote(int noteCd);

	public long getFellowNoteCount(int noteCd);

	public long getFellowNoteCount(int moduleCd, int childModuleCd);

	public List<FellowNote> getFellowNotes(int noteCd, int page);

	/**
	 * getFellowNotes ��ҳ��ʾ
	 * 
	 * @param noteCd
	 * @param pageInfo
	 * @return
	 */
	public List<FellowNote> getFellowNotes(int noteCd, PageInfo pageInfo);
}
