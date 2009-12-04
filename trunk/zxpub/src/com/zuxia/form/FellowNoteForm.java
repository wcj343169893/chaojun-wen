package com.zuxia.form;

public class FellowNoteForm {
	private int noteCd;
	private String content;
	private int moduleCd;
	private int childModuleCd;
	
	

	/**
	 * moduleCd属性的get方法
	 * @return the moduleCd
	 */
	public int getModuleCd() {
		return moduleCd;
	}

	/**
	 * moduleCd属性的set方法
	 * @param moduleCd the moduleCd to set
	 */
	public void setModuleCd(int moduleCd) {
		this.moduleCd = moduleCd;
	}

	/**
	 * childModuleCd属性的get方法
	 * @return the childModuleCd
	 */
	public int getChildModuleCd() {
		return childModuleCd;
	}

	/**
	 * childModuleCd属性的set方法
	 * @param childModuleCd the childModuleCd to set
	 */
	public void setChildModuleCd(int childModuleCd) {
		this.childModuleCd = childModuleCd;
	}

	/**
	 * noteCd属性的get方法
	 * 
	 * @return the noteCd
	 */
	public int getNoteCd() {
		return noteCd;
	}

	/**
	 * noteCd属性的set方法
	 * 
	 * @param noteCd
	 *            the noteCd to set
	 */
	public void setNoteCd(int noteCd) {
		this.noteCd = noteCd;
	}

	/**
	 * content属性的get方法
	 * 
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * content属性的set方法
	 * 
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

}
