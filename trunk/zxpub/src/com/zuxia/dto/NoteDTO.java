package com.zuxia.dto;

import com.zuxia.entity.FellowNote;
import com.zuxia.entity.Note;

public class NoteDTO {
	private Note note;
	private long replayCount;
	private FellowNote lastFellowNote;

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
	 * replayCount���Ե�get����
	 * 
	 * @return the replayCount
	 */
	public long getReplayCount() {
		return replayCount;
	}

	/**
	 * replayCount���Ե�set����
	 * 
	 * @param replayCount
	 *            the replayCount to set
	 */
	public void setReplayCount(long replayCount) {
		this.replayCount = replayCount;
	}

	/**
	 * lastFellowNote���Ե�get����
	 * 
	 * @return the lastFellowNote
	 */
	public FellowNote getLastFellowNote() {
		return lastFellowNote;
	}

	/**
	 * lastFellowNote���Ե�set����
	 * 
	 * @param lastFellowNote
	 *            the lastFellowNote to set
	 */
	public void setLastFellowNote(FellowNote lastFellowNote) {
		this.lastFellowNote = lastFellowNote;
	}

}
