package com.zuxia.dto;

import java.util.List;

import com.zuxia.common.PageInfo;
import com.zuxia.entity.FellowNote;
import com.zuxia.entity.Note;

public class NoteDetailsDTO {
	private Note note;
	private List<FellowNote> fellowNotes;

	/**
	 * note属性的get方法
	 * 
	 * @return the note
	 */
	public Note getNote() {
		return note;
	}

	/**
	 * note属性的set方法
	 * 
	 * @param note
	 *            the note to set
	 */
	public void setNote(Note note) {
		this.note = note;
	}

	/**
	 * fellowNotes属性的get方法
	 * 
	 * @return the fellowNotes
	 */
	public List<FellowNote> getFellowNotes() {
		return fellowNotes;
	}

	/**
	 * fellowNotes属性的set方法
	 * 
	 * @param fellowNotes
	 *            the fellowNotes to set
	 */
	public void setFellowNotes(List<FellowNote> fellowNotes) {
		this.fellowNotes = fellowNotes;
	}

}
