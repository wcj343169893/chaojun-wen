package com.zuxia.dto;

import com.zuxia.entity.ChildModule;
import com.zuxia.entity.Note;

public class ChileModuleDTO {
	private ChildModule childModule;
	private long noteCount;
	private long todayCount;// 今日帖子数
	private long fellowNoteCount;
	private Note lastNote;

	/**
	 * childModule属性的get方法
	 * 
	 * @return the childModule
	 */
	public ChildModule getChildModule() {
		return childModule;
	}

	/**
	 * childModule属性的set方法
	 * 
	 * @param childModule
	 *            the childModule to set
	 */
	public void setChildModule(ChildModule childModule) {
		this.childModule = childModule;
	}

	/**
	 * todayCount属性的get方法
	 * 
	 * @return the todayCount
	 */
	public long getTodayCount() {
		return todayCount;
	}

	/**
	 * todayCount属性的set方法
	 * 
	 * @param todayCount
	 *            the todayCount to set
	 */
	public void setTodayCount(long todayCount) {
		this.todayCount = todayCount;
	}

	/**
	 * noteCount属性的get方法
	 * 
	 * @return the noteCount
	 */
	public long getNoteCount() {
		return noteCount;
	}

	/**
	 * noteCount属性的set方法
	 * 
	 * @param noteCount
	 *            the noteCount to set
	 */
	public void setNoteCount(long noteCount) {
		this.noteCount = noteCount;
	}

	/**
	 * fellowNoteCount属性的get方法
	 * 
	 * @return the fellowNoteCount
	 */
	public long getFellowNoteCount() {
		return fellowNoteCount;
	}

	/**
	 * fellowNoteCount属性的set方法
	 * 
	 * @param fellowNoteCount
	 *            the fellowNoteCount to set
	 */
	public void setFellowNoteCount(long fellowNoteCount) {
		this.fellowNoteCount = fellowNoteCount;
	}

	/**
	 * lastNote属性的get方法
	 * 
	 * @return the lastNote
	 */
	public Note getLastNote() {
		return lastNote;
	}

	/**
	 * lastNote属性的set方法
	 * 
	 * @param lastNote
	 *            the lastNote to set
	 */
	public void setLastNote(Note lastNote) {
		this.lastNote = lastNote;
	}

}
