/**
 *******************************************************************************
 * AddNoteForm.java
 *
 * (c) Copyright 2009 WenChaojun
 *
 *��������������
 *  zxpub(������̳)
 *�����ܸ�Ҫ��
 *  XXX
 *�����ߣ�
 *  �ĳ���
 *******************************************************************************
 */
package com.zuxia.form;

/**
 * AddNoteForm��Ҫ˵��
 * 
 * 
 * @author �ĳ���
 */
public class AddNoteForm {
	private String title;
	private String content;
	private int moduleCd;
	private int childModuleCd;

	/**
	 * moduleCd���Ե�get����
	 * 
	 * @return the moduleCd
	 */
	public int getModuleCd() {
		return moduleCd;
	}

	/**
	 * moduleCd���Ե�set����
	 * 
	 * @param moduleCd
	 *            the moduleCd to set
	 */
	public void setModuleCd(int moduleCd) {
		this.moduleCd = moduleCd;
	}

	/**
	 * childModuleCd���Ե�get����
	 * 
	 * @return the childModuleCd
	 */
	public int getChildModuleCd() {
		return childModuleCd;
	}

	/**
	 * childModuleCd���Ե�set����
	 * 
	 * @param childModuleCd
	 *            the childModuleCd to set
	 */
	public void setChildModuleCd(int childModuleCd) {
		this.childModuleCd = childModuleCd;
	}

	/**
	 * title���Ե�get����
	 * 
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * title���Ե�set����
	 * 
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
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
