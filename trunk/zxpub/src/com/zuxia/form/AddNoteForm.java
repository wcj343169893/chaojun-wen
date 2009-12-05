/**
 *******************************************************************************
 * AddNoteForm.java
 *
 * (c) Copyright 2009 WenChaojun
 *
 *＜所属工程名＞
 *  zxpub(足下论坛)
 *＜功能概要＞
 *  XXX
 *＜作者＞
 *  文朝军
 *******************************************************************************
 */
package com.zuxia.form;

/**
 * AddNoteForm概要说明
 * 
 * 
 * @author 文朝军
 */
public class AddNoteForm {
	private String title;
	private String content;
	private int moduleCd;
	private int childModuleCd;

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

}
