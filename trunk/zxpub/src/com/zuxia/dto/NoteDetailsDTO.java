package com.zuxia.dto;

import java.util.List;

import com.zuxia.common.PageInfo;
import com.zuxia.entity.FellowNote;
import com.zuxia.entity.Note;

public class NoteDetailsDTO {
	private Note note;
	private List<FellowNote> fellowNotes;

	/**
	 * note���Ե�get����
	 * 
	 * @return the note
	 */
	public Note getNote() {
		return note;
	}

	/**
	 * note���Ե�set����
	 * 
	 * @param note
	 *            the note to set
	 */
	public void setNote(Note note) {
		this.note = note;
	}

	/**
	 * fellowNotes���Ե�get����
	 * 
	 * @return the fellowNotes
	 */
	public List<FellowNote> getFellowNotes() {
		return fellowNotes;
	}

	/**
	 * fellowNotes���Ե�set����
	 * 
	 * @param fellowNotes
	 *            the fellowNotes to set
	 */
	public void setFellowNotes(List<FellowNote> fellowNotes) {
		this.fellowNotes = fellowNotes;
	}

}
