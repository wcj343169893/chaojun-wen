package com.zuxia.dao;

import java.util.List;

import com.zuxia.entity.Note;

public interface INoteDao {
	public boolean insertNote(Note note);

	public boolean updateNote();

	public boolean deleteNote();

	public List<Note> getNotes();

	public Note getNoteByCd(Integer noteCd);
}
