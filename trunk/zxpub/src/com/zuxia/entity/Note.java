package com.zuxia.entity;

// Generated 2009-11-23 12:07:21 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * Note generated by hbm2java
 */
public class Note implements java.io.Serializable {

	private Integer noteCd;
	private Integer pubUserCd;
	private Integer moduleCd;
	private Integer childModuleCd;
	private String title;
	private String content;
	private Date publishDate;

	public Note() {
	}

	public Note(Integer pubUserCd, Integer moduleCd, Integer childModuleCd,
			String title, String content, Date publishDate) {
		this.pubUserCd = pubUserCd;
		this.moduleCd = moduleCd;
		this.childModuleCd = childModuleCd;
		this.title = title;
		this.content = content;
		this.publishDate = publishDate;
	}

	public Integer getNoteCd() {
		return this.noteCd;
	}

	public void setNoteCd(Integer noteCd) {
		this.noteCd = noteCd;
	}

	public Integer getPubUserCd() {
		return this.pubUserCd;
	}

	public void setPubUserCd(Integer pubUserCd) {
		this.pubUserCd = pubUserCd;
	}

	public Integer getModuleCd() {
		return this.moduleCd;
	}

	public void setModuleCd(Integer moduleCd) {
		this.moduleCd = moduleCd;
	}

	public Integer getChildModuleCd() {
		return this.childModuleCd;
	}

	public void setChildModuleCd(Integer childModuleCd) {
		this.childModuleCd = childModuleCd;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

}
