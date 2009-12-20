package com.zuxia.dto;

import com.zuxia.entity.ChildModule;
import com.zuxia.entity.Note;

public class ChileModuleDTO {
	private ChildModule childModule;
	private long noteCount;
	private long todayCount;// ����������
	private long fellowNoteCount;
	private Note lastNote;

	/**
	 * childModule���Ե�get����
	 * 
	 * @return the childModule
	 */
	public ChildModule getChildModule() {
		return childModule;
	}

	/**
	 * childModule���Ե�set����
	 * 
	 * @param childModule
	 *            the childModule to set
	 */
	public void setChildModule(ChildModule childModule) {
		this.childModule = childModule;
	}

	/**
	 * todayCount���Ե�get����
	 * 
	 * @return the todayCount
	 */
	public long getTodayCount() {
		return todayCount;
	}

	/**
	 * todayCount���Ե�set����
	 * 
	 * @param todayCount
	 *            the todayCount to set
	 */
	public void setTodayCount(long todayCount) {
		this.todayCount = todayCount;
	}

	/**
	 * noteCount���Ե�get����
	 * 
	 * @return the noteCount
	 */
	public long getNoteCount() {
		return noteCount;
	}

	/**
	 * noteCount���Ե�set����
	 * 
	 * @param noteCount
	 *            the noteCount to set
	 */
	public void setNoteCount(long noteCount) {
		this.noteCount = noteCount;
	}

	/**
	 * fellowNoteCount���Ե�get����
	 * 
	 * @return the fellowNoteCount
	 */
	public long getFellowNoteCount() {
		return fellowNoteCount;
	}

	/**
	 * fellowNoteCount���Ե�set����
	 * 
	 * @param fellowNoteCount
	 *            the fellowNoteCount to set
	 */
	public void setFellowNoteCount(long fellowNoteCount) {
		this.fellowNoteCount = fellowNoteCount;
	}

	/**
	 * lastNote���Ե�get����
	 * 
	 * @return the lastNote
	 */
	public Note getLastNote() {
		return lastNote;
	}

	/**
	 * lastNote���Ե�set����
	 * 
	 * @param lastNote
	 *            the lastNote to set
	 */
	public void setLastNote(Note lastNote) {
		this.lastNote = lastNote;
	}

}
