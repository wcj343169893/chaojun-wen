package com.zuxia.dao;

import java.util.List;

import com.zuxia.entity.FellowNote;

public interface IFellowNoteDao {
	public boolean insertNote();

	public boolean updateNote();

	public boolean deleteNote();

	public List<FellowNote> getNotes();

	public FellowNote getFellowNoteByCd(Integer fellowNoteCd);
}
