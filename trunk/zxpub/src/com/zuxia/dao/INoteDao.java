package com.zuxia.dao;

import java.util.List;

import com.zuxia.entity.Note;

public interface INoteDao {
	public boolean insertNote(Note note);

	public boolean updateNote(Note note);

	public boolean deleteNote(int noteCd);

	public List<Note> getNotes();

	public Note getNoteByCd(Integer noteCd);
}
