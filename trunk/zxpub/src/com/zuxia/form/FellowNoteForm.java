package com.zuxia.form;

public class FellowNoteForm {
	private int noteCd;
	private String content;
	private int moduleCd;
	private int childModuleCd;
	
	

	/**
	 * moduleCd���Ե�get����
	 * @return the moduleCd
	 */
	public int getModuleCd() {
		return moduleCd;
	}

	/**
	 * moduleCd���Ե�set����
	 * @param moduleCd the moduleCd to set
	 */
	public void setModuleCd(int moduleCd) {
		this.moduleCd = moduleCd;
	}

	/**
	 * childModuleCd���Ե�get����
	 * @return the childModuleCd
	 */
	public int getChildModuleCd() {
		return childModuleCd;
	}

	/**
	 * childModuleCd���Ե�set����
	 * @param childModuleCd the childModuleCd to set
	 */
	public void setChildModuleCd(int childModuleCd) {
		this.childModuleCd = childModuleCd;
	}

	/**
	 * noteCd���Ե�get����
	 * 
	 * @return the noteCd
	 */
	public int getNoteCd() {
		return noteCd;
	}

	/**
	 * noteCd���Ե�set����
	 * 
	 * @param noteCd
	 *            the noteCd to set
	 */
	public void setNoteCd(int noteCd) {
		this.noteCd = noteCd;
	}

	/**
	 * content���Ե�get����
	 * 
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * content���Ե�set����
	 * 
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

}
