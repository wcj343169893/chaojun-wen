package com.zuxia.form;

/**
 * EditNoteForm概要说明 修改帖子
 * 
 * @author 文朝军
 */
public class EditNoteForm {
	private String title;
	private String content;
	private int moduleCd;
	private int childModuleCd;
	private int noteCd;

	/**
	 * title属性的get方法
	 * 
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * title属性的set方法
	 * 
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
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

	/**
	 * moduleCd属性的get方法
	 * 
	 * @return the moduleCd
	 */
	public int getModuleCd() {
		return moduleCd;
	}

	/**
	 * moduleCd属性的set方法
	 * 
	 * @param moduleCd
	 *            the moduleCd to set
	 */
	public void setModuleCd(int moduleCd) {
		this.moduleCd = moduleCd;
	}

	/**
	 * childModuleCd属性的get方法
	 * 
	 * @return the childModuleCd
	 */
	public int getChildModuleCd() {
		return childModuleCd;
	}

	/**
	 * childModuleCd属性的set方法
	 * 
	 * @param childModuleCd
	 *            the childModuleCd to set
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

}
