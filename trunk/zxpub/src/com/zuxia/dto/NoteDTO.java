package com.zuxia.dto;

import com.zuxia.entity.FellowNote;
import com.zuxia.entity.Note;

public class NoteDTO {
	private Note note;
	private long replayCount;
	private FellowNote lastFellowNote;

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
	 * replayCount属性的get方法
	 * 
	 * @return the replayCount
	 */
	public long getReplayCount() {
		return replayCount;
	}

	/**
	 * replayCount属性的set方法
	 * 
	 * @param replayCount
	 *            the replayCount to set
	 */
	public void setReplayCount(long replayCount) {
		this.replayCount = replayCount;
	}

	/**
	 * lastFellowNote属性的get方法
	 * 
	 * @return the lastFellowNote
	 */
	public FellowNote getLastFellowNote() {
		return lastFellowNote;
	}

	/**
	 * lastFellowNote属性的set方法
	 * 
	 * @param lastFellowNote
	 *            the lastFellowNote to set
	 */
	public void setLastFellowNote(FellowNote lastFellowNote) {
		this.lastFellowNote = lastFellowNote;
	}

}
