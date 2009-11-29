package com.zuxia.dao;

import java.util.List;

import com.zuxia.entity.FellowNote;

public interface IFellowNoteDao {
	public boolean insertFellowNote(FellowNote fellowNote);

	public boolean updateFellowNote(FellowNote fellowNote);

	public boolean deleteFellowNote(int fellowNoteCd);

	public List<FellowNote> getFellowNotes();

	public FellowNote getFellowNoteByCd(Integer fellowNoteCd);
}
