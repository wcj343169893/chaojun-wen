package com.zuxia.entity;

// Generated 2009-11-25 11:12:27 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * FellowNote generated by hbm2java
 */
public class FellowNote implements java.io.Serializable {

	private Integer fellowNoteCd;
	private Integer ownerNoteCd;
	private Integer flwUserCd;
	private String flwContent;
	private Date publishDate;

	public FellowNote() {
	}

	public FellowNote(Integer ownerNoteCd, Integer flwUserCd,
			String flwContent, Date publishDate) {
		this.ownerNoteCd = ownerNoteCd;
		this.flwUserCd = flwUserCd;
		this.flwContent = flwContent;
		this.publishDate = publishDate;
	}

	public Integer getFellowNoteCd() {
		return this.fellowNoteCd;
	}

	public void setFellowNoteCd(Integer fellowNoteCd) {
		this.fellowNoteCd = fellowNoteCd;
	}

	public Integer getOwnerNoteCd() {
		return this.ownerNoteCd;
	}

	public void setOwnerNoteCd(Integer ownerNoteCd) {
		this.ownerNoteCd = ownerNoteCd;
	}

	public Integer getFlwUserCd() {
		return this.flwUserCd;
	}

	public void setFlwUserCd(Integer flwUserCd) {
		this.flwUserCd = flwUserCd;
	}

	public String getFlwContent() {
		return this.flwContent;
	}

	public void setFlwContent(String flwContent) {
		this.flwContent = flwContent;
	}

	public Date getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

}
